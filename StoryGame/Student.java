package AdventureGame.StoryGame;

public class Student {
    private String name;
    private double quizscore;
    private double recitationScore;
    private double examScore;
    private double prelimGrade;
    private double midtermGrade;
    private double preFinalsGrade;
    private double finalsGrade;
    private double studentGWA;
    private double totalGrade;    
    private int userGamePoints; 
    //maxscores
    private final static int maxQuizScores = 25;
    private final static int maxExamScores = 60;
    private final static int maxRecitationScores = 30;

    //percentages
    private final static int quizPercentage = 20;
    private final static int recitationPercentage = 30;
    private final static int examPercentage = 50;
    private final static int prelimPercentage = 20;
    private final static int midtermPercentage = 20;
    private final static int preFinalsPercentage = 20;
    private final static int finalsPercentage = 40;
    //getters
    public String getName() {
        return name;
    }
    public double getQuizScore() {
        return (quizscore / maxQuizScores) * quizPercentage;
    }
    public double getRecitationScore() {
        return (recitationScore / maxRecitationScores) * recitationPercentage;
    }
    public double getExamScore() {
        return (examScore / maxExamScores) * examPercentage;
    }
    public double getPrelimGrade() {
        return prelimGrade;
    }
    public double getMidtermGrade() {
        return midtermGrade;
    }
    public double getPreFinalsGrade() {
        return preFinalsGrade;
    }
    public double getFinalsGrade() {
        return finalsGrade;
    }
    public double getTotalGrade() {
        return totalGrade;
    }
    public double getTotalGWA() {
        return studentGWA;
    }
    public int getUserGamePoints() {
        return userGamePoints;
    }

    //setters 
    public void setName(String name) {
        this.name = name;
    }
    public void setQuizScore(double quizscore) {
        this.quizscore = quizscore;
    }
    public void setRecitationScore(double recitationScore) {
        this.recitationScore = recitationScore;
    }
    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
    public void setPrelimGrade() {
        this.prelimGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * prelimPercentage;
    }
    public void setMidtermGrade() {
        this.midtermGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * midtermPercentage;
    }
    public void setPreFinalsGrade() {
        this.preFinalsGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * preFinalsPercentage;
    }
    public void setFinalsGrade() {
        this.finalsGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * finalsPercentage;
    }
    public void setTotalGrade() {
        this.totalGrade = getPrelimGrade() + getMidtermGrade() + getPreFinalsGrade() + getFinalsGrade();
    }

    public void setTotalGWA() {
                if (getTotalGrade() <= 100 && getTotalGrade() >= 97.50) {
            studentGWA = 1.00;
            userGamePoints = 100;
        }
        else if (getTotalGrade() <= 97.49 && getTotalGrade() >= 94.50) {
            studentGWA = 1.25;
            userGamePoints = 90;
        }
        else if (getTotalGrade() <= 94.49 && getTotalGrade() >= 91.50) {
            studentGWA = 1.50;
            userGamePoints = 80;
        }
        else if (getTotalGrade() <= 91.49 && getTotalGrade() >= 88.50) {
            studentGWA = 1.75;
            userGamePoints = 70;
        }else if (getTotalGrade() <= 88.49 && getTotalGrade() >= 85.50) {
            studentGWA = 2.00;
            userGamePoints = 60;
        }
        else if (getTotalGrade() <= 85.49 && getTotalGrade() >= 81.50) {
            studentGWA = 2.25;
            userGamePoints = 50;
        }
        else if (getTotalGrade() <= 81.49 && getTotalGrade() >= 77.50) {
            studentGWA = 2.50;
            userGamePoints = 40;
        }
        else if (getTotalGrade() <= 77.49 && getTotalGrade() >= 73.50) {
            studentGWA = 2.75;
            userGamePoints = 30;
        }
        else if (getTotalGrade() <= 73.49 && getTotalGrade() >= 69.50) {
            studentGWA = 3.00;
            userGamePoints = 20;
        }
        else if (getTotalGrade() <= 69.49 && getTotalGrade() >= 0.0) {
            studentGWA = 5.00;
            userGamePoints = 20;
        }
    }


}
