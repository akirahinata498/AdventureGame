package AdventureGame.SurvivalGame;

public class BuffAbility<C extends Hero, T extends Hero> extends Abilities<C, T>{
    private int buffAmount;
    private int buffDuration;
    BuffAbility(String ability, String description, boolean isUltimate, double cooldown,  int buffAmount, int buffDuration) {
        super(ability,  description, isUltimate, cooldown);
   
        this.buffAmount = buffAmount;
        this.buffDuration = buffDuration;
    }

    @Override
    public void activate(C caster, T target) {
        System.out.println("The attack damage of hero are " + caster.getAttackDamage());
        System.out.println("After combination are " + (caster.getAttackDamage() + buffAmount));
        if (isInCooldown()) {
            System.out.println("Skill is still on cooldown");
            }
            else {
               System.out.println(caster.getName() + " used " + getAbility()); 
                caster.setAttackDamage(caster.getAttackDamage() + buffAmount);
               new Thread(() -> {
                try {
                    Thread.sleep(getBuffDuration());
                    caster.setAttackDamage(caster.getAttackDamage() - buffAmount);
                    System.out.println(caster.getName() + " " + getAbility() + " ability duration is now done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               }).start();
            }
    }
        
//getters
public int getBuffAmount() {
    return buffAmount;
}
public int getBuffDuration() {
    return buffDuration * 1000;
}



}
