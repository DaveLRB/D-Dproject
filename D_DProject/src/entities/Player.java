package entities;

import entities.Character;

public class Player {
    private final String NAME;
    private final Character SELECTED_CHARACTER;
    private int xp;
    private int level;
    private int healthPoints;

    public Player(String NAME, Character SELECTED_CHARACTER) {
        this.NAME = NAME;
        this.SELECTED_CHARACTER = SELECTED_CHARACTER;
        this.healthPoints=100;
        this.level=0;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoints() {
        return healthPoints;
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

    public void deductHealthPoints(int healthPoints){
        this.healthPoints-=healthPoints;
    }

    public void addHealthPoints(int healthPoints){
        this.healthPoints+=healthPoints;
    }

    public String getNAME() {
        return NAME;
    }

    public Character getSELECTED_CHARACTER() {
        return SELECTED_CHARACTER;
    }
}
