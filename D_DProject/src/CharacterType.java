
public enum CharacterType {
    KNIGHT("KNIGHT", 1200,7,8,5),
    SORCERER("SORCERER", 5,6,8,12),
    BARD("BARD", 7,8,12,8),
    ASSASSIN("ASSASSIN",8,12,5,7);

    private String name;
    private int strength;
    private int dexterity;
    private int charisma;
    private int intelligence;

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    CharacterType(String name, int strength, int dexterity, int charisma, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.intelligence = intelligence;
    }
}
