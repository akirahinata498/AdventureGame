package AdventureGame.StoryGame;

import java.util.Scanner;

public class RecitationQuestions extends Questions implements CalculateActScore<RecitationQuestions>{
    private String correctAnswerResponse;
    private String incorrectAnswerResponse;

        RecitationQuestions(String questionName, String correctAnswer, int pointsGiven, String correctAnswerResponse, String incorrectAnswerResponse) {
        super(questionName, correctAnswer, pointsGiven);
        this.correctAnswerResponse = correctAnswerResponse;
        this.incorrectAnswerResponse = incorrectAnswerResponse;
    }
    RecitationQuestions() {
    }
    
    //getters
        public String getCorrectResponse() {
        return correctAnswerResponse;
    }
    public String getIncorrectResponse() {
        return incorrectAnswerResponse;
    }
    
    @Override
    public double processQuestion(RecitationQuestions[] question, Scanner scan, int timeLimit) {
       int totalRecitationScores = 0;
       timeLimit *= 1000;
             for (RecitationQuestions recitationQuestions : question) {
            System.out.print(recitationQuestions.getQuestionName() + ": ");
                        long startTime = System.currentTimeMillis();
            String reciteAnswer = scan.nextLine();  
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
        if (elapsedTime > timeLimit) {
            System.out.println("⏰ Time's up! No score for this question.");
            continue;
        }
        else {
          if (!reciteAnswer.isEmpty()) {
            reciteAnswer = reciteAnswer.substring(0, 1).toUpperCase() + reciteAnswer.substring(1);
        }
                if (recitationQuestions.getCorrectAnswer().equals(reciteAnswer)) {
                    totalRecitationScores+=recitationQuestions.getPointsGiven();
                    System.out.println(recitationQuestions.getCorrectResponse());
                }
                else {
                    System.out.println(recitationQuestions.getIncorrectResponse());
                }
        }
  
        }
        return totalRecitationScores;
    }
}
