package AdventureGame.GameMechanics;
import java.util.Scanner;
public interface GameMechanics {
  
    DifficultyMode chooseLevel(Scanner scan);
    void narrate();
    int computeGameScore();
    int startGame(Scanner scan);
}
