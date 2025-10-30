package AdventureGame.SurvivalGame;
import java.util.Scanner;
public class PlayerHero extends Hero{
    private Scanner scan;
    PlayerHero(WorldLeader worldLeader, Scanner scan) {
        super(worldLeader);
        this.scan = scan;
    }
    PlayerHero() {
        
    }
    
    @Override
    public void dialogue(Hero character, String[] dialogue) {
                
    }

    @Override
    public void heroAssault(PlayerHero character, Enemy enemy) {
        boolean isRunning = true;
        while (isRunning) {
        System.out.println("Enter your attack input: ");
        System.out.println("9 - for basic attack");
        for (int i = 0; i < character.getAbilities().length; i++ ){
            System.out.println((i+1) + " " + " - for " + character.getAbilities()[i] + " " + character.getAbilities()[i].getDescription() + " Cooldown are " + character.getAbilities()[i].getCooldown());
        }
        System.out.println("5 - for viewing your currenthealth");
        System.out.println("6 - for viewing your enemyhealth");
        int chooseAttack = scan.nextInt();
        if (chooseAttack == 9) {
            enemy.takeDamage(character.getAttackDamage());
             break;
        }
        else if (chooseAttack <= character.getAbilities().length && chooseAttack >= 1) {
             @SuppressWarnings("unchecked")
             Abilities<PlayerHero, Enemy> chosen = character.getAbilities()[chooseAttack-1];
            chosen.activate(character, enemy);
            break;
        }
        else if (chooseAttack == 5) {
            System.out.println(character.getName() + " current health are " + character.getCurrentHealth());
        }
        else if (chooseAttack == 6) {
             System.out.println(enemy.getName() + " current health are " + enemy.getCurrentHealth());
        }
        else {
            System.out.println("Please enter only from the choices given");
        }
        }
    }
    
}
