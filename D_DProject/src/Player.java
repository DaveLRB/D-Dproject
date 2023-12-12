public class Player {
    private static final int STARTING_LEVEL = 0;
    private static final int STARTING_GOLD = 25; //static because is related to the class instead of the object
    private Character selectedCharacter;
    private final String name; //variable because it's being used in the constructor and the name variable varies between objects
    private int xp;
    private int level;
    private int gold;
    private boolean isEquiped;
    private String whatIsEquiped;

    public Player(String name, Character SELECTED_CHARACTER) {
        this.name = name;
        this.selectedCharacter = SELECTED_CHARACTER;
        this.whatIsEquiped = "Nothing";
        this.level = STARTING_LEVEL;
        this.gold = STARTING_GOLD;
    }

    public void setWhatIsEquiped(String whatIsEquiped) {
        this.whatIsEquiped = whatIsEquiped;
    }

    public String getWhatIsEquiped() {
        return whatIsEquiped;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public boolean isEquiped() {
        return isEquiped;
    }

    public void setEquiped(boolean equiped) {
        isEquiped = equiped;
    }

    public void addXP(int xp) {
        this.xp += xp;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int gold) {this.gold += gold;}


    public void addLevelToPlayer(int levelToAdd) {
        this.level += levelToAdd;
    }

    public void addLevelToPlayer() {
        this.level += 1;
    }


    public String getName() {
        return name;
    }

    public Character getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setCharacter(Character character) {
        this.selectedCharacter = character;
    }
}
