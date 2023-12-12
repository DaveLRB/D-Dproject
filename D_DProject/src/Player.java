public class Player {
    private final String NAME;
    private Character selectedCharacter;
    private int xp;
    private int level;
    private int gold;
    private boolean isEquiped;
    private String whatIsEquiped;


    public Player(String NAME, Character SELECTED_CHARACTER) {
        this.NAME = NAME;
        this.selectedCharacter = SELECTED_CHARACTER;
        this.whatIsEquiped = "Nothing";

        this.level=0;
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

    public void addXP(int xp){
        this.xp+=xp;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int gold) {this.gold += gold;}

    public void addLevelToPlayer(int levelToAdd){
        this.level+=levelToAdd;
    }

    public void addLevelToPlayer(){
        this.level+=1;
    }


    public String getName() {
        return NAME;
    }

    public Character getSelectedCharacter() {
        return selectedCharacter;
    }
    public void setCharacter(Character character){this.selectedCharacter=character;}
}
