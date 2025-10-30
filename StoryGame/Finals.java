package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;

public class Finals extends StoryEvents{

    Finals(DifficultyMode difficulty) {
        super(difficulty);
    }

    @Override
    public double quizzes(WrittenQuestions[] questions, Scanner scan) {
        this.narrate(new String[] {
            "After finishing their main activity in programming the time has come for them to take their quiz",
            "Akhito, Reflecting on the lessons and activities he gained during this semester",
            "He felt joy and comfort knowing that the lessons gave him knowledge the activities game him some experience in programming",
            "Now the teacher will now give their final quiz for this semester"
        });
      System.out.println("Good morning class we will now start our quiz so prepare your paper and pen");
      WrittenQuestions quizHandler = new WrittenQuestions();
      double totalQuizScores = quizHandler.processQuestion(questions, scan, quizDuration());
      System.out.println("Congratulations you got a total of: " + totalQuizScores + " from the quiz, keep up the good work");
      return totalQuizScores;
    }

    @Override
    public double examination(WrittenQuestions[] examQuestions, Scanner scan) {
        this.narrate(new String[] {
            "Now the final examination will begin",
            "The major test that have the biggest score impact than the other test",
            "The last test which will determine if the students learned the lessons for this semester",
            "Akhito, anxious yet confident that all of his effort in his studies are going to prevail",
            "Now that the teacher is in the room, the room stayed silent",
            "Everyone focused on their major test making sure that they will passed the course",
            "Now the final exam for the final period will began"
        });
        System.out.println("Good morning class we will now start our quiz so prepare your paper and pen");
          WrittenQuestions examHandler = new WrittenQuestions();
      examHandler.setTotalScore(examHandler.processQuestion(examQuestions, scan, quizDuration()));
      System.out.println("Congratulations you got a total of: " + examHandler.getTotalScore() + " from the examination, keep up the good work");
     
        this.narrate(new String[] {
            "Now that the final examination is finally over",
            "It now concludes the end of the semester",
            "The students along with Akhito are anxioously waiting for their grade to be shown in their elms",
            "Anxious but happy that his work will be reduced while preparing for the second sem",
            "Now that the examination is over and the the semester now is concluded",
            "The total grade for this sem is yet to be shown in few days which will determine if they passed or failed on certain courses"
        });
         return examHandler.getTotalScore();
    }

    @Override
    public double recitation(RecitationQuestions[] questions, Scanner scan) {
         System.out.println("Now that we are done with our lessons let us now start our Q/A ");
                  RecitationQuestions recitationHandler = new RecitationQuestions();
                  recitationHandler.setTotalScore(recitationHandler.processQuestion(questions, scan, recitationDuration()));  
                  System.out.println("Congratulations you got a total of: " + recitationHandler.getTotalScore() + " from the recitation, keep up the good work");
            return recitationHandler.getTotalScore();
    }

}
