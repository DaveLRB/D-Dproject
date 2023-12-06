public class Player {
    private final String NAME;
    private Character selectedCharacter;
    private int xp;
    private int level;


    public Player(String NAME, Character SELECTED_CHARACTER) {
        this.NAME = NAME;
        this.selectedCharacter = SELECTED_CHARACTER;

        this.level=0;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }



    public void addXP(int xp){
        this.xp+=xp;
    }

    public void addLevelToPlayer(int levelToAdd){
        this.level+=levelToAdd;
    }

    public void addLevelToPlayer(){
        this.level+=1;
    }


    public String getName() {
        return NAME;
    }

    public Character getSELECTED_CHARACTER() {
        return selectedCharacter;
    }
    public void setCharacter(Character character){this.selectedCharacter=character;}
}
