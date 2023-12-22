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
                    System.out.println("You completed the dungeon!");
                } else {
                    System.out.println("You passed the level");
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

    private void handleBattleTurn(int level, boolean wantsToLeave) {
        Scanner scanner = new Scanner(System.in);
        Character selectedCharacter = player.getSelectedCharacter();
        int attackCounter = 0;
        while (monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0
                && player.getSelectedCharacter().getHealthPoints() > 0 && !wantsToLeave) {
            Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
            displayMenu();
            int option = scanner.nextInt();
            isInventoryOpen = false;
            switch (option) {
                case 0:
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
                    System.out.println("You ran away. Game over.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }}
        public static void displayMenu() {
            System.out.println("✧✦✧ Stay determinate ✧✦✧");
            System.out.println("1✧ Fight");
            System.out.println("2✦ Act");
            System.out.println("3✧ Inventory");
            System.out.println("4✦ Run Away");
            System.out.print("Enter your choice: ");
        }

        public void actMenu(Monster currentMonster) {
           Scanner scanner = new Scanner(System.in);
            System.out.println("✧✦✧ Act Menu ✧✦✧");
            System.out.println("1✧ Talk");
            System.out.println("2✦ Mercy");
            System.out.print("Enter your choice: ");
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
                    }catch (Exception e) {
                        GameMessage.getExceptionMessage(e.getMessage());
                    }
                case 2:
                    // Mercy
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        public void itemsMenu(int level) {
            GAME_MANAGER.getPlayerInventory();
            isInventoryOpen = true;
        }
        public void fightMenu(int level,boolean wantsToLeave) {
            int attackCounter = 0;
            Random random = new Random();
            Character selectedCharacter = player.getSelectedCharacter();
            while (monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0 && player.getSelectedCharacter().getHealthPoints() > 0 && !wantsToLeave) {
                Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
                Scanner scan = new Scanner(System.in);
                Boolean isInventoryOpen = false;

                System.out.println("✧✦✧ Choose an attack ✧✦✧");
                System.out.println("1✧ Light Attack");
                System.out.println("2✦ Heavy Attack");
                System.out.println("3✧ Ultimate Attack");
                System.out.println("4✧ Ultimate Attack");
                System.out.print("Enter your choice: ");
                switch (scan.nextInt()) {
                    case 0:
                        throw new OperationCancelledException();
                    case 1:
                        if (attackCounter == 0) {
                            currentMonster.monsterSpeak();
                        }
                        currentMonster.takeDamage(player, "light");
                        currentMonster.monsterAngerSpeak();
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
                        actMenu(currentMonster);

                } if (!isInventoryOpen) {
                    if (isMonsterAlive() && !currentMonster.isSeduced()) {
                        selectedCharacter.setHP(currentMonster.monsterAttack(selectedCharacter));
                    }
                    if (currentMonster.isSeduced()) currentMonster.setSeduced(false);
                    if (!isMonsterAlive()) {
                        monsters.get(LEVEL_INDEX).remove(monsters.get(LEVEL_INDEX).get(MONSTER_INDEX));
                        if(monsters.get(LEVEL_INDEX).isEmpty()){
                            monsters.remove(monsters.get(LEVEL_INDEX));
                            level++;
                        }
                        int randomNumber = random.nextInt(101);
                        if(randomNumber<=15){
                            new Chest(player);
                        }
                    }

                    System.out.println("\nThe level of the dungeon: " + level);
                    System.out.println("Monsters left: " + monsters.get(LEVEL_INDEX).size());
                }
            }
        }

    /*private void handleBattleTurn(int level, boolean wantsToLeave) {

        int attackCounter = 0;
        while (monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0 && player.getSelectedCharacter().getHealthPoints() > 0 && !wantsToLeave) {
            Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
            int option = InputHelper.getOptionFromUser();
            isInventoryOpen = false;
            switch (option) {
                case 0:
                    throw new OperationCancelledException();
                case 1:
                    if (attackCounter == 0) {
                        currentMonster.monsterSpeak();
                    }
                    currentMonster.takeDamage(player, "light");
                    currentMonster.monsterAngerSpeak();
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
                    GAME_MANAGER.getPlayerInventory();
                    isInventoryOpen = true;
                    break;
            }

            if (!isInventoryOpen) {
                if (isMonsterAlive() && !currentMonster.isSeduced()) {
                    selectedCharacter.setHP(currentMonster.monsterAttack(selectedCharacter));
                }
                if (currentMonster.isSeduced()) currentMonster.setSeduced(false);
                if (!isMonsterAlive()) {
                    monsters.get(LEVEL_INDEX).remove(monsters.get(LEVEL_INDEX).get(MONSTER_INDEX));
                    if(monsters.get(LEVEL_INDEX).isEmpty()){
                        monsters.remove(monsters.get(LEVEL_INDEX));
                        level++;
                    }
                    int randomNumber = random.nextInt(101);
                    if(randomNumber<=15){
                        new Chest(player);
                    }
                }

                System.out.println("\nThe level of the dungeon: " + level);
                System.out.println("Monsters left: " + monsters.get(LEVEL_INDEX).size());
            }
        }*/



            private void printDeathMessageIfDead () {
                if (!isMonsterAlive()) {
                    Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
                    System.out.println("\nYou killed the " + currentMonster.getName() +
                            " and you earned " + currentMonster.getGold() + " gold!");
                    player.addGold(currentMonster.getGold());
                }
            }

            private void handlePlayerDefeat () {
                System.out.println("\nYour character died\n");
            }

            //Creating and adding monsters to the list
            private void fillMonstersArray (ArrayList < ArrayList < Monster >> monsters) {
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

            private ArrayList<Integer> getMonstersOrder () {
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

            private int randomizeNumber (ArrayList < Integer > monstersOrder,int origin, int bound){
                Random randomize = new Random();
                int randomNumber;

                do {
                    randomNumber = randomize.nextInt(origin, bound);
                } while (monstersOrder.contains(randomNumber));

                return randomNumber;
            }
        }

