package AdventureGame.GameMechanics;
import java.util.Scanner;
public abstract class GameEngine implements GameMechanics{
    private DifficultyMode difficulty;
    public String inputName(Scanner scan) {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        return name;
    }

    public int computeTotalWins() {
        return 1; 
    }
    
    public boolean isProgramRunning(Scanner scan) {
        return false;
    }

    public DifficultyMode getDifficulty() {
        return difficulty;  
    }

    public void setDifficulty(DifficultyMode difficulty) {
        this.difficulty = difficulty;
    }
}
