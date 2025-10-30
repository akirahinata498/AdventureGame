package AdventureGame.SurvivalGame;
import java.util.Scanner;
public interface Survival {
        PlayerHero chooseHeroLeader(Scanner scan, String powerType);
        String choosePower(Scanner scan);
        void startBattle(Scanner scan, PlayerHero playerHero, String playerPower);
}

