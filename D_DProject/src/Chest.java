import exceptions.EmptyChestException;
import exceptions.EmptyInventoryException;

import java.util.ArrayList;

public class Chest {

    private ArrayList<Item> itemList;
    private ArrayList<Item> chest;

    public Chest(Player player) {
        itemList = new ArrayList<>();
        chest = new ArrayList<>();
        addItemsToList();
        addItemsToChest();
        create(player);
    }

    public void create(Player player) {
        try {
            GameMessage.chestFound();
            if (chest.isEmpty()) throw new EmptyChestException();
            chest.forEach(e -> {
                System.out.println(e.getDescription());
                player.getSelectedCharacter().getInventory().getItemList().add(e);
            });
        } catch (EmptyChestException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    private void addItemsToChest() {
        for (Item item : itemList) {
            if (random() < 15) {
                chest.add(item);
            }
        }
    }

    private void addItemsToList() {
            itemList.add(ItemFactory.create(ItemType.DILDO));
            itemList.add(ItemFactory.create(ItemType.ASHES));
            itemList.add(ItemFactory.create(ItemType.TEDDY_BEAR));
            itemList.add(ItemFactory.create(ItemType.DIAMOND));
            itemList.add(ItemFactory.create(ItemType.EMERALD));
            itemList.add(ItemFactory.create(ItemType.HANDCUFFS));
            itemList.add(ItemFactory.create(ItemType.DEAD_BIRD));
            itemList.add(ItemFactory.create(ItemType.PAULO_PING_PONG_PADDLE));
            itemList.add(ItemFactory.create(ItemType.TIAGO_PHONE));
            itemList.add(ItemFactory.create(ItemType.FATIMA_WATER_BOTTLE));
            itemList.add(ItemFactory.create(ItemType.NUTELLA));
            itemList.add(ItemFactory.create(ItemType.MUSIC_KIT_JUSTIN_BIEBER));
            itemList.add(ItemFactory.create(ItemType.DUST));
            itemList.add(ItemFactory.create(ItemType.COW_SHIT));
            itemList.add(ItemFactory.create(ItemType.JOHN_WICK_PEN));
            itemList.add(ItemFactory.create(ItemType.BROKEN_GLASSES));
            itemList.add(ItemFactory.create(ItemType.DRAGON_CLAW));
            itemList.add(ItemFactory.create(ItemType.DRAGONITE_HEAD));
            itemList.add(ItemFactory.create(ItemType.MINECRAFT_DEAD_STEVE));
    }

    private int random() {
        return (int) (Math.random() * 100);
    }

    private int sizeRandom() {
        return (int) (Math.random() * 10) +1;
    }
}
