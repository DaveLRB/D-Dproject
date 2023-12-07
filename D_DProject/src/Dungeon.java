import exceptions.HealthPointsGreaterThan20Exception;
import exceptions.OperationCancelledException;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon {

    private final ArrayList<ArrayList<Monster>> monsters;

    public static final int LEVEL_INDEX = 0;
    public static final int MONSTER_INDEX = 0;

    private final Player player;

    public Dungeon(Player player) {
        this.player = player;
        this.monsters = new ArrayList<>();
    }

    public void init() {
        fillMonstersArray(monsters);
        boolean wantToLeave = false;
        int level = 1;
        System.out.println("\nType 0 to go back");
        boolean isPlayerAlive = true;
        boolean isMonsterAlive;
        boolean isLevelCompleted;
        do {
            if (!isPlayerAlive) {
                handlePlayerDefeat();
                return;
            }

            try {
                handleBattleTurn(level, wantToLeave);
            } catch (OperationCancelledException e) {
                System.out.println(e.getMessage());
                return;
            }

            isPlayerAlive = player.getSELECTED_CHARACTER().getHealthPoints() > 0;
            isMonsterAlive = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0;

            if (!isMonsterAlive) {
                handleMonsterDefeat();
            }

            isLevelCompleted = monsters.get(LEVEL_INDEX).isEmpty();

            if (isLevelCompleted) {
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

    private void handleBattleTurn(int level, boolean wantsToLeave) {
        Monster currentMonster = monsters.get(LEVEL_INDEX).get(MONSTER_INDEX);
        Character selectedCharacter = player.getSELECTED_CHARACTER();

        while (monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getMonsterHP() > 0 && player.getSELECTED_CHARACTER().getHealthPoints() > 0 && !wantsToLeave) {
            int option = InputHelper.getOptionFromUser();
            switch (option) {
                case 0:
                    throw new OperationCancelledException();
                case 1:
                    currentMonster.takeDamage(player);
                    break;
                case 2:
                    currentMonster.takeSpecialDamage(player);
                    break;
                case 3:
                    try {
                        currentMonster.takeUltimateDamage(player);
                    } catch (HealthPointsGreaterThan20Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

            selectedCharacter.setHP(currentMonster.monsterAttack(selectedCharacter));

            System.out.println("\nThe level of the dungeon: " + level);
            System.out.println("Monsters left: " + monsters.get(LEVEL_INDEX).size());
        }
    }


    private void handleMonsterDefeat() {
        System.out.println("\nYou killed the " + monsters.get(LEVEL_INDEX).get(MONSTER_INDEX).getName());
        monsters.get(LEVEL_INDEX).remove(monsters.get(LEVEL_INDEX).get(MONSTER_INDEX));
    }

    private void handlePlayerDefeat() {
        System.out.println("\nYour character died\n");
    }

    //Creating and adding monsters to the list
    private void fillMonstersArray(ArrayList<ArrayList<Monster>> monsters) {
        ArrayList<Integer> monstersOrder = getMonstersOrder();
        int counter = 0;
        int NUMBER_OF_LEVELS = 5;
        for (int level = 0; level < NUMBER_OF_LEVELS; level++) {
            ArrayList<Monster> monstersLevel = new ArrayList<>();
            int NUMBER_OF_MONSTERS = 5;
            for (int monster = 0; monster < NUMBER_OF_MONSTERS; monster++) {
                monstersLevel.add(MonsterFactory.createMonster(MonsterType.values()[monstersOrder.get(counter)]));
                counter++;
            }
            monsters.add(monstersLevel);
        }
    }

    private ArrayList<Integer> getMonstersOrder() {
        int counter = 0;
        ArrayList<Integer> monstersOrder = new ArrayList<>();
        int MAXIMUM_NUMBER_OF_MONSTERS = 25;
        for (int i = 1; i <= MAXIMUM_NUMBER_OF_MONSTERS; i++) {
            monstersOrder.add(randomizeNumber(monstersOrder, counter, 5 + counter));
            if (i % 5 == 0) {
                counter += 5;
            }
        }
        return monstersOrder;
    }

    private int randomizeNumber(ArrayList<Integer> monstersOrder, int origin, int bound) {
        Random randomize = new Random();
        boolean doesNumberAlreadyExist;
        int randomNumber;
        do {
            randomNumber = randomize.nextInt(origin, bound);
            doesNumberAlreadyExist = false;
            for (Integer number : monstersOrder) {
                if (number.equals(randomNumber)) {
                    doesNumberAlreadyExist = true;
                    break;
                }
            }
        } while (doesNumberAlreadyExist);
        return randomNumber;
    }
}
