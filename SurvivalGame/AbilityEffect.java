package AdventureGame.SurvivalGame;

public interface AbilityEffect<caster extends Hero, target extends Hero> {
    void activate(caster playerHero, target enemy);

}
