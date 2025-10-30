package AdventureGame.SurvivalGame;

public abstract class Hero implements CharacterActions {
      private WorldLeader worldLeader;
    private String name;
    @SuppressWarnings("rawtypes")
    private Abilities[] abilities; 
    private int attackDamage;
    private String country;
    private String characterDialogue;
    private int characterHealth;
    private int currentHealth;

    public Hero(WorldLeader worldLeader) {
        this.worldLeader = worldLeader;
        this.name = worldLeader.getName();
        this.abilities = worldLeader.getAbilities();
        this.attackDamage = worldLeader.getAttackDamage();
        this.country = worldLeader.getCountry();
        this.characterDialogue = worldLeader.getCharacterDialogue();
        this.currentHealth = this.characterHealth = worldLeader.getCharacterHealth();
    }
   public Hero() {

    }

    //getters   
    public String getName() {
        return name;
    }
    @SuppressWarnings("rawtypes")
    public Abilities[] getAbilities() {
        return abilities;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public String getCountry() {
        return country;
    }
    public String getCharacterDialogue() {
        return characterDialogue;
    }
    public int getCharacterHealth() {
        return characterHealth;
    }

    public WorldLeader getWorldLeader() {
        return worldLeader;
    }
   

    public int getCurrentHealth() {
        return currentHealth;
    }


    //setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAbilities(@SuppressWarnings("rawtypes") Abilities[] abilities) {
        this.abilities = abilities;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCharacterDialogue(String characterDialogue) {
        this.characterDialogue = characterDialogue;
    }
    public void setCharacterHealth(int characterHealth) {
        this.characterHealth = characterHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }


    public boolean isDead() {
        if (currentHealth <= 0) {
             return true;
        }
       else {
        return false;
       }
    }
    


public void takeDamage(int damage) {
     currentHealth -= damage;
    if (currentHealth < 0) currentHealth = 0;
    System.out.println(name + " takes " + damage + " damage! Current HP: " + currentHealth);
}


    public void heal(int heal) {
        currentHealth += heal;
        if (currentHealth > characterHealth) currentHealth = characterHealth;
         System.out.println(name + " takes " + heal + " heal! Current HP: " + currentHealth);
    }

    
  

}
