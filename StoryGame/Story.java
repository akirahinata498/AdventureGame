package AdventureGame.StoryGame;

public interface Story {
    void interact();
    int computeScores();
    int computeTotalGrade();
    boolean checkIfPassed();
    void quiz();
    void exam();
}
