package AdventureGame.SurvivalGame;

import java.util.Random;



import AdventureGame.GameMechanics.DifficultyMode;

public class Enemy extends Hero{
    private DifficultyMode difficultyMode; 
    private final Random random = new Random();
    Enemy(WorldLeader worldLeader, DifficultyMode difficultyMode) {
        super(worldLeader);
         this.difficultyMode = difficultyMode;
    }

    @Override
    public void heroAssault(PlayerHero character, Enemy enemy) {
            Random random = new Random();
            int randomAttack = chooseRandomAttackOnDifficulty();
            if (character.getCurrentHealth() >= 0) {
                if(randomAttack == 9) {
                    character.takeDamage(enemy.getAttackDamage());
                }
                else {
                   @SuppressWarnings("unchecked")
                   Abilities<Enemy, PlayerHero>  ability = enemy.getAbilities()[randomAttack];
                   ability.activate(this, character);
                }
            }
    }
    


    private int chooseRandomAttackOnDifficulty() {
        switch (getDifficultyMode()) {
        case EASY:
            // 70% chance to use basic attack (index 9), 30% for skills
            return random.nextDouble() < 0.7 ? 9 : random.nextInt(2);
        case NORMAL:
            // 40% chance for basic, rest are random abilities
            return random.nextDouble() < 0.4 ? 9 : random.nextInt(3);
        case HARD:
            // Rarely basic attack, prefers abilities
            return random.nextDouble() < 0.2 ? 9 : random.nextInt(getAbilities().length);
        default:
            return 9; // Default to basic attack
    }
    }

    //getter
    public DifficultyMode getDifficultyMode() {
        return difficultyMode;
    }
    @Override
    public void dialogue(Hero character, String[] dialogue) {
        throw new UnsupportedOperationException("Unimplemented method 'dialogue'");
    }


}
