package AdventureGame;
import java.util.Scanner;

import AdventureGame.StoryGame.StoryGameManager;
import AdventureGame.SurvivalGame.Abilities;
import AdventureGame.SurvivalGame.SurvivalGameManager;
//this wwill serve as just the main class of the program
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
      boolean isRunning = true;
      System.out.print("Enter your name: ");
      String username = scan.nextLine();
      StoryGameManager storyManager = new StoryGameManager();
      SurvivalGameManager survivalManager = new SurvivalGameManager();
      int gameScores = 0;
      while (isRunning) {
        System.out.println("Welcome " + username);
        System.out.println("Press  1 or 2 to select your game mode.");
        System.out.println("1 - Story");
        System.out.println("2 - Survival");
        System.out.println("3 - View Total Scores");
        System.out.println("4 - Exit Program");
        int gameModeChoose = scan.nextInt();
        switch (gameModeChoose) {
            case 1 -> gameScores += storyManager.startGame(scan);
            case 2 -> gameScores += survivalManager.startGame(scan);
            case 3 -> System.out.println("Your current score are " + gameScores);
            case 4 -> isRunning = false;
            default -> System.out.println("Please enter only from the choices given");
        }
      }
        System.out.println("Exiting Program...");
        System.out.println("Goodbye");
    }
}
