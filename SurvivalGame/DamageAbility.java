package AdventureGame.SurvivalGame;

public class DamageAbility<C extends Hero, T extends Hero> extends Abilities<C, T>{
    private int damage;
    private String damageType;
    private long endTime;
    DamageAbility(String ability,  String description, boolean isUltimate, double cooldown, int damage) {
        super(ability,  description, isUltimate, cooldown);
        this.damage = damage;

    }

    @Override
    public void activate(C caster, T target) {
        if (isInCooldown()) {
            System.out.println("Skill is still on cooldown");
        }
        else {
        System.out.println(caster.getName() + " used " + this.getAbility());
        target.takeDamage(this.getDamage());
        skillActivated();
        }
    }

    //gettters 
    public int getDamage() {
        return damage;
    }
    public String getDamageType() {
        return damageType;
    }
 
    

}
