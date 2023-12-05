import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
    private ArrayList<Character> characters;
    private final Character character;
    private final Scanner sc;
    private int level;
    private boolean gameIsRunning;

    public GameManager() {
        this.sc = new Scanner(System.in);
        this.characters = new ArrayList<>();
        addCharactersToList();
        this.character = playerSelectCharacter();
        this.level = 0;
        this.gameIsRunning = true;
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
}
