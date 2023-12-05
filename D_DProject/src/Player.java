public class Player {
    private final String NAME;
    private final Character SELECTED_CHARACTER;
    private int xp;
    private int level;


    public Player(String NAME, Character SELECTED_CHARACTER) {
        this.NAME = NAME;
        this.SELECTED_CHARACTER = SELECTED_CHARACTER;

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


    public String getNAME() {
        return NAME;
    }

    public Character getSELECTED_CHARACTER() {
        return SELECTED_CHARACTER;
    }
}
