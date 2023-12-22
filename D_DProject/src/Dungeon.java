import exceptions.HealthPointsGreaterThan20Exception;
import exceptions.OperationCancelledException;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    private final ArrayList<ArrayList<Monster>> monsters;

    public static final int LEVEL_INDEX = 0;
    public static final int MONSTER_INDEX = 0;
    private final GameManager GAME_MANAGER;
    private boolean isInventoryOpen;
    private final Player player;

    public Dungeon(Player player, GameManager gameManager) {
        this.player = player;
        this.monsters = new ArrayList<>();
        this.GAME_MANAGER = gameManager;
    }

    public void init() {
        fillMonstersArray(monsters);
        boolean wantToLeave = false;
        int level = 1;

        System.out.println("\nType 0 to go back");
        do {
            if (!isPlayerAlive()) {
                monsters.clear();
                handlePlayerDefeat();
                return;
            }

            try {
                handleBattleTurn(level, wantToLeave);
            } catch (OperationCancelledException e) {
                System.out.println(e.getMessage());
                return;
            }

            if (isLevelCompleted()) {
                if (level == 5) {
                    System.out.println(Colors.FATIMAS_RED +
                            "▄██   ▄    ▄██████▄  ███    █▄                              \n" +
                            "███   ██▄ ███    ███ ███    ███                             \n" +
                            "███▄▄▄███ ███    ███ ███    ███                             \n" +
                            "▀▀▀▀▀▀███ ███    ███ ███    ███                             \n" +
                            "▄██   ███ ███    ███ ███    ███                             \n" +
                            "███   ███ ███    ███ ███    ███                             \n" +
                            "███   ███ ███    ███ ███    ███                             \n" +
                            " ▀█████▀   ▀██████▀  ████████▀                              \n" +
                            "                                                            \n" +
                            "   ▄████████    ▄████████  ▄█    █▄     ▄████████ ████████▄ \n" +
                            "  ███    ███   ███    ███ ███    ███   ███    ███ ███   ▀███\n" +
                            "  ███    █▀    ███    ███ ███    ███   ███    █▀  ███    ███\n" +
                            "  ███          ███    ███ ███    ███  ▄███▄▄▄     ███    ███\n" +
                            "▀███████████ ▀███████████ ███    ███ ▀▀███▀▀▀     ███    ███\n" +
                            "         ███   ███    ███ ███    ███   ███    █▄  ███    ███\n" +
                            "   ▄█    ███   ███    ███ ███    ███   ███    ███ ███   ▄███\n" +
                            " ▄████████▀    ███    █▀   ▀██████▀    ██████████ ████████▀ \n" +
                            "                                                            \n" +
                            "    ███        ▄█    █▄       ▄████████                     \n" +
                            "▀█████████▄   ███    ███     ███    ███                     \n" +
                            "   ▀███▀▀██   ███    ███     ███    █▀                      \n" +
                            "    ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄                         \n" +
                            "    ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀                         \n" +
                            "    ███       ███    ███     ███    █▄                      \n" +
                            "    ███       ███    ███     ███    ███                     \n" +
                            "   ▄████▀     ███    █▀      ██████████                     \n" +
                            "                                                            \n" +
                            " ▄█     █▄   ▄██████▄     ▄████████  ▄█          ▄████████  \n" +
                            "███     ███ ███    ███   ███    ███ ███         ███    ███  \n" +
                            "███     ███ ███    ███   ███    ███ ███         ███    █▀   \n" +
                            "███     ███ ███    ███  ▄███▄▄▄▄██▀ ███         ███         \n" +
                            "███     ███ ███    ███ ▀▀███▀▀▀▀▀   ███       ▀███████████  \n" +
                            "███     ███ ███    ███ ▀███████████ ███                ███  \n" +
                            "███ ▄█▄ ███ ███    ███   ███    ███ ███▌    ▄    ▄█    ███  \n" +
                            " ▀███▀███▀   ▀██████▀    ███    ███ █████▄▄██  ▄████████▀   \n" +
                            "                         ███    ███ ▀                       " + Colors.RESET);
                } else {
                    System.out.println(Colors.FATIMAS_RED +
                            "███▄▄▄▄      ▄████████ ▀████    ▐████▀     ███          \n" +
                            "███▀▀▀██▄   ███    ███   ███▌   ████▀  ▀█████████▄      \n" +
                            "███   ███   ███    █▀     ███  ▐███       ▀███▀▀██      \n" +
                            "███   ███  ▄███▄▄▄        ▀███▄███▀        ███   ▀      \n" +
                            "███   ███ ▀▀███▀▀▀        ████▀██▄         ███          \n" +
                            "███   ███   ███    █▄    ▐███  ▀███        ███          \n" +
                            "███   ███   ███    ███  ▄███     ███▄      ███          \n" +
                            " ▀█   █▀    ██████████ ████       ███▄    ▄████▀        \n" +
                            "                                                        \n" +
                            " ▄█          ▄████████  ▄█    █▄     ▄████████  ▄█      \n" +
                            "███         ███    ███ ███    ███   ███    ███ ███      \n" +
                            "███         ███    █▀  ███    ███   ███    █▀  ███      \n" +
                            "███        ▄███▄▄▄     ███    ███  ▄███▄▄▄     ███      \n" +
                            "███       ▀▀███▀▀▀     ███    ███ ▀▀███▀▀▀     ███      \n" +
                            "███         ███    █▄  ███    ███   ███    █▄  ███      \n" +
                            "███▌    ▄   ███    ███ ███    ███   ███    ███ ███▌    ▄\n" +
                            "█████▄▄██   ██████████  ▀██████▀    ██████████ █████▄▄██\n" +
                            "▀                                              ▀        " + Colors.RESET);
                    level++;
                }
                monsters.remove(monsters.get(LEVEL_INDEX));
            }
        } while (!monsters.isEmpty());

    }

    private boolean isPlayerAlive() {
        return player.getSelectedCharacter().getHealthPoints() > 0;
    }

    private boolean isMonsterAlive() {
        return monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0;
    }

    private boolean isLevelCompleted() {
        return monsters.get(LEVEL_INDEX).isEmpty();
    }

    int count = 0;

    private void handleBattleTurn(int level, boolean wantsToLeave) {
        Scanner scanner = new Scanner(System.in);
        Character selectedCharacter = player.getSelectedCharacter();
        int attackCounter = 0;
        while (monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0
                && player.getSelectedCharacter().getHealthPoints() > 0 && !wantsToLeave) {
            Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
            if (count < 1) {
                currentMonster.printMonsterArt();
                count++;
            }
            displayMenu();
            int option = scanner.nextInt();
            isInventoryOpen = false;
            switch (option) {
                case 0:
                    monsters.clear();
                    throw new OperationCancelledException();
                case 1:
                    fightMenu(level, wantsToLeave);
                    attackCounter++;
                    printDeathMessageIfDead();
                    break;
                case 2:
                    actMenu(currentMonster);
                    break;
                case 3:
                    itemsMenu(level);
                    break;
                case 4:
                    wantsToLeave = true;
                    break;
                default:
                    System.out.println(Colors.RED_BOLD_BRIGHT + "Invalid choice. Please try again." + Colors.RESET);
            }
        }
    }

    public static void displayMenu() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "✧✦✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Stay determinate " + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " ✧✦✧" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Fight" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2✦" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Act" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "3✧" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Inventory" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "4✦" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Run Away" + Colors.RESET);
        System.out.print(Colors.FATIMAS_RED + "Enter your choice: \n" + Colors.RESET);
    }

    public void actMenu(Monster currentMonster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "✧✦✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Act Menu " + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " ✧✦✧");
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Talk" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2✦" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Mercy" + Colors.RESET);
        System.out.print(Colors.FATIMAS_RED + "Enter your choice: \n" + Colors.RESET);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                try {
                    Character selectedCharacter = player.getSelectedCharacter();
                    selectedCharacter.characterTalk(currentMonster);
                    Thread.sleep(3500);
                    if (currentMonster.isSeduced()) {
                        currentMonster.monsterSeducedSpeak();
                    } else {
                        currentMonster.monsterSpeak();
                    }
                    Thread.sleep(2000);
                    break;
                } catch (Exception e) {
                    GameMessage.getExceptionMessage(e.getMessage());
                }
            case 2:
                if(currentMonster.isSeduced()) {
                    monsters.remove(monsters.get(LEVEL_INDEX));
                    GameMessage.getMercyMessage();
                }
                break;
            default:
                System.out.println(Colors.RED_BOLD_BRIGHT + "Invalid choice. Please try again.\n" + Colors.RESET);
        }
    }

    public void itemsMenu(int level) {
        GAME_MANAGER.getPlayerInventory();
        isInventoryOpen = true;
    }

    public void fightMenu(int level, boolean wantsToLeave) {
        int attackCounter = 0;
        Random random = new Random();
        Character selectedCharacter = player.getSelectedCharacter();
        while (monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0 && player.getSelectedCharacter().getHealthPoints() > 0 && !wantsToLeave) {
            Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
            Scanner scan = new Scanner(System.in);
            Boolean isInventoryOpen = false;

            System.out.println(Colors.YELLOW_BOLD_BRIGHT + "✧✦✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Choose an attack " + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " ✧✦✧" + Colors.RESET);
            System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Light Attack" + Colors.RESET);
            System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2✦" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Heavy Attack" + Colors.RESET);
            System.out.println(Colors.YELLOW_BOLD_BRIGHT + "3✧" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Ultimate Attack" + Colors.RESET);
            System.out.println(Colors.YELLOW_BOLD_BRIGHT + "4✧" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Back " + Colors.RESET);
            System.out.print(Colors.FATIMAS_RED + "Enter your choice: \n" + Colors.RESET);
            switch (scan.nextInt()) {
                case 0:
                    throw new OperationCancelledException();
                case 1:
                    if (attackCounter == 0) {
                        try {
                            currentMonster.monsterSpeak();
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            GameMessage.getExceptionMessage(e.getMessage());
                        }
                    }
                    currentMonster.takeDamage(player, "light");
                    try {
                        Thread.sleep(1000);
                        currentMonster.monsterAngerSpeak();
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        GameMessage.getExceptionMessage(e.getMessage());
                    }
                    attackCounter++;
                    printDeathMessageIfDead();
                    break;
                case 2:
                    if (attackCounter == 0) {
                        currentMonster.monsterSpeak();
                    }
                    currentMonster.takeDamage(player, "heavy");
                    currentMonster.monsterAngerSpeak();
                    printDeathMessageIfDead();
                    break;
                case 3:
                    try {
                        if (attackCounter == 0) {
                            currentMonster.monsterSpeak();
                        }
                        currentMonster.takeDamage(player, "ultimate");
                        currentMonster.monsterAngerSpeak();
                        printDeathMessageIfDead();
                    } catch (HealthPointsGreaterThan20Exception e) {
                        System.out.println(e.getMessage());
                        return;
                    }
                    break;
                case 4:
                    handleBattleTurn(level,false);
                    break;

            }
            if (!isInventoryOpen) {
                if (isMonsterAlive() && !currentMonster.isSeduced()) {
                    selectedCharacter.setHP(currentMonster.monsterAttack(selectedCharacter));
                }
                if (currentMonster.isSeduced()) currentMonster.setSeduced(false);
                if (!isMonsterAlive()) {
                    monsters.get(LEVEL_INDEX).remove(monsters.get(LEVEL_INDEX).get(MONSTER_INDEX));
                    if (monsters.get(LEVEL_INDEX).isEmpty()) {
                        monsters.remove(monsters.get(LEVEL_INDEX));
                        level++;
                    }
                    int randomNumber = random.nextInt(101);
                    if (randomNumber <= 15) {
                        new Chest(player);
                    }
                }

                System.out.println(Colors.FATIMAS_RED + "\nThe level of the dungeon: " + level + Colors.RESET);
                System.out.println(Colors.FATIMAS_RED + "Monsters left: " + monsters.get(LEVEL_INDEX).size() + Colors.RESET);
            }
        }
    }


    private void printDeathMessageIfDead() {
        if (!isMonsterAlive()) {
            Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
            System.out.println(Colors.FATIMAS_RED + "\nYou killed the " + currentMonster.getName() +
                    " and you earned " + currentMonster.getGold() + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " gold!" + Colors.RESET);
            player.addGold(currentMonster.getGold());
        }
    }

    private void handlePlayerDefeat() {
        System.out.println("Colors.RED_BOLD_BRIGHT +\n" +
                "                \"▓██   ██▓ ▒█████   █    ██    ▓█████▄  ██▓▓█████ ▓█████▄ \\n\" +\n" +
                "                \" ▒██  ██▒▒██▒  ██▒ ██  ▓██▒   ▒██▀ ██▌▓██▒▓█   ▀ ▒██▀ ██▌\\n\" +\n" +
                "                \"  ▒██ ██░▒██░  ██▒▓██  ▒██░   ░██   █▌▒██▒▒███   ░██   █▌\\n\" +\n" +
                "                \"  ░ ▐██▓░▒██   ██░▓▓█  ░██░   ░▓█▄   ▌░██░▒▓█  ▄ ░▓█▄   ▌\\n\" +\n" +
                "                \"  ░ ██▒▓░░ ████▓▒░▒▒█████▓    ░▒████▓ ░██░░▒████▒░▒████▓ \\n\" +\n" +
                "                \"   ██▒▒▒ ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒     ▒▒▓  ▒ ░▓  ░░ ▒░ ░ ▒▒▓  ▒ \\n\" +\n" +
                "                \" ▓██ ░▒░   ░ ▒ ▒░ ░░▒░ ░ ░     ░ ▒  ▒  ▒ ░ ░ ░  ░ ░ ▒  ▒ \\n\" +\n" +
                "                \" ▒ ▒ ░░  ░ ░ ░ ▒   ░░░ ░ ░     ░ ░  ░  ▒ ░   ░    ░ ░  ░ \\n\" +\n" +
                "                \" ░ ░         ░ ░     ░           ░     ░     ░  ░   ░    \\n\" +\n" +
                "                \" ░ ░                           ░                  ░      \" + Colors.RESET");
    }

    //Creating and adding monsters to the list
    private void fillMonstersArray(ArrayList<ArrayList<Monster>> monsters) {
        ArrayList<Integer> monstersOrder = getMonstersOrder();
        int counter = 0;
        int numberOfLevels = 5;
        int numberOfMonsters = 5;

        for (int level = 0; level < numberOfLevels; level++) {
            ArrayList<Monster> monstersLevel = new ArrayList<>();

            for (int monster = 0; monster < numberOfMonsters; monster++) {
                monstersLevel.add(MonsterFactory.createMonster(MonsterType.values()[monstersOrder.get(counter++)]));
            }

            monsters.add(monstersLevel);
        }
    }

    private ArrayList<Integer> getMonstersOrder() {
        ArrayList<Integer> monstersOrder = new ArrayList<>();
        int maximumNumberOfMonsters = 25;

        for (int i = 1, counter = 0; i <= maximumNumberOfMonsters; i++) {
            monstersOrder.add(randomizeNumber(monstersOrder, counter, 5 + counter));

            if (i % 5 == 0) {
                counter += 5;
            }
        }

        return monstersOrder;
    }

    private int randomizeNumber(ArrayList<Integer> monstersOrder, int origin, int bound) {
        Random randomize = new Random();
        int randomNumber;

        do {
            randomNumber = randomize.nextInt(origin, bound);
        } while (monstersOrder.contains(randomNumber));

        return randomNumber;
    }
}

