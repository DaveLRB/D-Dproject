import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

    private ArrayList<Monster> monsterArrayList;
    private ArrayList<Character> characters;
    private final Character character;
    private final Scanner sc;

    public GameManager() {
        sc = new Scanner(System.in);
        characters = new ArrayList<>();
        monsterArrayList = new ArrayList<>();
        character = playerSelectCharacter();
        addCharactersToList();
        addMonstersToList();
    }

    private void addMonstersToList() {
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.SLIME));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.BABYSPIDERS));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.GOBLIN));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.SKELETON));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.ZOMBIE));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.SPECTRE));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.WEREWOLF));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.GHOST));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.WITCH));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.VAMPIRE));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.MUMMY));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.CREEPER));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.HARPY));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.CENTAUR));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.MINOTAUR));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.CYCLOPS));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.BASILISK));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.GRIFFIN));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.CHIMERA));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.MEDUSA));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.WYVERN));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.PHOENIX));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.KRAKEN));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.BEHEMOTH));
        monsterArrayList.add(MonsterFactory.createMonster(MonsterType.DRAGON));
    }

    public Character playerSelectCharacter() {
        int count = 0;
        GameMessage.getPlayerSelectCharacterMenu();
        // TODO: 04/12/2023 loop entre character para apresentar no menu
        for (Character character : characters) {
            System.out.println(count++ + " | "+character.getName());
        }
        System.out.print("Select character:");
        return switch (sc.nextInt()) {
            case 1 -> new Character(CharacterType.KNIGHT);
            case 2 -> new Character(CharacterType.SORCERER);
            case 3 -> new Character(CharacterType.BARD);
            case 4 -> new Character(CharacterType.ASSASSIN);
            default -> throw new IllegalStateException("Unexpected value.");
        };
    }

    private void addCharactersToList() {
        characters.add(new Character(CharacterType.KNIGHT));
        characters.add(new Character(CharacterType.SORCERER));
        characters.add(new Character(CharacterType.BARD));
        characters.add(new Character(CharacterType.ASSASSIN));
    }

    public Character getCharacter() {
        return character;
    }
}
