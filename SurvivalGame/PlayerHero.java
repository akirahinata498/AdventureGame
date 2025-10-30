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
        System.out.println("Enter your attack input: ");
        System.out.println("9 - for basic attack");
        System.out.println("1 - for " + character.getAbilities()[0]);
        System.out.println("2 - for " + character.getAbilities()[1]);
        System.out.println("3 - for " + character.getAbilities()[2]);
        System.out.println("4 - for " + character.getAbilities()[3]);
        int chooseAttack = scan.nextInt();
        if (chooseAttack == 9) {
            enemy.takeDamage(character.getAttackDamage());
        }
        else {
             @SuppressWarnings("unchecked")
             Abilities<PlayerHero, Enemy> chosen = character.getAbilities()[chooseAttack-1];
            chosen.activate(character, enemy);
        }
    }
    
}
