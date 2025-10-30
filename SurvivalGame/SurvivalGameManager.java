package AdventureGame.SurvivalGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;
import AdventureGame.GameMechanics.GameEngine;
import java.util.Arrays;

public class SurvivalGameManager extends GameEngine implements Survival{
 
    private int enemiesDefeated;
    @Override
    public DifficultyMode chooseLevel(Scanner scan) {
        System.out.println("1 - Commander");
        System.out.println("2 - Dictator ");
        System.out.println("3 - Emperor");
         System.out.print("Enter the difficulty that you want: ");
        int chooseDifficulty = scan.nextInt();
        scan.nextLine();
        DifficultyMode difficultyChosen = DifficultyMode.values()[chooseDifficulty - 1];
        return difficultyChosen;
    }

   

    @Override
    public int computeTotalWins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeTotalWins'");
    }

    @Override
    public void narrate() {
try {
    String[] narrationSentences = {"The world once dreamed of peace... but the dream burned to ashes.", 
                                    "In the aftermath of ambition and fear, nations turned their eyes toward domination.",
                                    "One spark… and the world ignited.",
                                    "From the ashes of empires rose new titans — bound by pride, ideology, and vengeance.",
                                    "The Allies fought for freedom.",
                                    "The Axis fought for power.",
                                    "A Brutal War that will shape the modern world and destiny of mankind",
                                    "Cities crumbled beneath steel rain.",
                                    "Oceans turned black with oil and blood.",
                                    "The blue skies turned black and red with the destruction of their enemies",
                                    "Men became weapons.",
                                    "Leaders became legends.",
                                    "And the world... becomes a stagin ground for the great conflict",
                                    "But one questions still remains",
                                    "Who will win",
                                    "Who will decide the fate of the world",
                                    "A battle that will decide the fate of this world",
                                    "Let battle be joined"
                                };
    for (String narrate : narrationSentences) {
        Thread.sleep(100);
        System.out.println(narrate);
    }
    Thread.sleep(200);
} catch (InterruptedException e) {
    e.printStackTrace();
}
    }

    @Override
    public PlayerHero chooseHeroLeader(Scanner scan, String powerType) {
    boolean isHeroFound = false;
    String chooseLeader = "";
    while (!isHeroFound) {
       
       
        for (WorldLeader listWorldLeader : WorldLeader.values()) {
            if (listWorldLeader.getPowerType().equals(powerType)) {
System.out.println(listWorldLeader.getName() + " from the country of " + listWorldLeader.getCountry() +  " his abilities are " + Arrays.toString(listWorldLeader.getAbilities()));
            }
            
        }
         System.out.print("Enter the last name of your hero leader: ");
        chooseLeader = scan.nextLine();
        for (WorldLeader heroLeader : WorldLeader.values()) {
            if (heroLeader.getPowerType().equals(powerType) && heroLeader.getName().equals(chooseLeader))  {
                System.out.println(heroLeader.getName() + " has been chosen");
                  isHeroFound = true;
                return new PlayerHero(heroLeader, scan);
            }
        }
        if (!isHeroFound) {
            System.out.println("Please choose only from the hero given");
        }
        }
        return null;
    }

    @Override
    public String choosePower(Scanner scan) {
        boolean isRunning = true;
        String powerChosen  = "";
        while (isRunning) {
        System.out.println("Enter the power that you want to join: ");
        System.out.println("AXIS");
        System.out.println("ALLIES");
         powerChosen = scan.nextLine().toUpperCase();
        if (!powerChosen.equals("AXIS") && !powerChosen.equals("ALLIES")) {
            System.out.println("Please enter AXIS or ALLIES only");
            continue;
            }
            else {
                isRunning = false;
            }
        }
        return powerChosen;
    }



    @Override
    public int computeGameScore() {
        int totalGameScore =  (35 * getEnemiesDefeated());
        return totalGameScore;
    }





    @Override
    public void startBattle(Scanner scan, PlayerHero playerHero, String powerType) {
        Enemy[] enemyToBattle = new Enemy[3];
        int enemyCount = 0;
        boolean isPlayerTurn = true;
        int enemyDefeated = 0;
           for (WorldLeader enemyHero : WorldLeader.values()) {
            if (!enemyHero.getPowerType().equals(powerType))  {
                System.out.println(enemyHero);
                enemyToBattle[enemyCount] = new Enemy(enemyHero, getDifficulty());
                enemyCount++;
            }
        }
        for(int i = 0; i < enemyToBattle.length; i++) {
            System.out.println("The first enemy to battle are " +enemyToBattle[i].getName());
             while (playerHero.getCurrentHealth() > 0 && enemyToBattle[i].getCurrentHealth() > 0) {
                if (isPlayerTurn) {
                playerHero.heroAssault(playerHero, enemyToBattle[i]);
                System.out.println("The current health of enemy are " + enemyToBattle[i].getCurrentHealth());
                isPlayerTurn = false;
                delayBattle();
                }
                else {
                    enemyToBattle[i].heroAssault(playerHero, enemyToBattle[i]);
                    isPlayerTurn = true;
                    delayBattle();
                }
                if (playerHero.getCurrentHealth() <= 0) {
                    System.out.println("Sorry you lost your total accumulated score are " + computeGameScore());
                    break;
                }
                else if (enemyToBattle[i].getCurrentHealth() <= 0) {
                    System.out.println("You won round " + (i + 1) + " you will be given an additional score of 35");
                   setEnemiesDefeated(getEnemiesDefeated()+1);  
                }
             }
        }
        if (enemiesDefeated > 0) {
            System.out.println("Congratulations for defeating at least " + getEnemiesDefeated() + " World Leader" + " Your total points are " + computeGameScore());
        }

    }



public int getEnemiesDefeated() {
    return enemiesDefeated;
}
public void setEnemiesDefeated(int enemiesDefeated) {
    this.enemiesDefeated = enemiesDefeated;
}
    @Override
    public int startGame(Scanner scan) {
       setDifficulty( this.chooseLevel(scan));
        this.narrate();
       String power = this.choosePower(scan);
       PlayerHero hero = this.chooseHeroLeader(scan, power);
       this.startBattle(scan, hero, power);
        return computeGameScore();
    }
    public void delayBattle() {
                        try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
}
