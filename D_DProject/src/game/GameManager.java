package game;

import entities.Character;
import entities.CharacterType;
import entities.Player;
import exceptions.CharacterNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
    private ArrayList<Character> characters;
    private Character character = null;
    private Player player;
    private final Scanner sc;
    private int level;
    private Dungeon dungeon;
    private boolean gameIsRunning;
    private String playerName;

    public GameManager() {
        this.sc = new Scanner(System.in);
        this.characters = new ArrayList<>();
        addCharactersToList();
        this.character = playerSelectCharacter();
        this.player = new Player(playerName, character);
        this.level = 0;
        this.dungeon = new Dungeon(player);
        this.gameIsRunning = true;
    }

    public void init() {
        GameMessage.getBigBlankSpace();
        GameMessage.getMenuBigMessage();
        GameMessage.getBlankSpace();
        while(gameIsRunning) {
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
    private Character playerSelectCharacter() {
        GameMessage.getPlayerName();
        this.playerName = sc.next();
        GameMessage.getOneBlankSpace();
        GameMessage.getWelcomeMessage(playerName);
        int count = 1;
        for (Character character : characters) {
            System.out.println(count++ + " | "+character.getName() + " | Strength: "+character.getStrength() + " | Dexterity: "+character.getDexterity() + " | Charisma: "+ character.getCharisma() + " | Intelligence: "+character.getIntelligence());
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

    //Check the player character stats
    private void checkCharacterStats(Player player) {
        try {
            if (player.getSELECTED_CHARACTER() == null) throw new CharacterNotFoundException("Invalid character.");
            GameMessage.getPlayerStats(player);
        } catch (CharacterNotFoundException e) {
            GameMessage.getOneBlankSpace();
            GameMessage.getExceptionMessage(e.getMessage());
            GameMessage.getOneBlankSpace();
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
