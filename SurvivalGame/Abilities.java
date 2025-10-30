package AdventureGame.SurvivalGame;

public abstract class Abilities<C extends Hero, T extends Hero> implements AbilityEffect<C, T> {
    private String ability;

    private String description;
    private boolean isUltimate;
    private double cooldown;
    private long lastUsedTime;

    Abilities(String ability, String description,  boolean isUltimate, double cooldown) {
        this.ability = ability;
        this.description = description;
        this.isUltimate = isUltimate;
        this.cooldown = cooldown;
        this.lastUsedTime = 0;
    }


    public boolean isInCooldown() {
        return (System.currentTimeMillis() - lastUsedTime) < cooldown * 1000;
    }

    public void skillActivated() {
        this.lastUsedTime = System.currentTimeMillis();
    }
    //getters
    public String getAbility() {
        return ability;
    }

    public String getDescription() {
        return description;
    }
    public boolean getIsUltimate() {
        return isUltimate;
    }
    public double getCooldown() {
        return cooldown;
    }

    public double getRemainingCooldown() {
    long elapsed = System.currentTimeMillis() - lastUsedTime;
        double remaining = (cooldown * 1000 - elapsed) / 1000.0;
        return Math.max(0, remaining);
    }
    @Override
    public String toString() {
        return getAbility();
    }
    
}
