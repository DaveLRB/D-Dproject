import java.util.ArrayList;
import java.util.Random;

public class Dungeon {

    private ArrayList<ArrayList<Monster>> monsters;
    private final int NUMBER_OF_LEVELS = 5;
    private final int NUMBER_OF_MONSTERS = 5;
    private final int MAXIMUM_NUMBER_OF_MONSTERS = 25;

    public Dungeon() {
        this.monsters = new ArrayList<>();
    }

    private Player player;

    public Dungeon(Player player) {
        this.player = player;
    }

    public void createTurn() {
        fillMonstersArray(monsters);

    }

    //Creating and adding monsters to the list following your type
    private void fillMonstersArray(ArrayList<ArrayList<Monster>> monsters) {
        clearMonsterList();
        ArrayList<Integer> monstersOrder = getMonstersOrder();
        int counter = 0;
        for (int level = 0; level < NUMBER_OF_LEVELS; level++) {
            ArrayList<Monster> monstersLevel = new ArrayList<>();
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
        for (int i = 1; i <=MAXIMUM_NUMBER_OF_MONSTERS; i++) {
            if (!(i % 5 == 0)) {
                monstersOrder.add(randomizeNumber(monstersOrder, counter, 5 + counter));
            } else {
                monstersOrder.add(randomizeNumber(monstersOrder, counter, 5 + counter));
                counter+=5;
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

    private void randomizeMonsters() {
        int random = (int) (Math.random() * 6) + 1;
    }

    //Remove all elements from monsterArray, generally to start a new level on createMonsters method
    private void clearMonsterList() {
        monsters.clear();
    }

    private boolean isDungeonConcluded() {
        return false;
    }
}
