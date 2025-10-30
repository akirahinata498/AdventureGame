package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;

public class Prelim extends StoryEvents{
        
    Prelim(DifficultyMode difficulty) {
        super(difficulty);
    }


    @Override
    public double recitation(RecitationQuestions[] recitation, Scanner scan) {
       System.out.println("Now that we are done with the discussion now let us have some recitation for today");
       RecitationQuestions recitationHandler = new RecitationQuestions();
       double totalRecitationScores = recitationHandler.processQuestion(recitation, scan, quizDuration());
        System.out.println("Congratulations you got a total of: " + totalRecitationScores + " from the recitations, keep up the good work");
        return totalRecitationScores;
    
    }
    @Override
    public double quizzes(WrittenQuestions[] questions, Scanner scan) {
      this.narrate(new String[] {
        "After his first day of school he was thrilled with some new insights about the possible things he might learn in school.",
        "Regardless of his situation as a working student he still keep his fighting spirit",
        "Dreaming of becoming a great innovator which will help his family escaped poverty",
        "Regardless of having work and school at the same time he still do his best to manage his time to have a spare time to study more about his current and possible future lessons",
        "Few days passed and now its the day the teacher will have quiz again"
      });
      System.out.println("Good morning class we will now start our quiz so prepare your paper and pen");
      WrittenQuestions quizHandler = new WrittenQuestions();
      double totalQuizScores = quizHandler.processQuestion(questions, scan, quizDuration());
      System.out.println("Congratulations you got a total of: " + totalQuizScores + " from the quiz, keep up the good work");
      return totalQuizScores;
    }
    @Override
    public double examination(WrittenQuestions[] examQuestions, Scanner scan) {
        System.out.println("Good morning class this will be your first test this semester. So before we start kindly bring out your blue form and pen after 30 minutes the exam will begin use the remaining time to review.");
        narrate(new String[] {
            "The first examintaion for this period has begun",
            "Many of the students including akhito himself at first are afraid, knowing that 50% of their grade depends on the score of their exam",
            "Akhito, afraid yet very determined",
            "College is not easy and definitely requires a lot of significant effort, which Akhito understood",
            "He prepared the things the proctor told them to get",
            "Now with the time is set the examination will now begin"
        });
        WrittenQuestions examHandler = new WrittenQuestions();
        double totalExamScores = examHandler.processQuestion(examQuestions, scan, quizDuration());
        narrate(new String[] {
            "Now the examination is finally over",
            "Some students find the exam hard",
            "Some find it easy",
            "Akhito though faced with some hard questions yet confident of himself that he might pass",
            "Now that they are done only the announcement of their professor to check if they passed or not",
        });
            
        return totalExamScores;
    }

 
}
