package AdventureGame.StoryGame;
import java.util.Scanner;
public class WrittenQuestions extends Questions implements CalculateActScore<WrittenQuestions>{

    WrittenQuestions(String questionName, String correctAnswer, int pointsGiven) {
        super(questionName, correctAnswer, pointsGiven);
    }
    WrittenQuestions() {

    }

    @Override
    public double processQuestion(WrittenQuestions[] question, Scanner scan, int timeLimit) {
         int totalRecitationScores = 0;
         timeLimit *= 1000;
             for (WrittenQuestions recitationQuestions : question) {
            System.out.print(recitationQuestions.getQuestionName() );
            long startTime = System.currentTimeMillis();
            String writtenAnswer = scan.nextLine();
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            if (elapsedTime > timeLimit) {
            System.out.println("⏰ Time's up! No score for this question.");
            continue;
        }
        if (!writtenAnswer.isEmpty()) {
            writtenAnswer = writtenAnswer.substring(0, 1).toUpperCase() + writtenAnswer.substring(1);
        }
                if (recitationQuestions.getCorrectAnswer().equals(writtenAnswer)) {
                    System.out.println("Correct Answer");
                    totalRecitationScores+=recitationQuestions.getPointsGiven();
                    System.out.println("Score now are " + totalRecitationScores);
                }
                else {
                    System.out.println("Incorrect Answer");
                }
        }
        return totalRecitationScores;
    }
    
}
