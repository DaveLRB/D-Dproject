import exceptions.CharacterListIsEmptyException;
import exceptions.CharacterNotFoundException;
import exceptions.InvalidTypeOfCharacterException;
import exceptions.ListNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class GameManager {
    private ArrayList<Character> characters;
    private Character character = null;
    private Player player;
    private final Scanner sc;
    private int level;
    private Dungeon dungeon;
    private boolean gameIsRunning;
    private String playerName;
    private int count = 1;

    public GameManager() {
        this.sc = new Scanner(System.in);
        this.characters = new ArrayList<>();
        addCharactersToList();
        playerSelectCharacter();
        this.player = new Player(playerName, character);
        this.level = 0;
        this.dungeon = new Dungeon(player);
        this.gameIsRunning = true;
    }



    public void init() {
        GameMessage.getBigBlankSpace();
        GameMessage.getMenuBigMessage();
        GameMessage.getBlankSpace();
        while (gameIsRunning) {
            if (player.getSELECTED_CHARACTER().getHealthPoints() > 0) {
                GameMessage.getMenuMessage();
                switch (sc.next()) {
                    case "1" -> /*dungeon.init();*/System.out.println();
                    case "2" -> checkCharacterStats(player);
                }
            } else {
                playerDeadMenu();
            }
        }
    }

    //Method to start the game: player need select a character. When he select, the character is stored at character instance.
    private void playerSelectCharacter() {
        GameMessage.getPlayerName();
        this.playerName = sc.next();
        GameMessage.getOneBlankSpace();
        GameMessage.getWelcomeMessage(playerName);
        try {
            while (character == null) {
                getListOfCharacters();
                GameMessage.getPlayerSelectMessage();
                this.character = getCharacterChoice();
            }
        } catch (InvalidTypeOfCharacterException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    //Adding characters to the list to player select one
    private void addCharactersToList() {
        try {
            characters.add(new Character(CharacterType.KNIGHT));
            characters.add(new Character(CharacterType.SORCERER));
            characters.add(new Character(CharacterType.BARD));
            characters.add(new Character(CharacterType.ASSASSIN));
        } catch (ListNotFoundException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    private Character getCharacterChoice() {
        try {
            return switch (sc.next()) {
                case "1" -> new Character(CharacterType.KNIGHT);
                case "2" -> new Character(CharacterType.SORCERER);
                case "3" -> new Character(CharacterType.BARD);
                case "4" -> new Character(CharacterType.ASSASSIN);
                default -> throw new InvalidTypeOfCharacterException("Character not found.");
            };
        } catch (InvalidTypeOfCharacterException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
        return null;
     }

    private void getListOfCharacters() {
        try {
            if (characters.isEmpty()) throw new CharacterListIsEmptyException("Empty character list.");
            count = 1;
            characters.forEach((character) -> System.out.println(count++ + " | " + character.getName() + " | Strength: " + character.getStrength() + " | Dexterity: " + character.getDexterity() + " | Charisma: " + character.getCharisma() + " | Intelligence: " + character.getIntelligence()));
        } catch (CharacterListIsEmptyException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public Character getCharacter() {
        return character;
    }

    //Check the player character stats
    private void checkCharacterStats(Player player) {
        try {
            if (player.getSELECTED_CHARACTER() == null) throw new CharacterNotFoundException();
            GameMessage.getPlayerStats(player);
        } catch (CharacterNotFoundException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    //When player die he need choose if create a new character or just leave game
    public void playerDeadMenu() {
        GameMessage.getDeadMessage();
        GameMessage.getMenuDead();
        switch (sc.next()) {
            case "1":
                this.character = null;
                playerSelectCharacter();
                init();
                break;
            case "2":
                gameIsRunning = false;
                break;
        }
    }
}
