package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;

public class Midterm extends StoryEvents{

    Midterm(DifficultyMode difficulty) {
        super(difficulty);
    }

    @Override
    public double quizzes(WrittenQuestions[] questions, Scanner scan) {
              this.narrate(new String[] {
            "Armed with the first experience he gained throughout the first period of this semester he valiantly faced more obstacles and absorb more knowledge",
            "Working student is surely hard knowing that his family and his future relies on his decision",
            "Still continously adapting though the combined hardships of college and working student",
            "Days pass after finishing most of his works not is the time again for another quiz"
        });
        System.out.println("Good morning class today we are going to have another quiz today so prepare a sheet of paper and a pen");
        WrittenQuestions quizHandler = new WrittenQuestions();
        quizHandler.setTotalScore(quizHandler.processQuestion(questions, scan, recitationDuration()));
        System.out.println("Congratulations you got a total of: " + quizHandler.getTotalScore() + " from the quiz, keep up the good work");
        return quizHandler.getTotalScore();
    }

    @Override
    public double examination(WrittenQuestions[] examQuestions, Scanner scan) {
          System.out.println("Good morning class this will be your first test this semester. So before we start kindly bring out your blue form and pen after 30 minutes the exam will begin use the remaining time to review.");
        WrittenQuestions examHandler = new WrittenQuestions();
        double totalExamScores = examHandler.processQuestion(examQuestions, scan, quizDuration());
        System.out.println("Congratulations you got a total of " + totalExamScores + " in your examination, keep up the good work");
        return totalExamScores;
    }

    @Override   
    public double recitation(RecitationQuestions[] questions, Scanner scan) {
      System.out.println("Now that we are done with our discussions now we will start our recitation Q/A");
      RecitationQuestions recitationHandler = new RecitationQuestions();
      recitationHandler.setTotalScore(recitationHandler.processQuestion(questions, scan, quizDuration()));  
      System.out.println("Congratulations you got a total of: " + recitationHandler.getTotalScore() + " from the recitation, keep up the good work");
      return recitationHandler.getTotalScore();
    }

    
}
