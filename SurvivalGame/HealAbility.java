package AdventureGame.SurvivalGame;

public class HealAbility<C extends Hero, T extends Hero> extends Abilities<C, T>{
    private int heal;
    
    HealAbility(String ability, String description, boolean isUltimate, double cooldown, int heal) {
        super(ability,  description, isUltimate, cooldown);
        this.heal = heal;
    }

    @Override
    public void activate(C caster, T target) {
          if (isInCooldown()) {
            System.out.println("Skill is still on cooldown");
        }
        else {
       System.out.println( caster.getName() + " used " + getAbility());
       caster.heal(heal);
        }
       
    }

    //getters   
    public int getHeal() {
        return heal;
    }
    
}
