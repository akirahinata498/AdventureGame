package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;

public class PreFinals extends StoryEvents{

    PreFinals(DifficultyMode difficulty) {
        super(difficulty);
        
    }

    @Override
    public double quizzes(WrittenQuestions[] questions, Scanner scan) {
            System.out.println("Good morning class we will now start our quiz so prepare your paper and pen");
      WrittenQuestions quizHandler = new WrittenQuestions();
      double totalQuizScores = quizHandler.processQuestion(questions, scan, quizDuration());
      System.out.println("Congratulations you got a total of: " + totalQuizScores + " from the quiz, keep up the good work");
      return totalQuizScores;
    }

    @Override
    public double examination(WrittenQuestions[] examQuestions, Scanner scan) {
            this.narrate(new String[] {
                "Now is the nearing end of this semester yet so many things did Akhito experience and learned",
                "He is starting to adapt to his everyday life of working and learning at school",
                "Yet regardless of this he still manage to give a time for his advance studies to enhance his learning capability",
                "Now the time for the examination will now begin"
            });
      System.out.println("Good morning class we will now start our quiz so prepare your paper and pen");
      WrittenQuestions examHandler = new WrittenQuestions();
      examHandler.setTotalScore(examHandler.processQuestion(examQuestions, scan, quizDuration()));
      System.out.println("Congratulations you got a total of: " + examHandler.getTotalScore() + " from the examination, keep up the good work");
      return examHandler.getTotalScore();
    }

    @Override
    public double recitation(RecitationQuestions[] questions, Scanner scan) {
            System.out.println("Now that we are done with our lessons let us now start our Q/A ");
                  RecitationQuestions recitationHandler = new RecitationQuestions();
                  recitationHandler.setTotalScore(recitationHandler.processQuestion(questions, scan, quizDuration()));  
                  System.out.println("Congratulations you got a total of: " + recitationHandler.getTotalScore() + " from the recitation, keep up the good work");
            return recitationHandler.getTotalScore();
    }

 
}
