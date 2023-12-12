public class ItemFactory {
    public static Item create(ItemType itemType) {
        return switch (itemType) {
            case REGULAR_SWORD -> new Item("REGULAR SWORD", 140, 160, 7, 0, 0 ,0);
            case MAGIC_STAFF -> new Item("MAGIC STAFF", 150, 170, 0, 0 ,0, 11);
            case ZWEINHANDER -> new Item("ZWEINHANDER", 150, 160, 12, 0, 0, 0);
            case BATTLE_AXE -> new Item("BATTLE AXE", 170, 190, 10, 0, 0, 0);
            case DAGGERS -> new Item("DAGGERS", 170, 190, 0, 0, 8, 0);
            case SHORT_SWORD -> new Item("SHORT SWORD", 160, 190, 0, 0, 7, 0);
            case SAI -> new Item("SAI", 150, 180, 0, 0, 8, 0);
            case MAGIC_BOOK -> new Item("MAGIC BOOK", 180, 190, 0, 0, 0, 9);
            case WAND -> new Item("WAND", 140, 160, 0, 0, 0, 7);
            case SMALL_KNIFE -> new Item("SMALL KNIFE", 140, 160, 0, 5, 0, 0);
            case CROSSBOW -> new Item("CROSSBOW", 150, 170, 0, 9, 0, 0);
            case RAPIER -> new Item("RAPIER", 160, 180, 0, 8, 0, 0);
        };
    }
}
