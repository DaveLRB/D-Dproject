import exceptions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
    private ArrayList<Character> characters;
    private Character character = null;
    private Player player;
    private final Scanner sc;
    private Dungeon dungeon;
    private boolean gameIsRunning;
    private String playerName;
    private int count = 1;
    private Shop shop;

    public GameManager() {
        this.sc = new Scanner(System.in);
        this.characters = new ArrayList<>();
        addCharactersToList();
        playerSelectCharacter();
        this.player = new Player(playerName, character);
        this.dungeon = new Dungeon(player);
        this.gameIsRunning = true;
        shop = new Shop(player);
    }

    public void init() {
        GameMessage.getBigBlankSpace();
        GameMessage.getMenuBigMessage();
        GameMessage.getBlankSpace();
        while (gameIsRunning) {
            if (isPlayerDead()) {
                playerDeadMenu();
            } else {
                GameMessage.getMenuMessage();
                switch (sc.next()) {
                    case "1" -> dungeon.init();
                    case "2" -> checkCharacterStats(player);
                    case "3" -> getPlayerInventory();
                    case "4" -> shop.enter();
                }
            }
        }
    }

    private int inventoryCount = 1;

    private void getPlayerInventory() {
        if (player.getSelectedCharacter().getInventory().getItemList().isEmpty()) throw new EmptyInventoryException();

        inventoryCount = 1;
        player.getSelectedCharacter().getInventory().getItemList().forEach((i) -> System.out.println(i.getName()));

        GameMessage.getInventoryMenu();
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                player.getSelectedCharacter().getInventory().getItemList().forEach((i) -> System.out.println(inventoryCount++ + " | " + i.getName()));
                int choiceEquip = sc.nextInt();
                if (player.isEquiped()) throw new AlreadyEquipedException();
                player.setEquiped(true);
                player.setWhatIsEquiped(player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getName());
                player.getSelectedCharacter().setCharisma(player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getCharisma());
                player.getSelectedCharacter().setIntelligence(player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getIntelligence());
                player.getSelectedCharacter().setDexterity(player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getDexterity());
                player.getSelectedCharacter().setStrength(player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getStrength());
            }
            case 2 -> {
                int choiceEquip = sc.nextInt();
                if (!player.isEquiped()) throw new NothingEquipedException();
                player.setEquiped(false);
                player.setWhatIsEquiped("Nothing");
                player.getSelectedCharacter().setCharisma(player.getSelectedCharacter().getCharisma() - player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getCharisma());
                player.getSelectedCharacter().setIntelligence(player.getSelectedCharacter().getIntelligence() - player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getIntelligence());
                player.getSelectedCharacter().setDexterity(player.getSelectedCharacter().getDexterity() - player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getDexterity());
                player.getSelectedCharacter().setStrength(player.getSelectedCharacter().getStrength() - player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip - 1).getStrength());
            }
        }
    }

    public boolean isPlayerDead() {
        return player.getSelectedCharacter().getHealthPoints() <= 0;
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
            if (player.getSelectedCharacter() == null) throw new CharacterNotFoundException();
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
                character.setHealthPoints(100);
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
