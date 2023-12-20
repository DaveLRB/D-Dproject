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
        this.dungeon = new Dungeon(player,this);
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
                    case "5" -> new Chest(player);
                }
            }
        }
    }

    private int inventoryCount = 1;

    public void getPlayerInventory() {
        try {
            if (player.getSelectedCharacter().getInventory().getItemList().isEmpty())
                throw new EmptyInventoryException();

            inventoryCount = 1;
            player.getSelectedCharacter().getInventory().getItemList().forEach((i) -> System.out.println(inventoryCount++ + " | " + i.getName()));
            GameMessage.getInventoryMenu();

            Item playerItem;

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    GameMessage.getOption();
                    int choiceEquip = sc.nextInt() - 1;
                    playerItem = player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip);
                    if (player.isEquiped()) throw new AlreadyEquipedException();
                    if (choiceEquip < 0 || choiceEquip >= player.getSelectedCharacter().getInventory().getItemList().size()) {
                        throw new UnableToEquipAnUnknownItem();
                    }
                    player.setEquiped(true);
                    player.setWhatIsEquiped(playerItem.getName());
                    player.getSelectedCharacter().setCharisma(playerItem.getCharisma());
                    player.getSelectedCharacter().setIntelligence(playerItem.getIntelligence());
                    player.getSelectedCharacter().setDexterity(playerItem.getDexterity());
                    player.getSelectedCharacter().setStrength(playerItem.getStrength());
                }
                case 2 -> {
                    GameMessage.getOption();
                    int choiceEquip = sc.nextInt() - 1;
                    playerItem = player.getSelectedCharacter().getInventory().getItemList().get(choiceEquip);
                    if (!player.isEquiped()) throw new NothingEquipedException();
                    if (choiceEquip < 0 || choiceEquip >= player.getSelectedCharacter().getInventory().getItemList().size()) {
                        throw new UnableToEquipAnUnknownItem();
                    }
                    player.setEquiped(false);
                    player.setWhatIsEquiped("Nothing");
                    player.getSelectedCharacter().removeCharisma(playerItem.getCharisma());
                    player.getSelectedCharacter().removeIntelligence(playerItem.getIntelligence());
                    player.getSelectedCharacter().removeDexterity(playerItem.getDexterity());
                    player.getSelectedCharacter().removeStrength(playerItem.getStrength());
                }
                case 3 -> {
                    int choicePotion = sc.nextInt() - 1;
                    playerItem = player.getSelectedCharacter().getInventory().getItemList().get(choicePotion);
                    if (choicePotion < 0 || choicePotion >= player.getSelectedCharacter().getInventory().getItemList().size()) {
                        throw new UnableToEquipAnUnknownItem();
                    }
                    if(playerItem.getName().equals("HEAL POTION")) {
                        player.getSelectedCharacter().setHealthPoints(100);
                        GameMessage.usedHealPotion();
                        player.getSelectedCharacter().getInventory().getItemList().remove(choicePotion);
                    } else {
                        GameMessage.errorUsingSomething(player);
                    }
                }
            }
        } catch (EmptyInventoryException | AlreadyEquipedException | NothingEquipedException e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean isPlayerDead() {
        return player.getSelectedCharacter().getHealthPoints() <= 0;
    }

    //Method to start the game: player need select a character. When he select, the character is stored at character instance.
    private void playerSelectCharacter() {
        GameMessage.getPlayerName();
        this.playerName = sc.nextLine();
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
