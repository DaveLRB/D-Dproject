public class ItemFactory {
    public static Item create(ItemType itemType) {
        return switch (itemType) {
            case SWORD -> new Item("SWORD", 140, 12, 0, 0 ,0);
            case MAGIC_STAFF -> new Item("MAGIC_STAFF", 160, 0, 15, 0, 0);
        };
    }
}
