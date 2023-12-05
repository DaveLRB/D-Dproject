package game;

import entities.*;
import entities.Character;

import java.util.ArrayList;

public class Dungeon {

    private ArrayList<Monster> monsters;

    public Dungeon() {
        this.monsters = new ArrayList<>();
    }

    private Character playerCharacter;

    public Dungeon(Player player) {
        this.playerCharacter = player.getSELECTED_CHARACTER();
    }

    //Following the level, this method creates 5 monsters.
    private void addMonstersByLevel(int level) {
        switch (level) {
            case 1 ->
                    createMonsters(MonsterType.SLIME, MonsterType.BABYSPIDERS, MonsterType.GOBLIN, MonsterType.SKELETON, MonsterType.ZOMBIE);
            case 2 ->
                    createMonsters(MonsterType.SPECTRE, MonsterType.WEREWOLF, MonsterType.GHOST, MonsterType.WITCH, MonsterType.VAMPIRE);
            case 3 ->
                    createMonsters(MonsterType.MUMMY, MonsterType.CREEPER, MonsterType.HARPY, MonsterType.CENTAUR, MonsterType.MINOTAUR);
            case 4 ->
                    createMonsters(MonsterType.CYCLOPS, MonsterType.BASILISK, MonsterType.GRIFFIN, MonsterType.CHIMERA, MonsterType.MEDUSA);
            case 5 ->
                    createMonsters(MonsterType.WYVERN, MonsterType.PHOENIX, MonsterType.KRAKEN, MonsterType.BEHEMOTH, MonsterType.DRAGON);
            default -> throw new IllegalStateException("Unexpected value: " + level);
        };
    }

    //Creating and adding monsters to the list following your type
    private void createMonsters(MonsterType monster, MonsterType monster1, MonsterType monster2, MonsterType monster3, MonsterType monster4) {
        clearMonsterList();
        monsters.add(MonsterFactory.createMonster(monster));
        monsters.add(MonsterFactory.createMonster(monster1));
        monsters.add(MonsterFactory.createMonster(monster2));
        monsters.add(MonsterFactory.createMonster(monster3));
        monsters.add(MonsterFactory.createMonster(monster4));
    }

    private void randomizeMonsters() {
        int random = (int) (Math.random() * 6) + 1;
    }

    //Remove all elements from monsterArray, generally to start a new level on createMonsters method
    private void clearMonsterList() {
        monsters.clear();
    }
}
