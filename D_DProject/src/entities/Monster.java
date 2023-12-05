package entities;

import entities.Character;

import java.util.Random;

public class Monster {
    private String name;
    private int hitDmg;
    private int monsterHP;
    private boolean isMonsterAlive;
    private boolean isFriendly;
    private String[] attacks;
    private String[] quotes;
    int level = 0;

    public Monster(String name, int hitDmg, int monsterHP, boolean isMonsterAlive, boolean isFriendly, String[] attacks, String[] quotes) {
        this.name = name;
        this.hitDmg = hitDmg;
        this.monsterHP = monsterHP;
        this.isMonsterAlive = isMonsterAlive;
        this.isFriendly = isFriendly;
        this.attacks = attacks;
        this.quotes = quotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitDmg() {
        return hitDmg;
    }

    public void setHitDmg(int hitDmg) {
        this.hitDmg = hitDmg;
    }

    public int getMonsterHP() {
        return monsterHP;
    }

    public void setMonsterHP(int monsterHP) {
        this.monsterHP = monsterHP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public String[] getAttacks() {
        return attacks;
    }

    public void setAttacks(String[] attacks) {
        this.attacks = attacks;
    }

    public String[] getQuotes() {
        return quotes;
    }

    public void setQuotes(String[] quotes) {
        this.quotes = quotes;
    }

    public boolean getIsMonsterAlive() {
        return isMonsterAlive;
    }

    public void setIsMonsterAlive(boolean isMonsterAlive) {
        this.isMonsterAlive = isMonsterAlive;
    }

    public int monsterAttack(Character character) {
        int attackIndex = new Random().nextInt(attacks.length);
        String attack = attacks[attackIndex];
        System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
        return hitDmg;
    }

    public void takeDamage(Player character) {
        if (getIsMonsterAlive()) {
            monsterHP = Math.max(0, monsterHP - character.getSELECTED_CHARACTER().characterAttack());
            System.out.println(name + " used " + "! " + character.getSELECTED_CHARACTER().getName() + " took " + hitDmg + " damage.");
        } else {
            System.out.println("\nThis creature is already defeated!");
        }
    }
}

