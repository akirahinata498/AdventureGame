package AdventureGame.StoryGame;
import java.util.Scanner;
public interface CalculateActScore<T extends Questions> {
    double processQuestion(T[] question, Scanner scan, int timeLimit);
}
