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
            case HEAL_POTION -> new Item("HEAL POTION", 100, 50);
            case DILDO -> new Item("DILDO", "A big and robust thing...", 300, 1, 0 ,0 ,0);
            case ASHES -> new Item("ASHES", "Simple dust", 2);
            case TEDDY_BEAR -> new Item("TEDDY BEAR", "Something cute..", 20);
            case DIAMOND -> new Item("DIAMOND", "A precious diamond!", 300);
            case EMERALD -> new Item("EMERALD", "A good emerald!", 150);
            case HANDCUFFS -> new Item("HANDCUFFS", "Something shiny..", 50);
            case DEAD_BIRD -> new Item("DEAD BIRD", 4, "Something very smelly!");
            case PAULO_PING_PONG_PADDLE -> new Item("PAULO'S PING PONG PADDLE", "A powerful weapon.", 250, 19, 0, 0, 0);
            case TIAGO_PHONE -> new Item("TIAGO PHONE", "Tiago Phone...", 40);
            case FATIMA_WATER_BOTTLE -> new Item("FATIMA'S WATER BOTTLE", 25, 20);
            case NUTELLA -> new Item("NUTELLA", 40, 20);
            case MUSIC_KIT_JUSTIN_BIEBER -> new Item("MUSIC KIT JUSTIN BIEBER", "Something from 90'", 70);
            case DUST -> new Item("DUST", "Something that makes you sneeze", 0);
            case COW_SHIT -> new Item("COW SHIT", "Something very very smelly!", 60);
            case JOHN_WICK_PEN -> new Item("JOHN'S WICK PEN", "A simple weapon...", 250, 0, 0, 5, 0);
            case BROKEN_GLASSES -> new Item("BROKEN GLASSES", "A broken glasses...", 40);
            case DRAGON_CLAW -> new Item("DRAGON CLAW", "A rare weapon!", 150, 21, 0, 0, 0);
            case DRAGONITE_HEAD -> new Item("DRAGONITE HEAD", "Something... strange...", 150);
            case MINECRAFT_DEAD_STEVE -> new Item("MINECRAFT DEAD STEVE", "Something like what a fuck is this?", 100);
        };
    }
}
