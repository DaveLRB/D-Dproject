public class GameMessage {
    public static void getMenuMessage() {
        System.out.println("1 - Enter the dungeon");
        System.out.println("2 - Check character stats");
        System.out.print("Option: ");
    }

    public static void getPlayerSelectMessage() {
        System.out.print("Select character: ");
    }

    public static void getBigBlankSpace() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void getBlankSpace() {
        System.out.println("\n\n");
    }

    public static void getSelectPlayerBigMessage() {
        System.out.println("   ▄████████    ▄████████  ▄█          ▄████████  ▄████████     ███             ▄███████▄  ▄█          ▄████████ ▄██   ▄      ▄████████    ▄████████ \n" +
                "  ███    ███   ███    ███ ███         ███    ███ ███    ███ ▀█████████▄        ███    ███ ███         ███    ███ ███   ██▄   ███    ███   ███    ███ \n" +
                "  ███    █▀    ███    █▀  ███         ███    █▀  ███    █▀     ▀███▀▀██        ███    ███ ███         ███    ███ ███▄▄▄███   ███    █▀    ███    ███ \n" +
                "  ███         ▄███▄▄▄     ███        ▄███▄▄▄     ███            ███   ▀        ███    ███ ███         ███    ███ ▀▀▀▀▀▀███  ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                "▀███████████ ▀▀███▀▀▀     ███       ▀▀███▀▀▀     ███            ███          ▀█████████▀  ███       ▀███████████ ▄██   ███ ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                "         ███   ███    █▄  ███         ███    █▄  ███    █▄      ███            ███        ███         ███    ███ ███   ███   ███    █▄  ▀███████████ \n" +
                "   ▄█    ███   ███    ███ ███▌    ▄   ███    ███ ███    ███     ███            ███        ███▌    ▄   ███    ███ ███   ███   ███    ███   ███    ███ \n" +
                " ▄████████▀    ██████████ █████▄▄██   ██████████ ████████▀     ▄████▀         ▄████▀      █████▄▄██   ███    █▀   ▀█████▀    ██████████   ███    ███ \n" +
                "                          ▀                                                               ▀                                               ███    ███ ");
    }

    public static void getMenuBigMessage() {
        System.out.println("████████▄  ███    █▄  ███▄▄▄▄      ▄██████▄     ▄████████  ▄██████▄  ███▄▄▄▄      ▄████████ \n" +
                "███   ▀███ ███    ███ ███▀▀▀██▄   ███    ███   ███    ███ ███    ███ ███▀▀▀██▄   ███    ███ \n" +
                "███    ███ ███    ███ ███   ███   ███    █▀    ███    █▀  ███    ███ ███   ███   ███    █▀  \n" +
                "███    ███ ███    ███ ███   ███  ▄███         ▄███▄▄▄     ███    ███ ███   ███   ███        \n" +
                "███    ███ ███    ███ ███   ███ ▀▀███ ████▄  ▀▀███▀▀▀     ███    ███ ███   ███ ▀███████████ \n" +
                "███    ███ ███    ███ ███   ███   ███    ███   ███    █▄  ███    ███ ███   ███          ███ \n" +
                "███   ▄███ ███    ███ ███   ███   ███    ███   ███    ███ ███    ███ ███   ███    ▄█    ███ \n" +
                "████████▀  ████████▀   ▀█   █▀    ████████▀    ██████████  ▀██████▀   ▀█   █▀   ▄████████▀ ");
    }

    public static void getPlayerName() {
        System.out.print("Welcome, welcome! Whats your name? ");
    }

    public static void getWelcomeMessage(String name) {
        System.out.println("Welcome "+name+", please select a character:");
    }

    public static void getOneBlankSpace() {
        System.out.println();
    }

    public static void getPlayerStats(Player player) {
        getOneBlankSpace();
        System.out.println("Character: "+player.getSelectedCharacter().getName()+"\n" + "\n"+
                "Types of attack:\nStrength: "+player.getSelectedCharacter().getStrength()+"\nDexterity: "+player.getSelectedCharacter().getDexterity()+
                "\nCharisma: "+player.getSelectedCharacter().getCharisma()+"\nIntelligence: "+player.getSelectedCharacter().getIntelligence());
        getOneBlankSpace();
        System.out.println("HP: "+player.getSelectedCharacter().getHealthPoints());
        System.out.println("XP: "+player.getXp());
        getOneBlankSpace();
    }

    public static void getExceptionMessage(String message) {
        System.out.println(message);
    }

    public static void getDeadMessage() {
        System.out.println("You're dead.");
        getOneBlankSpace();
    }

    public static void getMenuDead() {
        System.out.println("1 - Create a new character");
        System.out.println("2 - Leave game");
    }

    private static int count = 1;
    public static void itemListShop(Shop shop) {
        shop.getShopList().forEach((s) -> System.out.println(count++ + s.getName() + "\n"));
    }

    public static void shopMenu() {
        System.out.println("1 - BUY");
        System.out.println("2 - UPGRADE");
        System.out.println("3 - LEAVE");
    }

    public static void getShopSuccessMessage(Item item) {
        System.out.println("You bought "+ item.getName() + " for "+item.getPriceToBuy()+" gold.");
    }

    public static void getOption() {
        System.out.print("Option: ");
    }

    private static int count2 = 0;

    public static void getPlayerInventoryList(Player player) {
        //player.getSELECTED_CHARACTER().getInventory((inv) -> System.out.println(count2++ + " " + inv.getName()));
    }
}
