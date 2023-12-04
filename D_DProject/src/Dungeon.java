import java.util.ArrayList;

public class Dungeon {

    private Character playerCharacter;

    public Dungeon(Player player) {
        // TODO: check getCharacter Method in Player Class
        this.playerCharacter = player.getSelectedCharacter();
    }

    //Init dungeon with level 1 monsters
    public void startDungeon(ArrayList<Monster> monsters) {

    }
}
