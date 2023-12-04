import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

    private ArrayList<Monster> monsterArrayList;
    private Character character;
    private Scanner sc;
    private GameMessage gameMessage;

    public GameManager() {
        gameMessage = new GameMessage();
        sc = new Scanner(System.in);
        monsterArrayList = new ArrayList<>();
        character = playerSelectCharacter();
    }

    public Character playerSelectCharacter() {
        gameMessage.getPlayerSelectCharacterMenu();
        System.out.print("Select character:");
        return switch (sc.nextInt()) {
            case 1 -> new Character(CharacterType.KNIGHT);
            case 2 -> new Character(CharacterType.SORCERER);
            case 3 -> new Character(CharacterType.BARD);
            case 4 -> new Character(CharacterType.ASSASSIN);
            default -> throw new IllegalStateException("Unexpected value.");
        };
    }
}
