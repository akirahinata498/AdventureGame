package AdventureGame.SurvivalGame;

public enum WorldLeader {

    @SuppressWarnings("rawtypes")
    MUSSOLINI("Mussolini",
              new Abilities[]{
                new DamageAbility("Fascist Blast", "Fires a fascist shotgun dealing 450 damage instantly.", false, 8, 450),
                new BuffAbility("Iron Discipline", "Inspires himself as a fascist leader, increasing attack by 40 for 10 seconds.", false, 12, 40, 10),
                new DamageAbility("Glory of Rome", "Summons Italian soldiers to deal a burst of 300 damage instantly.", false, 18, 300),
                new HealAbility("Father of Fascism", "Assures his legacy, healing himself for 1200 HP.", true, 60, 1200)
              },
              "Italy",
              "The Roman Empire will be rebuilt again, Glory to the Roman Empire!!",
              7000,
              "AXIS",
              200
    ),

    @SuppressWarnings("rawtypes")
    HITLER("Hitler",
              new Abilities[]{
                new HealAbility("Right Arm of the Forbidden One", "Raises his right hand commanding dark forces to heal him for 1000 HP.", false, 14, 1000),
                new DamageAbility("Fuhrer’s Wrath", "Fueled by rage, fires a tank shell at an enemy dealing 900 damage.", false, 18, 900),
                new DamageAbility("Propaganda Surge", "Boosts German soldiers’ morale to attack enemies, dealing 350 burst damage instantly.", false, 22, 350),
                new DamageAbility("Operation Barbarossa", "Unleashes the full force of his army, dealing 2000 burst damage instantly.", true, 80, 2000)
              },
              "Germany",
              "If art school says nein, Europe shall be mein!",
              6500,
              "AXIS",
              220
    ),

    @SuppressWarnings("rawtypes")
    HIROHITO("Hirohito",
              new Abilities[]{
                new HealAbility("Amaterasu’s Blessing", "Calls divine light to heal himself for 800 HP.", false, 12, 800),
                new DamageAbility("Banzai Charge", "Sacrifices 50% of his health to deal 1600 burst damage to his target.", false, 25, 1600),
                new DamageAbility("Empire’s Wrath", "Orders bombers to deal a burst of 300 damage instantly.", false, 20, 300),
                new DamageAbility("Sun's Fury", "Summons the wrath of the Imperial Sun, dealing 3500 total damage in a massive explosion.", true, 90, 3500)
              },
              "Imperial Japan",
              "The sun shall rise again, for in the glory of our empire we endure!",
              7200,
              "AXIS",
              180
    ),

    @SuppressWarnings("rawtypes")
    CHURCHILL("Churchill",
              new Abilities[]{
                new HealAbility("Iron Resolve", "His sheer willpower forces him to recover 900 HP.", false, 10, 900),
                new BuffAbility("Lion’s Roar", "Rallies allies and increases attack by 60 for 10 seconds.", false, 14, 60, 10),
                new DamageAbility("British Might", "Demonstrates British firepower, dealing 1200 damage instantly.", false, 20, 1200),
                new BuffAbility("Spirit of Britain", "Increases attack by 180 for 15 seconds when allies are below half health.", true, 80, 180, 15)
              },
              "United Kingdom",
              "War is not won through fear, but by the courage to stand firm amidst the chaos.",
              8000,
              "ALLIES",
              190
    ),

    @SuppressWarnings("rawtypes")
    ROOSEVELT("Roosevelt",
              new Abilities[]{
                new DamageAbility("Liberty Strike", "Fires four precise shots dealing a total of 1300 damage.", false, 15, 1300),
                new DamageAbility("Industrial Surge", "Unleashes America’s industrial might, bombarding the area for a burst of 2500 damage instantly.", false, 25, 2500),
                new BuffAbility("Operation Overdrive", "Increases attack damage by 100 for 10 seconds using allied cooperation.", false, 20, 100, 10),
                new DamageAbility("Manhattan Protocol", "Deploys the atomic bomb, annihilating enemies for 4000 damage in a large area.", true, 100, 4000)
              },
              "United States of America",
              "Our strength lies not in one man, but in millions united for freedom.",
              7500,
              "ALLIES",
              210
    ),

    @SuppressWarnings("rawtypes")
    STALIN("Stalin",
              new Abilities[]{
                new HealAbility("Soviet Pride", "Taps into the pride of the Red Army, healing himself for 1400 HP.", false, 18, 1400),
                new DamageAbility("Communist Vengeance", "Commands comrades to attack, dealing 400 burst damage instantly.", false, 22, 400),
                new BuffAbility("Vodka, Soviet Bear", "Drinks vodka and channels the Soviet Bear, increasing attack by 150 for 12 seconds.", false, 25, 150, 12),
                new DamageAbility("Soviet Judgement", "Calls an unstoppable barrage of artillery dealing 3800 damage in one concentrated blast.", true, 100, 3800)
              },
              "Soviet Union",
              "The Red Army will crush all that stands before it.",
              9000,
              "ALLIES",
              170
    );


    private String name;
    private Abilities[] abilities;
    private String country;
    private String characterDialogue;
    private int characterHealth;
    private String powerType;
    private int attackDamage;
    
    WorldLeader(String name, Abilities[] abilities, String country, String characterDialogue, int characterHealth,  String powerType, int attackDamage) {
        this.name = name;
        this.abilities = abilities;
        this.country = country;
        this.characterDialogue = characterDialogue;
        this.characterHealth = characterHealth;
        this.powerType = powerType;
        this.attackDamage = attackDamage;
    }

  //getters   
    public String getName() {
        return name;
    }
    public Abilities[] getAbilities() {
        return abilities;
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
    public String getPowerType() {
        return powerType;
    }
    public int getAttackDamage() {
        return attackDamage;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAbilities(Abilities[] abilities) {
        this.abilities = abilities;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCharacterDialogue(String characterDialogue) {
        this.characterDialogue = characterDialogue;
    }
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }
}
