import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

    private ArrayList<Monster> monsterArrayList;
    private ArrayList<Character> characters;
    private final Character character;
    private final Scanner sc;
    private int level;
    private boolean gameIsRunning;

    public GameManager() {
        sc = new Scanner(System.in);
        characters = new ArrayList<>();
        monsterArrayList = new ArrayList<>();
        addCharactersToList();
        character = playerSelectCharacter();
        level = 0;
        gameIsRunning = true;
    }

    public void init() {
        GameMessage.getBigBlankSpace();
        GameMessage.getMenuBigMessage();
        GameMessage.getBlankSpace();
        while(gameIsRunning) {
            GameMessage.getMenuMessage();
            switch (sc.next()) {
                case "1" -> System.out.println("1");
                case "2" -> System.out.println("2");
            }
        }
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
        monsterArrayList.add(MonsterFactory.createMonster(monster));
        monsterArrayList.add(MonsterFactory.createMonster(monster1));
        monsterArrayList.add(MonsterFactory.createMonster(monster2));
        monsterArrayList.add(MonsterFactory.createMonster(monster3));
        monsterArrayList.add(MonsterFactory.createMonster(monster4));
}

    //Method to start the game: player need select a character. When he select, the character is stored at character instance.
    public Character playerSelectCharacter() {
        int count = 1;
        for (Character character : characters) {
            System.out.println(count++ + " | "+character.getStrength());
        }
        GameMessage.getPlayerSelectMessage();
        return switch (sc.nextInt()) {
            case 1 -> new Character(CharacterType.KNIGHT);
            case 2 -> new Character(CharacterType.SORCERER);
            case 3 -> new Character(CharacterType.BARD);
            case 4 -> new Character(CharacterType.ASSASSIN);
            default -> throw new IllegalStateException("Unexpected value.");
        };
    }

    //Adding characters to the list to player select one
    private void addCharactersToList() {
        characters.add(new Character(CharacterType.KNIGHT));
        characters.add(new Character(CharacterType.SORCERER));
        characters.add(new Character(CharacterType.BARD));
        characters.add(new Character(CharacterType.ASSASSIN));
    }

    public Character getCharacter() {
        return character;
    }

    //Remove all elements from monsterArray, generally to start a new level on createMonsters method
    private void clearMonsterList() {
        monsterArrayList.clear();
    }
}
