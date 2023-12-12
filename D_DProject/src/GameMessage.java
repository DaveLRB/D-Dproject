public class GameMessage {
    public static void getMenuMessage() {
        System.out.println("1 - Enter the dungeon");
        System.out.println("2 - Check character stats");
        System.out.println("3 - Check inventory");
        System.out.println("4 - Shop");
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

        Item playerItem = null;

        if(player.isEquiped()) {
            for (Item item : player.getSelectedCharacter().getInventory().getItemList()) {
                if(player.getWhatIsEquiped().equals(item.getName())) {
                    playerItem = item;
                }
            }
        }

        int str = playerItem != null ? playerItem.getStrength() : 0;
        int dex = playerItem != null ? playerItem.getDexterity() : 0;
        int cha = playerItem != null ? playerItem.getCharisma() : 0;
        int ite = playerItem != null ? playerItem.getIntelligence() : 0;

        System.out.println("Character: "+player.getSelectedCharacter().getName()+"\n" + "\n"+
                "Types of attack:" +
                "\nStrength: "+player.getSelectedCharacter().getStrength() + " (+"+ str +")"
                +"\nDexterity: " +player.getSelectedCharacter().getDexterity() + " (+"+ dex +")"
                + "\nCharisma: "+player.getSelectedCharacter().getCharisma() + " (+"+ cha +")"
                +"\nIntelligence: "+player.getSelectedCharacter().getIntelligence() + " (+"+ ite +")");
        getOneBlankSpace();
        System.out.println("Equiped: " + player.getWhatIsEquiped());
        System.out.println("HP: "+player.getSelectedCharacter().getHealthPoints());
        System.out.println("XP: "+player.getXp());
        getOneBlankSpace();
    }

    public static void getExceptionMessage(String message) {
        System.err.println(message);
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
        count = 1;
        for (Item item : shop.getShopList()) {
            if(item.getCharisma() != null) {
                System.out.println(count++ + " | " + item.getName() + " | Price: " + item.getPriceToBuy() + " | Skill: +" + item.getSkillToMenu());
            } else {
                System.out.println(count++ + " | " + item.getName() + " | Price: " + item.getPriceToBuy());
            }
        }
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

    private static int count2 = 1;

    public static void getPlayerInventoryList(Player player) {
        for (Item item : player.getSelectedCharacter().getInventory().getItemList()) {
            System.out.println(count2++ + " | " + item.getName());
        }
    }

    public static void getPlayerInventoryListToUpgrade(Player player) {
        count2=1;
        for (Item item : player.getSelectedCharacter().getInventory().getItemList()) {
            if(item.getWeaponBetterSkill() != 50) {
                System.out.println(count2++ + " | " + item.getName() + " (" + item.getPriceToUpgrade() + " gold to upgrade)");
            } else {
                System.out.println(count2++ + " | " + item.getName() + " (Can't upgrade anymore)");
            }
        }
    }

    public static void getInventoryMenu() {
        System.out.println("1 - Equip item");
        System.out.println("2 - Unquip item");
        System.out.println("2 - Exit");
    }

    public static void upgradeSuccess(Item item) {
        System.out.println("You upgraded your "+item.getName()+".");
    }
}
