package AdventureGame.StoryGame;
import java.util.Scanner;
public interface SchoolEvents {
 
    double quizzes(WrittenQuestions[] questions,  Scanner scan);
    double examination(WrittenQuestions[] questions, Scanner scan);
    double recitation(RecitationQuestions[] questions, Scanner scan);
    
}
