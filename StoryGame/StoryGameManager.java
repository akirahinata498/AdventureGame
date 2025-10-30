package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;
import AdventureGame.GameMechanics.GameEngine;
public class StoryGameManager extends GameEngine  {
//college life simulator
    
    @Override
    public void narrate() {
                try {
        String[] narrateSentences = {"In the prefecture of okinawa sits a young innovator",
                                     "A student with no experience —adad but with a spark of curiosity burning brighter than any skill.",
                                     "He doesn’t know much yet.",
                                     "Syntax errors scare him.",
                                     "Logic confuses him.",
                                     "Even finds hard to categorize computer parts and perform simple maintenance",
                                     "But every programmer... starts here",
                                     "(Sound of rain tapping against the window)",
                                     "Days pass and the time for his college journey will begun",
                                     "While others enjoy their long vacation",
                                     "He endured the struggles, the failures and the nevver ending anxiety during his vacation.",
                                     "(Soft music rises — hopeful tone)",
                                     "He dreams of becoming an innovator that can impact the world of technology.",
                                     "Having closer to achieve his dreams",
                                     "With only one task left to start his career",
                                     "That is to graduate in his chosen program",
                                     "But with only a few more grind the fire in his spirit rises to accomplish his long dream."};
        for (String narrate : narrateSentences) {
                Thread.sleep(500);
                System.out.println(narrate);   
        }
          Thread.sleep(500);
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }








    @Override
    public DifficultyMode chooseLevel(Scanner scan) {
        System.out.println("1 - Junior");
        System.out.println("2 - Associate ");
        System.out.println("3 - Senior");
         System.out.print("Enter the difficulty that you want: ");
        int chooseDifficulty = scan.nextInt();
        scan.nextLine();
        DifficultyMode difficultyChosen = DifficultyMode.values()[chooseDifficulty - 1];
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return difficultyChosen;
    }

    @Override
    public int computeGameScore() {
        return 1;
    }

    @Override
    public int startGame(Scanner scan) {
        setDifficulty(chooseLevel(scan));
        narrate();
        Student student = new Student();
        Prelim prelim = new Prelim(getDifficulty());
        Midterm midterm = new Midterm(getDifficulty());
        PreFinals preFinals = new PreFinals(getDifficulty());
        Finals finals = new Finals(getDifficulty());
        prelim.narrate(new String[]{"The very first day of your class as well as your first day of your college journey",
                                    "You tried finding your classroom",
                                    "Your heart shaking, thinking what would your classmate and teacher think and how will you impress them on your first day",
                                    "Upon entering the classroom you observed",
                                    "Just like you expected most of the student are not familiar with each other with only a few students interacting with each other",
                                    "(Someone enters the room)",
                                    "It is your professor",
                                    "He introduced the subjects that you are going to tuckle in your first year",
                                    "You are excited thrilled and eager to learn more about programming and tech ",
                                    "However as your teacher discuss some possible lessons that you will be tuckling", 
                                    "You felt anxiety and worriness because some are different from what you self study",
                                    "After discussing the principles the teacher is asking some questions about some questions related to their course"}
        );
      student.setRecitationScore(prelim.recitation(new RecitationQuestions[]{
            new RecitationQuestions("Who is considered the first person to develop the concept of a programming language? A - Ada Lovelace B - James Gosling C - Bill Gates", "A", 10, "Correct! Ada Lovelace is recognized as the first computer programmer — she created the first algorithm intended for a machine.", "Not quite. The correct answer is letter A — Ada Lovelace, the pioneer of programming concepts."),
            new RecitationQuestions("What is a programming langauge use for? A - to communicate instructions to a computer\n B - Googling stuff in the internet\n C - Typing random things in your computer ", "A", 10, "That's it you got the correct answer you will receive 10 points for your recitation", "No, sorry but the right answer is letter A"),
            new RecitationQuestions("Ok last question What is the importance of programming in developing our future?\n A - It limits technological advancement and creativity.\n B - It enables the creation of new technologies and solutions that improve our daily lives.\n C - It only helps people play computer games.\n D - It prevents automation and efficiency in industries.", "B", 10, "Yes, You got it programming have a massive impact in innovating our future from the AI, the website the mobile and other most innovation are created with the help of programming", "I'm sorry the correct answer is letter B")
        }, scan));
        System.out.println("Your total grade for your recitation are " + student.getRecitationScore());
     student.setQuizScore(prelim.quizzes(new WrittenQuestions[]{
                new WrittenQuestions("1. Which of the following is the correct way to declare a variable in Java? A) int num = 10; B) int = 10 num; C) num int = 10; D) declare int num = 10;", "A", 5),
    new WrittenQuestions("2. Which keyword is used to create a subclass in Java? A) implements B) extends C) inherits D) superclass;", "B", 5),
    new WrittenQuestions("3. What does JVM stand for? A) Java Variable Machine B) Java Virtual Mechanism C) Java Virtual Machine D) Java Version Manager;", "C", 5),
    new WrittenQuestions("4. Which of the following is NOT a Java access modifier? A) public B) private C) protected D) secured;", "D", 5),
    new WrittenQuestions("5. What will be the output of the statement: System.out.println(5 + 2 + \"7\"); A) 12 B) 57 C) 77 D) 527;", "C", 5)
        } , scan));
         System.out.println("Your total grade for your quiz are " + student.getQuizScore());
     student.setExamScore(prelim.examination(new WrittenQuestions[] {
    new WrittenQuestions("1. Which company originally developed Java? A) Microsoft B) Sun Microsystems C) IBM D) Oracle", "B", 5),
    new WrittenQuestions("2. In what year was Java first released to the public? A) 1991 B) 1995 C) 1998 D) 2001", "B", 5),
    new WrittenQuestions("3. Who is known as the father of Java programming language? A) Bill Gates B) James Gosling C) Dennis Ritchie D) Bjarne Stroustrup", "B", 5),
    new WrittenQuestions("4. What is one of the main goals behind Java's creation? A) Fast machine code execution B) Platform independence C) Hardware-level control D) Game development", "B", 5),
    new WrittenQuestions("5. What does the phrase 'Write Once, Run Anywhere' mean in Java? A) Java programs can only run on Windows B) Java needs different versions for each OS C) Java can run on any platform with JVM D) Java compiles directly to machine code", "C", 5),
    new WrittenQuestions("6. What is the importance of learning programming? A) It helps automate tasks and solve problems B) It replaces all human jobs C) It’s only for software engineers D) It has no practical use", "A", 5),
    new WrittenQuestions("7. Which of the following is the correct way to declare a variable in Java? A) int num = 10; B) int = 10 num; C) num int = 10; D) declare int num = 10;", "A", 5),
    new WrittenQuestions("8. What is the correct file extension for a Java source file? A) .jav B) .java C) .jv D) .class", "B", 5),
    new WrittenQuestions("9. Which of the following is NOT a Java data type? A) int B) float C) number D) boolean", "C", 5),
    new WrittenQuestions("10. What is the output of System.out.println(\"Hello, Java!\"); ? A) Hello, Java! B) 'Hello, Java!' C) Hello Java D) Error", "A", 5),
    new WrittenQuestions("11. What is the purpose of the main method in a Java program? A) It stores constants B) It acts as the entry point of the program C) It defines all classes D) It compiles the program", "B", 5),
    new WrittenQuestions("12. What does JVM stand for? A) Java Variable Machine B) Java Virtual Machine C) Java Version Manager D) Java Visual Model", "B", 5),
        new WrittenQuestions("13. Which of the following correctly creates a Scanner object for input? A) Scanner sc = new Scanner(System.in); B) Scanner = new Scanner; C) new Scanner(System); D) Input sc = Scanner.new();", "A", 5),
        new WrittenQuestions("14. Which symbol is used for single-line comments in Java? A) # B) // C) /* */ D) --", "B", 5),
    new WrittenQuestions("15. What will happen if you forget to include a semicolon at the end of a statement in Java? A) The program will still run B) It will throw a syntax error C) The compiler will fix it automatically D) It will ignore the statement", "B", 5)
        }, scan));


        student.setPrelimGrade();
       System.out.println("Your total Grade for this prelim are: " + student.getPrelimGrade());
                       System.out.println("score for exam: " + student.getExamScore());
System.out.println("score for quiz: " + student.getQuizScore());
        System.out.println("score for recitation: " + student.getRecitationScore());
       midterm.narrate(new String[] {
        "The prelim period is now over and now it is midterm now",
        "Akhito after passing the prelim felt relief",
        "Seeing that the handful of lessons and expeirence he gained in shs in the past are worth it",
        "However tearfully thinking of how much more could he become if he is given more time to progress and learn without the need to work and learn at the same time",
        "He only uses cellphone as means to learn during his shs days and he is still starting to navigate the environment in his laptop",
        "Confusing at first he said but nevertheless he didnt let that hinder him from learning",
        "He searched online, join online communities and learn with people online or f2f to gain more additional knowledge",
        "It is hard for him to learn at first considering he is also a slow learner and can easily forget some things",
        "Nevertheless he dedicate a time to learn more about programming and how to navigate his device as well as perform small maintenance",
        "Few days passed after the examination and showing of grades and now their professor starts the day with yet another lesson",
        "While their teacher is discussing he wrote important things and test it himself to effectively know what their prof is teaching",
        "Now that their professor is done it is time again for the class to face another recitation to test if they learned something from the discussion"
       });
     student.setRecitationScore(midterm.recitation(new RecitationQuestions[] {
            new RecitationQuestions("What keyword is used in Java to make a decision based on a condition? A - if B - loop C - check", "A", 10, "Correct! The 'if' keyword allows decision-making based on a condition. You earn 10 points!", "Incorrect. The right answer is A — 'if' is used for conditional statements."),
new RecitationQuestions("Which keyword is used to provide an alternative action when the 'if' condition is false? A - or B - else C - then", "B", 10, "That's right! 'else' executes when the 'if' condition is false. You get 10 points!", "Nope. The correct answer is B — 'else' handles the false condition."),
new RecitationQuestions("What operator is used to compare two values in a conditional statement? A - = B - == C - equals", "B", 10, "Excellent! '==' is used to compare two values in Java conditionals. You earn 10 points!", "Sorry, the correct answer is B — '==' is used for comparison in conditionals."),
       }, scan));
       System.out.println("Your total grade for your recitation are " + student.getRecitationScore());
      student.setQuizScore(midterm.quizzes(new WrittenQuestions[] {
new WrittenQuestions("1. What keyword is used to start a conditional statement in Java? A) if B) else C) condition D) check", "A", 5),
new WrittenQuestions("2. Which symbol represents the 'equal to' comparison operator in Java? A) = B) == C) != D) equals", "B", 5),
new WrittenQuestions("3. What will this condition evaluate to: if (10 > 5)? A) true B) false C) error D) undefined", "A", 5),
new WrittenQuestions("4. Which keyword is used to test multiple conditions one after another? A) else B) else if C) continue D) switch", "B", 5),
new WrittenQuestions("5. What is the output of this code: if (3 < 2) { System.out.println('Yes'); } else { System.out.println('No'); } A) Yes B) No C) Error D) Nothing", "B", 5),
       }, scan));
       System.out.println("Your total grade for your quizzes are " + student.getQuizScore());
     student.setExamScore(midterm.examination(new WrittenQuestions[]{
new WrittenQuestions("1. What keyword is used in Java to start a conditional statement? A) if B) else C) switch D) check", "A", 5),
new WrittenQuestions("2. Which operator is used to compare two values for equality in Java? A) = B) == C) != D) equals", "B", 5),
new WrittenQuestions("3. Which keyword is used when you want to perform an action only if the 'if' condition is false? A) while B) else C) do D) switch", "B", 5),
new WrittenQuestions("4. What will this condition return: (10 < 5)? A) true B) false C) error D) 10 < 5", "B", 5),
new WrittenQuestions("5. Which operator represents logical AND in Java? A) & B) && C) and D) ||", "B", 5),
new WrittenQuestions("6. Which of the following correctly represents a nested conditional statement? A) if(if condition) B) if (x > 0) { if (y > 0) {...}} C) if = if D) if inside if()", "B", 5),
new WrittenQuestions("7. What will happen if the condition in an 'if' statement is false and no 'else' is provided? A) Program stops B) Nothing happens C) Error occurs D) Loop repeats", "B", 5),
new WrittenQuestions("8. What keyword allows checking another condition after an 'if' fails? A) else if B) next if C) elif D) second if", "A", 5),
new WrittenQuestions("9. What keyword is used to begin a switch statement in Java? A) case B) switch C) choose D) option", "B", 5),
new WrittenQuestions("10. What keyword defines each possible value to check inside a switch? A) case B) else C) if D) break", "A", 5),
new WrittenQuestions("11. What keyword is used to exit a case once a match is found? A) stop B) end C) break D) exit", "C", 5),
new WrittenQuestions("12. What happens if 'break' is missing in a switch case? A) The program stops B) It causes an error C) Execution continues to the next case D) It skips to default", "C", 5),
new WrittenQuestions("13. What keyword is used when none of the switch cases match the expression? A) else B) default C) otherwise D) none", "B", 5),
new WrittenQuestions("14. Which of the following data types can be used in a switch statement? A) int, char, String B) float, double C) boolean only D) arrays only", "A", 5),
new WrittenQuestions("15. What is the correct syntax to end a switch block? A) end switch; B) break; C) } D) stop;", "C", 5)
}, scan));
System.out.println("Your total grade for your examination are " +  student.getExamScore());

    student.setMidtermGrade();
    System.out.println("Your total grade for this midterm are: " + student.getMidtermGrade());
                    System.out.println("score for exam: " + student.getExamScore());
System.out.println("score for quiz: " + student.getQuizScore());
        System.out.println("score for recitation: " + student.getRecitationScore());
   student.setRecitationScore(preFinals.recitation(new RecitationQuestions[] {
new RecitationQuestions("What keyword is used to repeat a block of code a specific number of times? A - loop\n B - for\n C - repeat", "B", 10, "Correct! The 'for' loop is used to repeat code a set number of times — 10 points!", "Not quite, the correct answer is B — the 'for' keyword starts a loop that repeats code."),
new RecitationQuestions("In a for loop, what part usually updates the loop variable each cycle? A - condition\n B - increment/decrement\n C - initialization", "B", 10, "Good job! The increment/decrement part updates the loop variable — 10 points!", "Not quite, the correct answer is B — it updates the variable after each iteration."),
new RecitationQuestions("If you want a loop to run 5 times, starting at 0, what should the condition look like? A - i <= 5\n B - i < 5\n C - i == 5", "B", 10, "Correct! Using 'i < 5' runs the loop 5 times (0 to 4) — nice work!", "Incorrect. The correct answer is B — 'i < 5' makes it run exactly 5 times.")
    }, scan));
    System.out.println("Your total score for your recitation are " + student.getRecitationScore());
   student.setQuizScore(preFinals.quizzes(new WrittenQuestions[] {
new WrittenQuestions("1. Which type of loop is best used when you know exactly how many times you want to repeat a block of code? A) while loop B) for loop C) do-while loop D) switch statement", "B", 5),
new WrittenQuestions("2. What keyword is used to skip the current iteration of a loop and move to the next one? A) exit B) return C) skip D) continue", "D", 5),
new WrittenQuestions("3. In a while loop, when is the loop condition checked? A) before the loop body executes B) after the loop body executes C) only once D) randomly", "A", 5),
new WrittenQuestions("4. Which loop guarantees that the code inside it will run at least once? A) for loop B) while loop C) do-while loop D) infinite loop", "C", 5),
new WrittenQuestions("5. What will happen if the loop condition never becomes false? A) The program will crash immediately B) The loop will run infinitely C) It will skip the loop D) It will produce an error before running", "B", 5),
    }, scan));
    System.out.println("Your total score for your quiz are " + student.getQuizScore());
   student.setExamScore(preFinals.examination(new WrittenQuestions[] {
new WrittenQuestions("1. What will be the output of the following code? int sum = 0; for(int i = 1; i <= 3; i++) { sum += i; } System.out.println(sum); A) 3 B) 6 C) 5 D) 4", "B", 5),
new WrittenQuestions("2. How many times will this loop execute? for(int i = 2; i < 10; i += 2) { } A) 4 B) 5 C) 3 D) 8", "B", 5),
new WrittenQuestions("3. What is the main difference between a while loop and a do-while loop? A) while runs once, do-while repeats infinitely B) do-while checks condition first C) do-while guarantees one execution before condition check D) while is faster", "C", 5),
new WrittenQuestions("4. In a nested loop, if the outer loop runs 4 times and the inner loop runs 3 times, how many total iterations occur? A) 7 B) 12 C) 10 D) 6", "B", 5),
new WrittenQuestions("5. What will happen if you forget to update the loop variable inside a while loop? A) Syntax error B) Infinite loop C) Compile-time error D) Skips the loop", "B", 5),
new WrittenQuestions("6. What keyword is used to exit a loop immediately, even if the condition is still true? A) continue B) break C) exit D) stop", "B", 5),
new WrittenQuestions("7. What will this code print? int x = 0; while(x < 3) { x++; } System.out.print(x); A) 0 B) 2 C) 3 D) 4", "C", 5),
new WrittenQuestions("8. Which of the following loop statements is most suitable for reading input until the user enters a specific keyword? A) for loop B) while loop C) do-while loop D) nested for loop", "B", 5),
new WrittenQuestions("9. What does the 'continue' statement do in a loop? A) Ends the loop completely B) Skips remaining code in current iteration and goes to the next one C) Restarts the loop from the beginning D) Terminates the program", "B", 5),
new WrittenQuestions("10. What is the output of: for(int i = 1; i <= 5; i++) { if(i == 3) break; System.out.print(i); } A) 12345 B) 12 C) 123 D) 1", "B", 5),
new WrittenQuestions("11. What will be the last value printed by this loop? for(int i = 1; i <= 10; i += 3) { System.out.print(i + ' '); } A) 7 B) 10 C) 9 D) 8", "A", 5),
new WrittenQuestions("12. Which of the following loops executes faster in Java? A) while loop B) for loop C) do-while loop D) None, all loops execute with similar speed", "D", 5),
new WrittenQuestions("13. Which expression correctly represents a for loop that runs exactly 10 times? A) for(int i = 1; i < 10; i++) B) for(int i = 0; i <= 10; i++) C) for(int i = 0; i < 10; i++) D) for(int i = 1; i <= 9; i++)", "C", 5),
new WrittenQuestions("14. What is the output of this nested loop? for(int i = 1; i <= 2; i++){ for(int j = 1; j <= 3; j++){ System.out.print(j + ' '); } } A) 1 2 3 1 2 3 B) 1 1 1 2 2 2 C) 3 2 1 3 2 1 D) 1 2 3", "A", 5),
new WrittenQuestions("15. What happens if you place a semicolon directly after a for loop declaration, like for(int i = 0; i < 5; i++); ? A) Syntax error B) The loop body executes normally C) The loop runs but does nothing D) It becomes an infinite loop", "C", 5)
    }, scan));
    student.setPreFinalsGrade();
       System.out.println("Your total Grade for this prelim are: " + student.getPrelimGrade());
                       System.out.println("score for exam: " + student.getExamScore());
System.out.println("score for quiz: " + student.getQuizScore());
        System.out.println("score for recitation: " + student.getRecitationScore());
    finals.narrate(new String[] {
        "The semester is now over all are completed but one",
        "The finals which teachers gave most heavy tasks with only a limited time of deadline",
        "Students will feel exhaustion and anxiety due to the pressure and immense workload",
        "But to the likes of akhito will experience worst due to him being overwhelmed by both work and school works",
        "Yet his spirit never faltered, instead he hardened his resolve to endure the workload",
        "Instead of falling to despair he used this as learning how to manage multiple tasks simultaneously.",
        "During their break while students enjoyed their vacation to rest, Akhito kept learning and working hard for his future",
        "After two weeks of break and checking of their grades the teacher began their lessons",
        "After discussing the lessons before giving the major activities to the students they conduct forst a recitation to test if the students learned something from the lesson"
    });
   student.setRecitationScore(finals.recitation(new RecitationQuestions[] {
new RecitationQuestions("What is an array in Java? A - A single variable that stores one value B - A collection of variables of the same type stored under one name C - A random list of values of different types", "B", 10, "Correct! An array stores multiple values of the same type under one name — great job!", "Not quite, the correct answer is B — arrays store multiple values of the same type."),
new RecitationQuestions("If an array has 5 elements, what is the index of its last element? A - 5 B - 4 C - 6", "B", 10, "Good job! Arrays start from index 0, so the last index is 4 — you earn 10 points!", "Incorrect, the correct answer is B — array indices start at 0, so the last is 4."),
new RecitationQuestions("Which statement correctly creates an integer array with 10 elements? A - int[] arr = new int[10]; B - int arr(10); C - array int = 10[];", "A", 10, "Correct! 'int[] arr = new int[10];' creates an array with 10 integer slots — nice work!", "Not quite, the correct answer is A — that’s the proper Java syntax for an array."),
    }, scan));
    System.out.println("Your total score for your recitation are " + student.getRecitationScore());

   student.setQuizScore(finals.quizzes(new WrittenQuestions[] {
new WrittenQuestions("1. Which of the following correctly declares an integer array in Java? A) int arr[]; B) int arr; C) array int[]; D) int array();", "A", 5),
new WrittenQuestions("2. What will be the index of the last element in an array with 8 elements? A) 8 B) 7 C) 9 D) 6", "B", 5),
new WrittenQuestions("3. What is the main purpose of using classes in Java? A) To make code longer B) To organize and reuse code through objects C) To store random data D) To handle arrays only", "B", 5),
new WrittenQuestions("4. What is an object in Object-Oriented Programming? A) A variable that stores data only B) An instance of a class C) A type of loop D) A reserved keyword", "B", 5),
new WrittenQuestions("5. How can you access the third element of an array named 'grades'? A) grades[3] B) grades(3) C) grades[2] D) grades{3}", "C", 5)
    }, scan));
    System.out.println("Your total score for your quiz are " + student.getQuizScore());
   student.setExamScore(finals.examination(new WrittenQuestions[] {
        new WrittenQuestions("1. What is the main purpose of programming? A) To confuse computers B) To give instructions to a computer to perform tasks C) To store files D) To make text documents", "B", 5),
new WrittenQuestions("2. Which of the following is a valid Java data type? A) word B) int C) number D) digit", "B", 5),
new WrittenQuestions("3. What symbol is used to end a statement in Java? A) , (comma) B) . (period) C) ; (semicolon) D) : (colon)", "C", 5),
new WrittenQuestions("4. What does the term 'variable' mean in programming? A) A name that stores a value that can change B) A fixed number C) A reserved keyword D) A special function", "A", 5),
new WrittenQuestions("5. Which of the following correctly declares a variable in Java? A) int number = 10; B) int = 10 number; C) 10 = number int; D) number int = 10;", "A", 5),
new WrittenQuestions("6. What is the output of: System.out.println(5 + 3 * 2); A) 16 B) 11 C) 13 D) 10", "B", 5),
new WrittenQuestions("7. Which of the following is a conditional statement in Java? A) while B) if C) for D) print", "B", 5),
new WrittenQuestions("8. What keyword is used to repeat a block of code a specific number of times? A) while B) repeat C) for D) loop", "C", 5),
new WrittenQuestions("9. What will be the output of: for(int i = 0; i < 3; i++) { System.out.print(i + ' '); } A) 0 1 2 B) 1 2 3 C) 2 3 4 D) 3 2 1", "A", 5),
new WrittenQuestions("10. Which keyword is used to stop a loop immediately? A) exit B) end C) break D) stop", "C", 5),
new WrittenQuestions("11. What is an array used for in Java? A) To store multiple values of the same type in a single variable B) To create user interfaces C) To print data D) To define loops", "A", 5),
new WrittenQuestions("12. How do you find the number of elements in an array named 'nums'? A) nums.size() B) nums.count C) nums.length D) nums.getLength()", "C", 5),
new WrittenQuestions("13. What does OOP stand for? A) Object Output Program B) Object-Oriented Programming C) Organized Operator Process D) Object-Oriented Procedure", "B", 5),
new WrittenQuestions("14. What is a class in Java? A) A loop that runs continuously B) A blueprint or template for creating objects C) A function used to print data D) A data type for arrays", "B", 5),
new WrittenQuestions("15. What is an object in Java? A) A variable that stores data only B) A specific instance created from a class C) A part of the compiler D) A syntax rule", "B", 5)
    }, scan));
    System.out.println("Your total score for your examination are " + student.getExamScore());
    student.setFinalsGrade();
    System.out.println("Your total grade for this finals are " + student.getFinalsGrade());
                    System.out.println("score for exam: " + student.getExamScore());
System.out.println("score for quiz: " + student.getQuizScore());
        System.out.println("score for recitation: " + student.getRecitationScore());
    finals.narrate(new String[] {
        "Now that the final grade has been uploaded in their respective accounts many students including Akhito are checking into their account",
        "Many feel dissapointment many are happy",
        "But for Akhito, after viewing his grade he felt relived",
        "He might not attained the highest grade but he did passed all of his courses with no failing grade despite being a working student",
        "After realizing how hard being a working student in college, he knows how much more he will face in the higher years",
        "But despite this, day by day he is still strengthening his resolve to face the struggles ahead",
        "For a dream that are thought to be so far to be reached for the likes of him",
        "Now it feels like it will become a reality",
        "A journey of Akhito Matsumoto's innovator journey",
        "Life can be tough and unfair",
        "But the sheer will of people like Akhito",
        "Shows only a proof that flower can still bloom even in a chaos"
    });
    student.setTotalGrade();
     student.setTotalGWA();
    System.out.println("Congratulations for finishing Akhitos life story");
    System.out.println("Here are the summarization of your scores");
    System.out.println("Prelim Grade: " + student.getPrelimGrade());
    System.out.println("Midterm Grade: " + student.getMidtermGrade());
    System.out.println("Pre-Finals Grade: " + student.getPreFinalsGrade());
    System.out.println("Finals Grade: " + student.getFinalsGrade());
    System.out.println("Total Grade: " + student.getTotalGrade());
    System.out.println("GWA: " + student.getTotalGWA());
   
            return student.getUserGamePoints();
    }
}
