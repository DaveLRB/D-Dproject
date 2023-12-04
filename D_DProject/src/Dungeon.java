import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dungeon {

    private ArrayList<Monster> monsters;

    public Dungeon() {
        this.monsters = new ArrayList<>();
    }

    private Character playerCharacter;

    public Dungeon(Player player) {
        this.playerCharacter = player.getSelectedCharacter();
    }

    //Init dungeon with level 1 monsters
    public void startDungeon(ArrayList<Monster> monster_level) {
        for (Monster monster : monster_level_one) {
            while (!monster.isDead) {
                playerCharacter.attack(monster);
            }
        }
    }

    private void randomizeMonsters() {
        int random = (int) (Math.random() * 6) + 1;
    }

}
