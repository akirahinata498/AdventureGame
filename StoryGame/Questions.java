package AdventureGame.StoryGame;

public abstract class Questions {
    private String questionName;
    private String correctAnswer;
    private int pointsGiven;
    private double totalScore;
    Questions(String questionName, String correctAnswer, int pointsGiven) {
        this.questionName = questionName;
        this.correctAnswer = correctAnswer;
        this.pointsGiven = pointsGiven;
    }
    Questions() {
    }

    //getters
    public String getQuestionName() {
        return questionName;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public int getPointsGiven() {
        return pointsGiven;
    }
    public double getTotalScore() {
        return totalScore;
    }
    public void setTotalScore(double totalScore) {
         this.totalScore = totalScore;
    }
}
