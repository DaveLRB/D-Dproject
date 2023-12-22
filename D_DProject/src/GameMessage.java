import java.util.LinkedList;
import java.util.Scanner;

public class GameMessage {
    public static void getMenuMessage() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧" +Colors.RESET + Colors.WHITE_BOLD_BRIGHT+  " Enter the dungeon" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +"2✦"+Colors.RESET + Colors.WHITE_BOLD_BRIGHT+" Check character stats"+ Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +"3✧"+Colors.RESET + Colors.WHITE_BOLD_BRIGHT+" Check inventory"+ Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +"4✦"+Colors.RESET + Colors.WHITE_BOLD_BRIGHT+" Shop"+ Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +"5✧"+Colors.RESET + Colors.WHITE_BOLD_BRIGHT+" Leave game"+ Colors.RESET);
        System.out.print(Colors.FATIMAS_RED + "Option: \n" + Colors.RESET);
    }

    public static void getPlayerSelectMessage() {
        System.out.print(Colors.FATIMAS_RED + "Select character: " + Colors.RESET);
    }

    public static void getBigBlankSpace() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void getBlankSpace() {
        System.out.println("\n\n");
    }

    public static void getSelectPlayerBigMessage() {
        System.out.println(Colors.FATIMAS_RED + "\n" +
                "   ▄████████    ▄████████  ▄█          ▄████████  ▄████████     ███             ▄███████▄  ▄█          ▄████████ ▄██   ▄      ▄████████    ▄████████ \n" +
                "  ███    ███   ███    ███ ███         ███    ███ ███    ███ ▀█████████▄        ███    ███ ███         ███    ███ ███   ██▄   ███    ███   ███    ███ \n" +
                "  ███    █▀    ███    █▀  ███         ███    █▀  ███    █▀     ▀███▀▀██        ███    ███ ███         ███    ███ ███▄▄▄███   ███    █▀    ███    ███ \n" +
                "  ███         ▄███▄▄▄     ███        ▄███▄▄▄     ███            ███   ▀        ███    ███ ███         ███    ███ ▀▀▀▀▀▀███  ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                " ███████████ ▀▀███▀▀▀     ███       ▀▀███▀▀▀     ███            ███          ▀█████████▀  ███       ▀███████████ ▄██   ███ ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                "         ███   ███    █▄  ███         ███    █▄  ███    █▄      ███            ███        ███         ███    ███ ███   ███   ███    █▄  ▀███████████ \n" +
                "   ▄█    ███   ███    ███ ███▌    ▄   ███    ███ ███    ███     ███            ███        ███▌    ▄   ███    ███ ███   ███   ███    ███   ███    ███ \n" +
                " ▄████████▀    ██████████ █████▄▄██   ██████████ ████████▀     ▄████▀         ▄████▀      █████▄▄██   ███    █▀   ▀█████▀    ██████████   ███    ███ \n" +
                "                                                                                                                                                     \n" + Colors.RESET);
    }

    public static void getMenuBigMessage() {
        System.out.println(Colors.FATIMAS_RED + "\n" +
                "      ▄█     █▄     ▄████████  ▄█        ▄████████  ▄██████▄    ▄▄▄▄███▄▄▄▄      ▄████████          ███      ▄██████▄      \n" +
                "     ███     ███   ███    ███ ███       ███    ███ ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███      ▀█████████▄ ███    ███     \n" +
                "     ███     ███   ███    █▀  ███       ███    █▀  ███    ███ ███   ███   ███   ███    █▀          ▀███▀▀██ ███    ███     \n" +
                "     ███     ███  ▄███▄▄▄     ███       ███        ███    ███ ███   ███   ███  ▄███▄▄▄              ███   ▀ ███    ███     \n" +
                "     ███     ███ ▀▀███▀▀▀     ███       ███        ███    ███ ███   ███   ███ ▀▀███▀▀▀              ███     ███    ███     \n" +
                "     ███     ███   ███    █▄  ███       ███    █▄  ███    ███ ███   ███   ███   ███    █▄           ███     ███    ███     \n" +
                "     ███ ▄█▄ ███   ███    ███ ███▌    ▄ ███    ███ ███    ███ ███   ███   ███   ███    ███          ███     ███    ███     \n" +
                "      ▀███▀███▀    ██████████ █████▄▄██ ████████▀   ▀██████▀   ▀█   ███   █▀    ██████████         ▄████▀     ▀██████▀      \n" +
                "                                                                                                                           \n" +
                "                                                                                                                           \n" +
                "                                                       The original                                                        \n" +
                "                                                                                                                           \n" +
                "                                                                                                                           \n" +
                "████████▄     ▄████████    ▄████████    ▄██████▄   ▄██████▄  ███▄▄▄▄      ▄████████         ▄████████ ███▄▄▄▄   ████████▄  \n" +
                "███   ▀███   ███    ███   ███    ███   ███    ███ ███    ███ ███▀▀▀██▄   ███    ███        ███    ███ ███▀▀▀██▄ ███   ▀███ \n" +
                "███    ███   ███    ███   ███    ███   ███    █▀  ███    ███ ███   ███   ███    █▀         ███    ███ ███   ███ ███    ███ \n" +
                "███    ███  ▄███▄▄▄▄██▀   ███    ███  ▄███        ███    ███ ███   ███   ███               ███    ███ ███   ███ ███    ███ \n" +
                "███    ███ ▀▀███▀▀▀▀▀   ▀███████████ ▀▀███ ████▄  ███    ███ ███   ███ ▀███████████      ▀███████████ ███   ███ ███    ███ \n" +
                "███    ███ ▀███████████   ███    ███   ███    ███ ███    ███ ███   ███          ███        ███    ███ ███   ███ ███    ███ \n" +
                "███   ▄███   ███    ███   ███    ███   ███    ███ ███    ███ ███   ███    ▄█    ███        ███    ███ ███   ███ ███   ▄███ \n" +
                "████████▀    ███    ███   ███    █▀    ████████▀   ▀██████▀   ▀█   █▀   ▄████████▀         ███    █▀   ▀█   █▀  ████████▀  \n" +
                "                                                                                                                           \n" +
                "                                                                                                                           \n" +
                "               ████████▄  ███    █▄  ███▄▄▄▄      ▄██████▄     ▄████████  ▄██████▄  ███▄▄▄▄      ▄████████                 \n" +
                "               ███   ▀███ ███    ███ ███▀▀▀██▄   ███    ███   ███    ███ ███    ███ ███▀▀▀██▄   ███    ███                 \n" +
                "               ███    ███ ███    ███ ███   ███   ███    █▀    ███    █▀  ███    ███ ███   ███   ███    █▀                  \n" +
                "               ███    ███ ███    ███ ███   ███  ▄███         ▄███▄▄▄     ███    ███ ███   ███   ███                        \n" +
                "               ███    ███ ███    ███ ███   ███ ▀▀███ ████▄  ▀▀███▀▀▀     ███    ███ ███   ███ ▀███████████                 \n" +
                "               ███    ███ ███    ███ ███   ███   ███    ███   ███    █▄  ███    ███ ███   ███          ███                 \n" +
                "               ███   ▄███ ███    ███ ███   ███   ███    ███   ███    ███ ███    ███ ███   ███    ▄█    ███                 \n" +
                "               ████████▀  ████████▀   ▀█   █▀    ████████▀    ██████████  ▀██████▀   ▀█   █▀   ▄████████▀                  \n" +
                "                                                                                                                           \n" + Colors.RESET);
    }

    public static void getPlayerName() {
        System.out.print(Colors.FATIMAS_RED + "Welcome, welcome! Whats your name? " + Colors.RESET);
    }

    public static void getWelcomeMessage(String name) {
        System.out.println(Colors.FATIMAS_RED + "Welcome " + name + ", please select a character:" + Colors.RESET);
    }

    public static void getOneBlankSpace() {
        System.out.println();
    }

    public static void getPlayerStats(Player player) {
        getOneBlankSpace();

        Item playerItem = null;

        if (player.isEquiped()) {
            playerItem = player
                    .getSelectedCharacter()
                    .getInventory()
                    .getItemList()
                    .stream()
                    .filter(e -> player.getWhatIsEquiped().equals(e.getName()))
                    .findFirst()
                    .orElse(null)
            ;

            for (Item item : player.getSelectedCharacter().getInventory().getItemList()) {
                if (player.getWhatIsEquiped().equals(item.getName())) {
                    playerItem = item;
                }
            }
        }

        int str = playerItem != null ? playerItem.getStrength() : 0;
        int dex = playerItem != null ? playerItem.getDexterity() : 0;
        int cha = playerItem != null ? playerItem.getCharisma() : 0;
        int ite = playerItem != null ? playerItem.getIntelligence() : 0;

        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "Character: " + Colors.RESET + player.getSelectedCharacter().getName() + "\n" + "\n" +
                Colors.YELLOW_BOLD_BRIGHT + "Types of attack:" +Colors.RESET +
                Colors.YELLOW_BOLD_BRIGHT +"\nStrength: " + Colors.RESET + player.getSelectedCharacter().getStrength() + " (+" + str + ")" +
                Colors.YELLOW_BOLD_BRIGHT + "\nDexterity: " + Colors.RESET + player.getSelectedCharacter().getDexterity() + " (+" + dex + ")" +
                Colors.YELLOW_BOLD_BRIGHT + "\nCharisma: " + Colors.RESET + player.getSelectedCharacter().getCharisma() + " (+" + cha + ")" +
                Colors.YELLOW_BOLD_BRIGHT + "\nIntelligence: " + Colors.RESET + player.getSelectedCharacter().getIntelligence() + " (+" + ite + ")");
        getOneBlankSpace();
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "Equiped: " + player.getWhatIsEquiped()+Colors.RESET);

        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "HP: " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + player.getSelectedCharacter().getHealthPoints() + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "XP: " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + player.getXp() + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "GOLD: " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + player.getGold() + Colors.RESET);


        getOneBlankSpace();
    }

    public static void getExceptionMessage(String message) {
        System.err.println(message);
    }

    public static void getDeadMessage() {
        System.out.println(Colors.RED_BOLD_BRIGHT +
                "▓██   ██▓ ▒█████   █    ██    ▓█████▄  ██▓▓█████ ▓█████▄ \n" +
                " ▒██  ██▒▒██▒  ██▒ ██  ▓██▒   ▒██▀ ██▌▓██▒▓█   ▀ ▒██▀ ██▌\n" +
                "  ▒██ ██░▒██░  ██▒▓██  ▒██░   ░██   █▌▒██▒▒███   ░██   █▌\n" +
                "  ░ ▐██▓░▒██   ██░▓▓█  ░██░   ░▓█▄   ▌░██░▒▓█  ▄ ░▓█▄   ▌\n" +
                "  ░ ██▒▓░░ ████▓▒░▒▒█████▓    ░▒████▓ ░██░░▒████▒░▒████▓ \n" +
                "   ██▒▒▒ ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒     ▒▒▓  ▒ ░▓  ░░ ▒░ ░ ▒▒▓  ▒ \n" +
                " ▓██ ░▒░   ░ ▒ ▒░ ░░▒░ ░ ░     ░ ▒  ▒  ▒ ░ ░ ░  ░ ░ ▒  ▒ \n" +
                " ▒ ▒ ░░  ░ ░ ░ ▒   ░░░ ░ ░     ░ ░  ░  ▒ ░   ░    ░ ░  ░ \n" +
                " ░ ░         ░ ░     ░           ░     ░     ░  ░   ░    \n" +
                " ░ ░                           ░                  ░      " + Colors.RESET);
        getOneBlankSpace();
    }

    public static void getMenuDead() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Create a new character" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2✦ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Leave game" + Colors.RESET);
    }

    private static int count = 1;

    public static void itemListShop(Shop shop) {
        count = 1;
        for (Item item : shop.getShopList()) {
            if (item.getCharisma() != null) {
                System.out.println(Colors.YELLOW_BOLD_BRIGHT + "" + count++ +Colors.RESET +Colors.WHITE_BOLD_BRIGHT +  " | " + item.getName() + " | Price: " + item.getPriceToBuy() + " | Skill: +" + item.getSkillToMenu() + Colors.RESET);
            } else {
                System.out.println(Colors.YELLOW_BOLD_BRIGHT + "" + count++ +Colors.RESET +Colors.WHITE_BOLD_BRIGHT + " | " + item.getName() + " | Price: " + item.getPriceToBuy() + Colors.RESET);
            }
        }
    }

    public static void shopMenu() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " BUY" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2✦ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " UPGRADE" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "3✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " SELL" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "4✦ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " LEAVE" + Colors.RESET);
    }

    public static void getShopSuccessMessage(Item item) {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "You bought " + item.getName() + " for " + item.getPriceToBuy() + " gold." + Colors.RESET);
    }

    public static void getOption() {
        System.out.print(Colors.YELLOW_BOLD_BRIGHT + "Option: \n" + Colors.RESET);
    }

    private static int count2 = 1;

    public static void getPlayerInventoryList(Player player) {
        player.getSelectedCharacter()
                .getInventory()
                .getItemList()
                .forEach(item1 -> System.out.println(Colors.WHITE_BOLD_BRIGHT + "" + count2++ + " | " + item1.getName() + Colors.RESET));
    }

    public static void getPlayerInventoryListToUpgrade(Player player) {
        count2 = 1;
        player.getSelectedCharacter()
                .getInventory()
                .getItemList()
                .forEach(item -> {
                    if (item.getWeaponBetterSkill() != 50) {
                        System.out.println(Colors.WHITE_BOLD_BRIGHT + "" + count2++ + " | " + item.getName() + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " (" + item.getPriceToUpgrade() + " gold to upgrade)\n" + Colors.RESET);
                    } else {
                        System.out.println(Colors.WHITE_BOLD_BRIGHT + "" + count2++ + " | " + item.getName() + Colors.RESET + Colors.RED_BOLD_BRIGHT + " (Can't upgrade anymore)\n" + Colors.RESET);
                    }
                });
    }

    public static void getInventoryMenu() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Equip item" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2✦ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Unequip item" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "3✧ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " USE" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "4✦ " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Exit\n" + Colors.RESET);
    }

    public static void upgradeSuccess(Item item) {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "You upgraded your " + item.getName() + "." + Colors.RESET);
    }

    public static void errorUsingSomething(Player player) {
        System.out.println(Colors.CYAN_BOLD_BRIGHT + "Interesting " + player.getSelectedCharacter().getInventory().getItemList() + "... but this cannot be used, only equipped." + Colors.RESET);
    }

    public static void usedHealPotion() {
        System.out.println(Colors.CYAN_BOLD_BRIGHT + "You drank the potion and fully restored your HP.\n" + Colors.RESET);
    }

    public static void whatItemYouWantToSell() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "What item you want to sell?\n" + Colors.RESET);
    }

    public static void successSell(LinkedList<Item> playerItem, int index) {
        Item item = playerItem.get(index);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "You sold " + item.getName() + " for " + item.getPriceToBuy() / 2 + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " gold." + Colors.RESET);
    }

    public static void slimePic() {
        System.out.println(Colors.CYAN_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                      (*,.,*(                                   \n" + Colors.RESET +
                "                            /.........         ........,                        \n" + Colors.BLUE +
                "                        .....             ..................                    \n" +
                "                    ......       . ............................/                \n" +
                "                 /..   .......*************************.... ......              \n" +
                "               ...........****,*************************,,..........            \n" + Colors.RESET +
                "             ,..........************************************..........          \n" +Colors.CYAN_BOLD_BRIGHT +
                "            ..........,******(**************(****************..........         \n" +
                "           ..........***************************************............        \n" +
                "          .......... ..***********************************,......*.......       \n" +
                "         ......,,.,.....********************************..,,.,,,,,,,...../      \n" +
                "         .......,.........**************************..............,,,,...*      \n" +
                "         .....,........,*****************************,,,.........,,,,,,..       \n" +
                "         *...,,,,,,,,**,*************************************,,,*,,,,,,..       \n" + Colors.RESET +
                "          (.*******,,,*,**********************************************..        \n" +Colors.CYAN_BOLD_BRIGHT +
                "            ..****************************************.************....         \n" +
                "             %,....*********************************.....******,....%%%         \n" +
                "              %%%%&...........................................*%%%%%%           \n" +
                "  *                   /%%%%%%%%%%%%%%%%%%%&%(//(#&%%%%%%%%%%%%%%                \n" + Colors.RESET +
                "  .                                                                             \n" + Colors.BLUE +
                "  .                                                                             \n" +
                "                                                                                \n" +
                "  %                                                                             \n" +
                "  %                                                                             \n" +
                "  *                                                                         " + Colors.RESET);
    }

    public static void babySpiderPic() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT +
                " .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .   ,#&@@@&#.  .  .   \n" +
                ".. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. @@@@@@@@@@@@@@@@@@@@ .. ..\n" +
                ".. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .@@@@@@# .. .. .. ..@@@@.. ..\n" +
                "..  .  @@@@@@@@@@@@@@@@@@.  .  .  .  (&&&#..  . .. @@@@@  . ..  .  .  . ..  .  .\n" +Colors.RESET+
                "  .  @@@@@@@@@@%**#@@@@@@@@   %&&&&&&&&&&&&&&&&&%/@@@@@ .  @@@@@@@@@@@@@  .  .  \n" +Colors.WHITE +
                "  . @@@@.  .  .  .  .  @@@@&&&&&&&&&&&&&&&&&&&&%&&&&%@  %@@@@@@@  *@@@@@@@@@@%  \n" +
                "  .  .  .  ,@@@@@@@@.  .*&&&&&&     %&&&&%         &&&%@@@@@# .  .  .  . &@@@@@@\n" +
                ".. .. .@@@@@@@@@@@@@@@@%&&&&&         %&%   @@     /&&&&@&. .@@@@@@. .. .. .*@@@\n" +Colors.RESET+
                ".. %@@@@@@@ .. .. .@@@@&&&&&  @@@@@    &&  @@@@@   &&&&&@@@@@@@@@@@@@@. .. ..  &\n" +Colors.WHITE_BOLD_BRIGHT+
                ".@@@@@@. .. .. .   . ..&&&&&& (@@@.   %&&&&*     &&&&&&&@@@... .. ..@@@@@  .. ..\n" +
                "@@@@#.  .  . @@@@@@@@@@%&&&&&&&&%&&&&&&&&&&&&&&&&&&&&&&&@@@@@@@@@@  .  @@@@@ .  \n" +
                " @@  .  . @@@@@. .  .*@@&&&&&&&&&&&&&&&*%%%%&&&&&&&&&&&,.  .  .,@@@@.  . @@@@.  \n" +Colors.RESET+
                "  .  .  @@@@@ .  (@@@@@@@@&&&&&&&&&&&&&&&&&&&&&&&&&&&.  .  .  .  .@@@  . .@@ .  \n" +Colors.WHITE +
                ".. .. %@@@@ .. @@@@@@&. .. .. %&&&&&&&&&&&&&&&&&&# .. .. .. .. .. .@@@( .. .. ..\n" +
                ".. .. @@@/. ..@@@ .. .. .. .. .. .. .#&&&%.. .. .. .. .. .. .. .. ..@@@ .. .. ..\n" +Colors.RESET+
                ".. ..  @@.. .@@@. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. ..@@. .. .. ..\n" +Colors.WHITE_BOLD_BRIGHT+
                "  .  .  .  .#@@@ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  \n" +
                "  .  .  .  .(@@@ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  " + Colors.RESET);
    }

    public static void goblinPic() {
        System.out.println(Colors.GREEN_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                  ,&(,,,,/((%                                   \n" +
                "                            #,,,/((((((((((((((((#            %/**  *           \n" +
                "          ,(*/          ./,,(((((((((((((((((((((((#&    &./%//%                \n" +
                "            *,/(,%     (*/(((((((((((*/******((##((###%,//*(#%/(,//*((          \n" +
                "            #/(,,(** (.,.**((((((../**(#,,,*&####/#(#///,*(%*(((%#(##/  /       \n" +
                "              (#,,/&/,,,#**/((((#,**#,  %%,.%###(((((*&/(#((%###%#%%*##, (      \n" +
                "             ((//*%/(    @####(((%,  . @@&&#((((((((*/*///*/%*/***(/#(#% ,      \n" +
                "             %.**(,%(& &&&/#.*(((((%%&#&#&..,*,/%((((,,(,(((/(**,**/(#  (.      \n" +
                "              %,(*./#/*///#.***(##((((/.***/****/(((/****%  (//((*((#  *        \n" +
                "       *((     %./(&.*****(*.****/,&#((((#&&(*/*((###%.   *  &##%##  .,         \n" +
                "    %((/#(%(##   %(((.***(&(*/,&#(((((#%**#((((#((##         * ,*/#             \n" +
                "   //*%*%#**(##      &/(((#,*/*,,#%#/(%(%.((((#(####////*#     .**/%            \n" +
                "  %/*(%%#(((***(  .     #((((.&&***//((%((#((###////(//.*****/#%/**(  *         \n" +
                "  ,/##// /*(.*/#% .          %((/&(*(%**(###///***//(##%//*.***.***/& /         \n" +
                "          .*/(//(           &////#%(/(##//********//(#(    %##/(//(#  /         \n" +
                "               &*/(#%      ,////****//*/*******/**//(#%    ,         /          \n" +
                "                 #/*//(#/**//#  ///*************///###%  .                      \n" +
                "                   %***/#/(#  (  (,/*/********///(#&%&#  .                      \n" + Colors.RESET +
                "                       (%   *    (%#(///////##@%%%&%%%&&&                       \n" +Colors.GREEN_BOLD +
                "                       ,,,.     .&%#%%%#%%&%%##%&&&&&&&#&&%                     \n" +
                "                              %%%%%%%&@@%%%%&@@&&&%&&%&&&&&&                    \n" +
                "                           @#%%%%%%%%%%%%%%%%@@&&&%%%&&&&&&&&                   \n" +
                "                          (&#%%%%%%%%%%%%%%&%&&%&%%&&&%&&%####. /               \n" +
                "                         #//*(##    &&&       .   ,.  %(*((/((#  ,              \n" +
                "                         ***(#  (.    (*.   . .,. .,.    (*/*(#, (              \n" +
                "                         /*####                         &//*(#. (.              \n" +
                "                          %**(#& *                      ,,*/(#  *               \n" +
                "                           %/*(#                         %.*(#  .               \n" +
                "                            #**#  .                       &*#, (                \n" +
                "                              *(  .                        /(  *                \n" +
                "                            (***(%                        #//(&                 \n" +
                "                       #,/**//((##  *                    (*/*/*/*/(             \n" +
                "               /,/***((**//(((#%  (.                       &(./******/*(#&      \n" +
                "               #((,/%*/(***/##  /.                         *  %/**/*/*#(((*#%% *\n" +
                "              .     .%#%####  /.                                ,(/**/((#%%   /" + Colors.RESET);
    }

    public static void skeletonPic() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                     ,@@@@@@@@/                                 \n" +
                "                                  .@@@@@@@@@@@@@@@@                             \n" +
                "                                 (@@@@@@@@@@@@@@@@@@*                           \n" +
                "                                &@@@@@@@@@@@@@@@@@@@@                           \n" +
                "                               .@@/ @@@@@./@@@@@@@@@@                           \n" +
                "                                 &  @@@@    @@@@@@@@.                           \n" +
                "                                @@@@ *@@   @@@@@@@@                             \n" +
                "                                 *#    .@@@@@@@                                 \n" +
                "                                  #@@@@@&@@                                     \n" +
                "                          @@/@.    ...@@%@@@  @@(%                              \n" +
                "                            @.    /.%@@@@& @@,/     .@%@                        \n" +
                "                             @@ @@#(%@@@*(@*@(    *@@ ,                         \n" +
                "                           &*@/@@ ,@@@    #@ # @@@                              \n" +
                "                               .@,@@,   (@@@.@@,@(                              \n" +
                "                               (@ @@ .@@@@@@  /                                 \n" +
                "                              *.(@   @@@@@@@@                                   \n" +
                "                               &@       @@@                                     \n" +
                "                                @#       @.                                     \n" +
                "                                &.#      /%                                     \n" +
                "                                 (*@    @@@                                     \n" +
                "                                  *@     @,                                     \n" +
                "                                   @/    @%                                     \n" +
                "                                 #@ #      #                                    \n" +
                "                           .,@@#@##@@    @@(@                                   \n" +
                "                                           @@@@*                                \n" +
                "                                            /                                  " + Colors.RESET);
    }

    public static void zombiePic() {
        System.out.println(Colors.MAGENTA_BOLD_BRIGHT +
                "                                                                               \n" +
                "                                    @,,,,,,,,,,,,,@&  *                         \n" +
                "                                 @...,,,,,,,,,,,,,,,**##                        \n" +
                "                                @,,,@,...,,,,,*,,(,,,***/ %%                    \n" +
                "                             #@,,,,,*,,***(/***,,,,,****/@ .                    \n" +
                "                           /,,,,,,@,,(@.   ... **,,,*@*** @                     \n" +
                "                             @@@,,*@,,,*@....(*,,,@***@*&                       \n" +
                "                             #.***,*@,,,,@@@*,,,**@***@%/*@                     \n" +
                "                             @*,,,,@,@,#,,,,,,,,****%@****/                     \n" +
                "                                @,,,,,,,,,,,,,,,******@@                        \n" +
                "                                 (,,....@,,@,,@***@**@                          \n" +
                "                                  ( ,((%@@%@,%#**@****@@/@                      \n" +
                "                                     (((@(((,&,**@******@///@                   \n" +
                "                                  @,@%*(&.,@,,**#***%***@////%/&%               \n" +
                "                                   @&&#*/@,,**** .@***%/////&/(///#             \n" +
                "                                    %@@@@%***@  #///**@/@//(****/#//@           \n" +
                "             (#                                @%@///&&****@****/////&          \n" +
                "       @@(,,,,,,,,,,%,,,,,,,,@@                @****&*****%****///////@         \n" +
                "   @%,,*@@&*@&*@@@@@,,*@(  @****,,,*@,,,,,,,*@%*****@***@*****//(//////,        \n" +
                "/,***@ @**@**     .,,*@   %@&,,,,,,,,,,****@*,,,,,,,,,**@*&**////*/////@        \n" +
                "        @**@***#   @,*@  @,@,,*@,,,***@**,****#@*****@*****//@///*/////(        \n" +
                "         @@            (,,*@,,* ,,*     @@/@////@  @@@/////@////***/////        \n" +
                "                      @,,/%(,&  @***&      %/@      ///(/(////*****/////        \n" +
                "                       ,,*/ ***@   @@               ./@%////******/////#        \n" +
                "                      .,*(   **@                     @/////*******/////@        \n" +
                "                                                    &****/*******//////         \n" +
                "                                                   @*********@&**@@@&@          \n" +
                "                                                    @##%#(*@#########@          \n" +
                "                                                   @((##&###(##(((###@          \n" +
                "                                                  @(/((((@#&(((((###@           \n" +
                "                                                 &//((((#@#@((((###@            \n" +
                "                                               .(//((((##@ ((/((###@            \n" +
                "                                              @(((((((##@ #(///(###@            \n" +
                "                                             (((@&&%###@  @(///((###            \n" +
                "                                             (((((((##@   @(((((((##@           \n" +
                "                                             @((((((##@     (((((((&##&         \n" +
                "                                             @(((((((##      @(((#((####@       \n" +
                "                                             ((((((((##@      @(((((((####      \n" +
                "                                            @(((@(*@((#%@       %(((((((#(%     \n" +
                "                                               @**** @##(        @((((((#***@/  \n" +
                "                                              @,*,,*              @((#*@**,,,,**\n" +
                "                                         %&,,,,,,,,**             @@  ,***,,**@ \n" +
                "                                  &,,,,,....,,,,,****@               @*,,,,*@   \n" +
                "                                   @,*@,,,,,****              %,&,(,,,,,,,,*,   \n" +
                "                                      (@//@#                     &@%.*&#((#%/(#(" + Colors.RESET);
    }

    public static void spectrePic() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                   *&@@@@@@%*                                   \n" +
                "                               /@              .@(                              \n" +
                "                             /%                   .@                            \n" +
                "                            @                       /%                          \n" +
                "                           &       .%    @@@         .&                         \n" +
                "                          .&      %@@@  @@@@@         */                        \n" +
                "                          %.      *@@@  .@@@@/         @                        \n" +
                "                          @               /%           #                        \n" +
                "                          @           @@@              /*                       \n" +
                "                          @          ,@@@              #(/,                     \n" +
                "                          %.                                 &/                 \n" +
                "                          @                              @(                     \n" +
                "                         .&                           ##                        \n" +
                "                         @                           @                          \n" +
                "                      @&                            @                           \n" +
                "                     (@@@@@                       /#                            \n" +
                "                         @                       @                              \n" +
                "                        @.                    ,@                                \n" +
                "                       @                    @(                                  \n" +
                "                      @                 .@/                                     \n" +
                "                    &/              (@(                                         \n" +
                "                  *@          %@@,                                              \n" +
                "                  #@@@%*                                                        \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                  ,    ,         *           /,*., # * / * * (.*             " + Colors.RESET);
    }

    public static void werewolfPic() {
        System.out.println(Colors.BLUE_BOLD_BRIGHT +
                "                                                                                \n" +
                "                       .                                                        \n" +
                "                        %@@@@@&@                                                \n" +
                "                         &@@@@@@@@@@@%                                          \n" +
                "                            @@@@@@@@@@@@@,  # &                                 \n" +
                "                              #@@@@@@@@@@@@@@@@@@@                              \n" +
                "                               #@@@@@@@@@@@@@@@@@@@@@*@ &                       \n" +
                "                     (@@@@@@@@@@#,@@@@@@@@@@@@@@  *@@@@@@@&                     \n" +
                "                  @. &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%.  (@@@@                    \n" +
                "                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&             \n" +
                "             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,        \n" +
                "             &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     \n" +
                "           @@@@@@@@@@@&@@@@@&@@@@@&&&@@@&&&@@ ,%@..@#,,&.* @@@@@@@@@@@@@@@      \n" +
                "         @@.@@@@@@@@@&@@&&&@@&@@&@@@@@&@&@@@& @%,,#@,,,(   .   @ @@@@@&         \n" +
                "         @@@@@@@@@@@@@@&&&&@@&@@&@@@@@@@@@@@@@@&@@, .            /@@/           \n" +
                "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   @   &@ @@@             \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@% @*               \n" +
                "         @@@@@(  ,@@@@@@@@@@@@@@@@@@@@@@@   #@@@@@@@@@@@@@@  .                  \n" +
                "         ,@@# &@@@@  %@@@@@@@@@@@@@@@@@@&@@   &@@@@@@@@@,                       \n" +
                "            *@@@ #@@@*  @@@@@@@@@@@@@@@@@@@   @@@@@@@@@                         \n" +
                "               @@@  @@@@  *@@@@@@@@@@@@@@@@%@ *(  @*                            \n" +
                "                 @@@( ,@@@@  @@@@@@@@@@@@@@@@@                                  \n" +
                "                   @@@@  .@@@@@   @@@@@@@@@@@@@@@                               \n" +
                "                     @@@@@@   *@@@@@@@@(                                        \n" +
                "                        .@@@@@@@@@@@#.      ./&@@@.                             \n" +
                "                                                                        " + Colors.RESET);
    }

    public static void ghostPic() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT +
                " . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .\n" +
                ".. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .  . ##               ###  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .##                        # .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . ..#.                             # .  . .. .  . .. .  . \n" +
                "  . .. .  . .. .  . .. . #      */  ..#       #. #.#      # .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .#       ##  , *#     #.  %..#      #.. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .#       #(. # ,#     (*  ##.        #. .  . .. .  . .. .\n" +
                "  . .. .  . .. .#/ .#.  %       ,, ,(  #     #/  // #    (  #. .  . .. .  . .. .\n" +
                "  . .. .  . ..       , .# *      (   ,#      ,# . (         #. .  . .. .  . .. .\n" +
                "  . .. .  . .. #./    #.##             ##  *#            /  #.#     #. .  . .. .\n" +
                "  . .. .  . .. . ##      *#         ###/ *.(( *         *( ##(      #. .  . .. .\n" +
                "  . .. .  . .. .  .,# *,   #        (##.  *%#.         , ,(#.   #/( .. .  . .. .\n" +
                ".. .  . .. .  . .. .  . .#. ##,                        . #*.(#  .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .# # *#                         ##(  #. .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . ./    #,                    (  #*  *  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  .     # /  .                     #   #  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  .#                                   #  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  .#,,                                 #  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . ##                      .          #  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. .  ##  .            ##. ####### .  . .. .  . .. .  . \n" +
                "  . .. .  . .. .  . .. .  . .. . #  (        # .  . .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . #     ##.. .  . .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. ." + Colors.RESET);
    }

    public static void witchPic() {
        System.out.println(Colors.MAGENTA_BOLD_BRIGHT +
                "                     .@@@@@@@@@@@@@@@@@@@@@.                                     \n" +
                "                  .@@@@.     @@@@@@@@@@@@@@@@                                   \n" +
                "                  @@(          &@@@@@@@@@@@@@@#                                 \n" +
                "                 @@.           .@@@@@@@@@@@@@@@&                                \n" +
                "                 @(            @@@@@@@@@@@@@@@@@@                               \n" +
                "                 @.          %@@@@@@@@@@@@@@@@@@@@                              \n" +
                "                 @          @@@@@@@@@@@@@@@@@@@@@@@                             \n" +
                "                  *         @@@@@@@@@@@@@@@@@@@@@@@@                      /     \n" +
                "      @/                   .@%%%@&&@@@@@@@%%@@@@@@@@&               *&@@@&      \n" +
                "       @@@@@@@&#/,. ,  .,.,&&&@@&@@&%@@%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@#        \n" +
                "        .@@@@@%%@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%            \n" +
                "           .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/                 \n" +
                "                #@@@@@@@@@@@@@&*(@@@@@@@@@@@@@&#/*@&&@%&*. ,.   ,,              \n" +
                "                       *#@@@@@( %@(%*/@, *%*(##&  @&@@&@&    ,.                 \n" +
                "                        /@@@@@(                   @@@@@@@                       \n" +
                "                        @@@@@@@(                 &@@@@@@@,                      \n" +
                "                      *@ /@@@@@@                %@@@@@@@@/                      \n" +
                "                         @@@@@@@@    @@@@@@/   &@@@@@@@@@*                      \n" +
                "                        @@@@@@@@@@@*         @@@@@@@% @@@                       \n" +
                "               ..  /&@@@@@@@@@@@@@@@@@(  ,@@@@@@@@@@ ,@@,  .                    \n" +
                "                /@@@@@@@@@@@@@@*@@@@@@@@@@@ *@@@@@@#.@@  &@                     \n" +
                "                  @@@@@@@@@@@,&@@@@@@@(.    @@@@@@@@@@@@#                       \n" +
                "                    ,@@@@(  @@@@@@@*       &@@@@@@@@@@,               " + Colors.RESET);
    }

    public static void vampirePic() {
        System.out.println(Colors.RED_BOLD_BRIGHT +
                "                        .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/                        \n" +
                "                    *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&                    \n" +
                "                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  \n" +
                "                %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                \n" +
                "               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               \n" +
                "              @@@@@     &@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @@@@@@@              \n" +
                "             @@@@@             @@@@@@@@@@@@@@@@@&           @@@@@@@             \n" +
                "            @@@@@                  &@@@@@@@@@.              @@@@@@@@            \n" +
                "           %@@@@@                     @@@@@                *@@@@@@@@            \n" +
                "           @@@@@@                       @,         & .     @@@@@@@@@(           \n" +
                "           @@@@@@(          .@,                ( .%       @@@@@@@@@@%           \n" +
                "           @@@@@     /. ,%@(       /@@((%, .              *@@@@@@@@@(           \n" +
                "           @@@@(               *@#             #@          &@@@@@@@@            \n" +
                "           @@@@   *&@@#              .@@@.@,               @@@@@@@@@            \n" +
                "          @   @@    @@@@@@@@                           @@@@@@@@@@@   @@         \n" +
                "       .@@  .  &       @@@@@@@@/                  &@@@@@@(    @@@ @@*@@@@       \n" +
                "      @@@@@, &@ @   @@@@@@@@@@@@@@@@@@@*@/ @@@@@@@@@@@@@@@    .@@@@@@@@@@@@     \n" +
                "    @@@@@@@@& @@(      &@@@@@@@@@@@@@@@,  @@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@    \n" +
                "   @@@@@@@@@@ &@.  .   %  .(#*   @@@@@@   @@@@,   %@@@%   ( ,@@@@@@@@@@@@@@@@#  \n" +
                "  @@@@@@@@@@@  @@    , @            @@@   @@@@@      .*  (   @@@@@@@@@@@@@@@@@@ \n" +
                " @@@@@@@@@@@@(  %@%              @@  *&   @   @@             @@@@@@@@@@@@@@@@@@%\n" +
                "#@@@@@@@@@@@@@. @@@@.         @@@           ,@@@@@@(        @@@@@@@@@@@@@@@@@@@@\n" +
                "   %@@@@@@@@@@@@@@@  ,@  &% @@,    #@@/   @@@@  @@@@@@@(  @@@@@@@@@@@@@@@@@@*   \n" +
                "       .@@@@@@@@@@@@      @@.@       /@@@@@@.     @% *@@@@@@@@@@@@@@@@@@.       \n" +
                "           @@@@@@@@@#   ( @  @  .@&,  /**&, .*@%  @ (  @@@@@@@@@@@@@@           \n" +
                "             @@@@@@@@     @     @%  /   *  #   @ .#    @@@@@@@@@@@@             \n" +
                "               @@@@@@@     #  &#*@@@@@@@@@@@@@@@.&    #@@@@@@@@@@#              \n" +
                "                @@@@@@@&    (  .    @@@@@@@@,  (*    &@@@@@@@@@@                \n" +
                "                 (@@@@@@@*    .                     @@@@@@@@@@@                 \n" +
                "                   @@@@@@@@(       /@     .@,     %@@@@@@@@@@@                  \n" +
                "                    @@@@@@@@@@                  @@@@@@@@@@@@                    \n" +
                "                      @@@@@@@@@@@,           (@@@@@@@@@@@@@                     \n" +
                "                       (@@@@@@@@@@@@@@&(%@@@@@@@@@@@@@@@@                       \n" +
                "                          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@                         \n" +
                "                             @@@@@@@@@@@@@@@@@@@@@@@                            \n" +
                "                                  @@@@@@@@@@@@@" + Colors.RESET);
    }

    public static void mummyPic() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT +
                "                                                                           \n" +
                "                                                            @%@     @@@@@@@@ @  \n" +
                "                                      @@@@@ &@&  /@@@     @    @@@&          @  \n" +
                "                                  @@      @@         @@@@   @@/   @@@       (/  \n" +
                "                                @@ @@   @@          @@  @@@  .@@                \n" +
                "                              @@      @@          @@      @&                    \n" +
                "                             @     @@#           @@        @@                   \n" +
                "                           .@  @@@            @@@           @                   \n" +
                "                           @@               @@    @@@@#     @                   \n" +
                "                            @           @@@  @    @       @@@                   \n" +
                "                             @      @@@ @@@@@@@@@@@@@@@    @@ @@(   @%          \n" +
                "                             @@@                          @@ @   .@@@@@         \n" +
                "                  @@@@@@@@    @@                         @@  @@.@&    @@        \n" +
                "                @@   @     @ @@@@@@@@@              @@@@   @@,@@      (@        \n" +
                "                @@    @%   @ @    @@@              @@@@     #@@@,@@  &@         \n" +
                "               ,@   @@ @@@@   @  @    @@*     @@@@     @/@@                     \n" +
                "                .@@          .@@@@           @@       @%                        \n" +
                "                                    @@@@        ,@@@@@@                         \n" +
                "                                   %@@         .@@@@ @@                         \n" +
                "                                   @   (@@           @                          \n" +
                "              @@@@@               @@@@@     @@@@###@@@                          \n" +
                "             @  ,@  (@@       %@@@@        .@@@@@@@#@*                          \n" +
                "             @   @     @  &@@   @   @              @@                           \n" +
                "             #@  @     @@     @*@    @@@&        /@@                            \n" +
                "                @@@/   @       @@     @          @@                             \n" +
                "                                     @@          @                              \n" +
                "                                       @@     @@@@                              \n" +
                "                                        @        @                              \n" +
                "                                         @      @@                              \n" +
                "                                         @@@@@@  @@                             \n" +
                "                                          @  @@@@@@                             \n" +
                "                                         @@       @%                            \n" +
                "                                  @@*  @@   @@@@@%@                             \n" +
                "                                 @@  @   /@       @                             \n" +
                "                                        .@@@@@@@@                           " + Colors.RESET);
    }

    public static void creeperPic() {
        System.out.println(Colors.GREEN_BOLD_BRIGHT +
                ". .. .  . .. .  . .. .  . .. .  . .. @@ . .. .  . .  . .  . .. .  . .. .  . .. .\n" +
                ".. .  . .. .  . .. .  .  &@@@@@@@@@@@@       @@@@@@@  . .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  .@@@@@@@@                             %@@@@@@.  . .. .  . .. .  . \n" +
                ".. .  . .. .  . @@   @@                                    @@@@@.. .  . .. .  . \n" +
                ".. .  . .. .  . @@         &@@#                         &@@@@@ @@@ .  . .. .  . \n" +
                ".. .  . .. .  . @@  @@@           @@@,          @@@@@          @@@ .  . .. .  . \n" +
                ".. .  . .. .  . @@  @@@@@@@,                                   @@@ .  . .. .  . \n" +
                ".. .  . .. .  . @@  @@@@@@@      @@@@@    @                    @@. .  . .. .  . \n" +
                "                @@  @@@@@@@      @@@@@@@  @                    @@               \n" +
                "  . .. .  . .. .@@       @@      @@@@@@@  @                    @@ . .. .  . .. .\n" +
                "  . .. .  . .. .@@        @@@@@@@@@@@@@@  @                    @@ . .. .  . .. .\n" +
                "  . .. .  . .. .@@   @@@@@@@@@@@@@        @                    @@ . .. .  . .. .\n" +
                "  . .. .  . .. .@@   @@@@@@@@@@@@@@@@     @                   &@@ . .. .  . .. .\n" +
                "  . .. .  . .. .@@   @@@@@ @@@@@@@@@@@    @                   @@@ . .. .  . .. .\n" +
                "  . .. .  . .. .@@       /       @@@@@    @                   @@@ . .. .  . .. .\n" +
                "  . .. .  . .. .  @@@             @@@@    @                    @@ . .. .  . .. .\n" +
                ".. .  . .. .  . .. .  . .@@@@             @              @@@@@  .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. @@  @@@@       @        @@@@@@* @  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. @@      &@@@@     .@@@@@@      @@  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. @@          .@@@@@@@           @@  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. @@               &            @@.  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. @@               @            @@.  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . .. @@               @            @@.  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .  . ..(@@               @            @@.  . .. .  . .. .  . \n" +
                "  . .. .  . .. .  . .. .  @@@               @            @@ .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  @@@               @            @@ .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  @@@               @            @@ .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  .@@               @            @@@@@ .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  .@@               @             @  @@@@@. .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  .@@               @            @@ *@  @@. .. .  . .. .\n" +
                "  . .. .  . .. .  . .. . /@@@               @           @@@     @@. .. .  . .. .\n" +
                "                   @@@@,    @@@@@           @           @@@     @@              \n" +
                ".. .  . .. .  . .@               @          @           @@@     @@ .  . .. .  . \n" +
                ".. .  . .. .  . .@@     @@@@     @           @@         @@@   @@@% .  . .. .  . \n" +
                ".. .  . .. .  . .@@@             @    @@@@    @@@@@     @@@@@@% .. .  . .. .  . \n" +
                ".. .  . .. .  . .#@@      @      @@@@             @@@   @@@.  . .. .  . .. .  . \n" +
                ".. .  . .. .  . ..@@      @    @@@ @@     @@@@@    @@ @@@. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. &@@@@   #@@@@.. &@@      @      @@@  .. .  . .. .  . .. .  . \n" +
                ".. .  . .. .  . .. .   @@@@@  . .. .@@      @      @@ . .. .  . .. .  . .. .  . \n" +
                "  . .. .  . .. .  . .. .  . .. .  . @@      @     @@@. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . ./@@@@    @@@@@ .. .  . .. .  . .. .  . .. .\n" +
                "  . .. .  . .. .  . .. .  . .. .  . .. . @@@@@@.  . .. .  . .. .  . .. .  . .. ." + Colors.RESET);
    }

    public static void harpyPic() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +
                " @&   /,,                                                                       \n" +
                "  &  ,@   ,,,                                                                   \n" +
                "   @. @,.  @.,,%                                                                \n" +
                "     .. .,,,,,&,,@                                                              \n" +
                "      @.,,,,,%,,,,,@ &,                                            &            \n" +
                "  @,@  @.,..,,,,,,,.,,,,,                                            @,,&&#.,,,@\n" +
                "     @.,,#,,,,,,,,@,..,,..,@                                       @.,.#.,.,,@.&\n" +
                "     @ @,,,.,,&,,/,,.,,,,,,&,,                                   %@@(,,,,%,,    \n" +
                "       #,,@,.,,,*,,,,..,*,/,.,.                                @/,,,/,..&&      \n" +
                "          @,.,.,./.,&,%.,,.,,,,,.                        @.,,,,,....,.,         \n" +
                "            ..,@,.,%,,,,,.,,,.,,..@                    *@.,,,..&.,../@          \n" +
                "             , /,..,,,&.,*,.,,,(,,.(/ * @ @  @,#@@@%&@.,,,,,,.,,/, .            \n" +
                "               ,,,,#,,/&,.*.,,.,.*,,..@ @@.&.#(,%(%#@%,,,(@,.,,.,%.             \n" +
                "                 ,@,,,,,,,,,,,,/.,,.,,.,.@.@@@,@,.,@//#&.%,%&,,,,               \n" +
                "                    ,,,,.,,.,,.,.,,,..,,,,,..,#&*@#%.&#(*..,,.*/                \n" +
                "                      ,#,,..,,,,,,./,..., ..,,,,%&,.,,,.,,./,,                  \n" +
                "                        ./.,/,,,..,,,,.,,,,,,,,,,,.,.*,@,,,&,                   \n" +
                "                          @,,,,,,,,..,,,,,,,,.,,,/.,,,,/ ,                      \n" +
                "                              (,.,.,,,,,&./,,,,,,,,,,&@                         \n" +
                "                                 %.,.,,,,%,,,./,,,,,%                           \n" +
                "                                @,,,,,,,,&,.,,,.,.(%                            \n" +
                "                               *(...,,,,,*,.,.,,.@                              \n" +
                "                             ,,,..%,.,,,.,&,.,@*..,                             \n" +
                "                        @,&,,,**,,,,#,,,,.,,/(,,,,#.@           /*              \n" +
                "                   @.,,,*@,.,,...,/@,,.&,,,,,(,,,,.,%,       @&,,,@             \n" +
                "              /./,,,,/,,,,,/....#, @/,,,,,/,,  *,,.*,@,,.,(@,..#.@@             \n" +
                "           @(,,,,@,,,*,,*,,,%,,,    @,%.(,,*@             @(&@     %            \n" +
                "          ,.@ ...@@...@,,(..%.       @&.,.%.,*,            *./@@                \n" +
                "                @   @   @@                   @,&.(.,.,.(@                       \n" +
                "                                              @..,,%,* @                        \n" +
                "                                             ,%%     &                          \n" +
                "                                              ,%                         " + Colors.RESET);
    }

    public static void centaurPic() {
        System.out.println(Colors.GREEN_BOLD +
                "                                                                                \n" +
                "                       ,&&&&&&&&                                                \n" +
                "            %         &&&&&&&%&&                                                \n" +
                "           &%        .&%&&& %* %                                                \n" +
                "           &&.       &&& &&    %                                                \n" +
                "            %%       &&&&&%   &#                                                \n" +
                "             &          %#   %                                                  \n" +
                "            %#       & *   ( %(&&  &%                                           \n" +
                "            %%     *                 &                                          \n" +
                "            &&    %  ,                                                          \n" +
                "            &&     &(& .   * #%  &.  .                                          \n" +
                "            &%     %   ,      %./%    &                                         \n" +
                "           #%% %&&    .&       % &(%  %                                         \n" +
                "          &,*&  & ( ,         /  ,   %          &&%  &   ,,&                    \n" +
                "             %       &           %  &&%%&&% #  .#    * &/   & &                 \n" +
                "             %       .  .*     ,. %     ,&               /&   (& %&             \n" +
                "             &       & ,%    %&%     %&       .              *%&% % &           \n" +
                "             &        #%,   %.              &(%.@           @ %, & . %          \n" +
                "             &        ./%.   *%&            &&./  &         ##%  &#  &%         \n" +
                "             &        &    % .  #%    ./,# /,    / / ,     /%   % , ,.          \n" +
                "             &       % %& ,  %   %#.     &&.&.&* %(  .  .% %   / .  #&          \n" +
                "             &      &. &   & .                %     (.  &*&        %%           \n" +
                "             &    &%   &.    (%  &              &##&  &    &  &. # .            \n" +
                "             %       &       %/   %             &%  &  &   &  &%%&&             \n" +
                "             &     & &        %   %            % # /    , /    &%#              \n" +
                "  *          &     %&*         %# &           %&%%    *                         \n" +
                "             &     %  &         &% &        % &&&   &   &                       \n" +
                "                    %%&&(       &( *%     %%&*%&   & ( &                        \n" +
                "  %                  &.&       &  &     * &&&&&  &  #.&                         \n" +
                "  %                           &%&&&              &,&&&&                         \n" +
                "  *                                                                            " + Colors.RESET);
    }

    public static void minotaurPic() {
        System.out.println(Colors.YELLOW +
                "                                                                                \n" +
                "                                     @@      /                                  \n" +
                "                                       @@     @@@@@@@@@@                        \n" +
                "                                       #@@@  @@@@,   (@@@                       \n" +
                "                                         @@@@@@@@@@@@@@@                        \n" +
                "                                       @@@@@@@@@@@@@@@@@                        \n" +
                "                   @  @,  @@@          @@@@@@@@@@@@@@@.                         \n" +
                "                  @@   &@@@@@@@              @@@@@@@@@@@                        \n" +
                "                  @@@@  @@@@@@@          @@@@@@@@@@@@@@@@@@                     \n" +
                "                   @@@@@@@@@@ .        @@@@@@@@@@@@@@@@@@@@@@                   \n" +
                "                    @@@@@@@ @@@        @@@@@@@@@@@@@@@@@@@@@@@                  \n" +
                "                         /    @@@    @@@@@@@@@@@@@@@@,   @@@@@@                 \n" +
                "                                @@@@@@@@@@ @@@@@@@@@     @@@@@@                 \n" +
                "                               @@@@@@@    @@@@@@@@@@@     @@@                   \n" +
                "                                  #@@@   @@@@@@@@@@@@@@ @@@@@                   \n" +
                "                                   @@@/%@@@@@@@@@@@@@@@@@@@@@                   \n" +
                "                                   @@ *@@@@@@@@@@@@@@@@@                        \n" +
                "                                       @@@@@@@@@@@@@@@@@                        \n" +
                "                                      %@@@@@       @@@@@@                       \n" +
                "                                       ,@@@@@       @@@@@                       \n" +
                "                                          @@@@     @@@@@                        \n" +
                "                                         %@@@.      @@@@@                       \n" +
                "                                        @@@@@        %@@@@                      \n" +
                "                                      (@@@@@@        @@@@@%                     \n" +
                "                                      &@@#            @@@@@                     \n" +
                "                                                                            " + Colors.RESET);
    }

    public static void cyclopsPic() {
        System.out.println(Colors.GREEN_BOLD_BRIGHT +
                "                                                                                \n" +
                "                           # (,. ,*,                  &% ( @                    \n" +
                "                           . @ &%( /,,              *#  (%@@/&                  \n" +
                "                            .     &.                ,,      ,/                  \n" +
                "                            #   @                      ,     .                  \n" +
                "                            .  &                       (    ,                   \n" +
                "                           %  ,     ,..   ,#@&%.       %   #                    \n" +
                "                           @  *     &  /         %,#.* ,  /                     \n" +
                "                           @  .   %.               @& &  ..                     \n" +
                "                           ,,  &#       ,%%#%#,     @#   %                      \n" +
                "                            @        &  &,       @   @  &                       \n" +
                "                            &.     #        .//.   *  @&                        \n" +
                "                          ,/      .(     % .* #    (  (*                        \n" +
                "                         ,&        %    . .@@..    @   @                        \n" +
                "                         @         ,&     #//#    &    &.                       \n" +
                "                         @        /#.,@*       /@      %*                       \n" +
                "                         *&      & *(((#      .#(/     %,                       \n" +
                "                          *@     ,*/   , ,% ,* . &    *&                        \n" +
                "                            &@    /&  &( ( **/ /%.   @*                         \n" +
                "                            @  @@*      .*//,     &@.                           \n" +
                "                            /  @   ,%@@@&&&@@@@( (                              \n" +
                "                           @  %                 @  *                            \n" +
                "                          .* %                   & (                            \n" +
                "                          & ,                    @ #                            \n" +
                "                        #.   .                  &   /                           \n" +
                "                     .@    &                    @      **                       \n" +
                "                   (& % ( &                       % #/& %(                      \n" +
                "                   %%@ @ (                           .&, .                      \n" +
                "                        *                                                " + Colors.RESET);
    }

    public static void basiliskPic() {
        System.out.println(Colors.GREEN +
                "                                                                                \n" +
                "                                            #@                                  \n" +
                "                                            @.@                                 \n" +
                "                                           @@@@  @ @                            \n" + Colors.RESET +
                "                                       @.@@@@@@@@(@                             \n" + Colors.GREEN_BRIGHT +
                "                                      @@@@@@@@@@@@@@@@@                         \n" +
                "                                    .@@@@@@@@@@@@@@@ @                          \n" + Colors.RESET +
                "                                   &@@@@@@@@@@@@@@@@@@@@                        \n" + Colors.GREEN +
                "                                   @@@@@@@@@@@  @@@@@@@@%                       \n" +
                "                                    @@          .@@@@@@@@                       \n" +
                "                                                 @@@@@@@@@*                     \n" +
                "                                                 @@@@@@@@                       \n" +
                "                                                @@@@@@@@@                       \n" +
                "                           %                   @@@@@@@@@@                       \n" +
                "                     %  @@@@@                @@@@@@@@@@ @                       \n" + Colors.RESET +
                "                  @@ @@@@@@                @@@@@@@@@@ @                         \n" + Colors.GREEN_BRIGHT +
                "                   @@@@@@@@@@            @@@@@@@@@@@                            \n" +
                "                     @@@@@@@@@         @@@@@@@@@@/                              \n" +
                "                    @@@@@            @@@@@@@@@@@@                               \n" +
                "                   # @@            @@@@@@@@@@@@                                 \n" + Colors.RESET +
                "                    @&@          @@@@@@@/@@@&                                   \n" + Colors.GREEN +
                "                     @@@        @@@@@@@@@@@@@@@@@@@@@@@@@@@@                    \n" +
                "                       @@@@@@#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  \n" +
                "                            @@@@@@@@@@@@@@@.           @@@@@@@@                 \n" +
                "                              @@@@@@@@@@@@@@@     .@@@@@@@@@@@@                 \n" +
                "                               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  \n" +
                "                                @@@@@@@@@@@@@@@@@@@@@@@@@@@                     \n" +
                "                                     @@@@@@@@@@@@@@@@                   " + Colors.RESET);
    }

    public static void griffinPic() {
        System.out.println(Colors.YELLOW +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                      @@                                        \n" +
                "                                @@    @@@                                       \n" +
                "                                @@@@   @&@@                                     \n" +
                "                                @ @@@@@ %@@@                                    \n" +
                "                                @@@@@@@@& .@@@                                  \n" +
                "                                  @@@@@@&@@( @@ @@@@@@@@@@@                     \n" +
                "                                  @@ @@@&@@@@ @@      @@@@@@@@@                 \n" +
                "                              ,,   @@@@@.@@@@@ @  @@@@@@@@@                     \n" +
                "                       ,@&& @&&        &&&&&&& &  &&@&@@&&                      \n" +
                "                    @@                       @@@@@@@@@@@@@@                     \n" +
                "                  @@                     @@ @@@@@@@@@@@@@@@                     \n" +
                "                  @@          @@@@@@@@@@&@@@@@@@@@@@@@@@@@@                     \n" +
                "                    @@@@@@@@@ @@@@@@@@@@&@@@@@@@@@@@@@@@  @@                    \n" +
                "                           (@@@@@@@ @@@@@@@@@@@@@  @@@@@   &@@.                 \n" +
                "                        @@@@@@@@@                   @ @@@    @@                 \n" +
                "                       @@@@                            @@@                      \n" +
                "                      @@@@ @@                           @@@@@&                  \n" +
                "                                                                                \n" +
                "                                                                        " + Colors.RESET);
    }

    public static void chimeraPic() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +
                "                                     &&.   &                                    \n" +
                "                                          &&&,                                  \n" +
                "                                        &&&*& &&                                \n" +
                "      %&&&&&&&&&&             &       &&&&&&&(&&&&                              \n" +
                "  &&&&&          &&&&&&&&&(&&&&      &&&&&&&&&& &&&           &   &&            \n" +
                " &&%                         &&      &&&&%   &&            &&  &&&&&&&%         \n" +
                "&&&              &/*&(&,&           &&&&&@   &       *&&&&&%&&&& & (@ &&&&,     \n" +
                " &&&        &&&&&&&&&&&&&&&&&&&   .&&&&&&&        &&&& (& &&/&&&&.#&&&  && *&   \n" +
                "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&    && && &&& &&&&&&&&.&#&&&&&&&&&&&& \n" +
                "        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  &&& &&&&&&&*&&&&&&&&# &&&&&&& &@#.  *\n" +
                "       &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& &&% &&&& .&.&&&&./&& &,&&& .        \n" +
                "       &&&&&&&&&&&&&&&&&&&&&&& &&&&&&&&&&&& &&,&# &&&,&&&%&#@* &&,  (&&    ,    \n" +
                "       &&&&&&&&&&&&&&&&&& &&&&(&&.&&&&&&&&&&&&&  &&&&&&%&&&&  &&&       &&      \n" +
                "       ,&&&&&&&&&&&&&&&&&   && &&&&&#&&&&/&&&&.&& & &&&&&&&&&& &&               \n" +
                "        .&&&&&&&&&&&&&&&      &&/&&(&& &&&&&&&&&&&&&#&&&&&&&&&& &               \n" +
                "         &&&&&&&  &&&&&#        &&%,&&(&&&&&&&&&&&&&%&&&&&&&&&&                 \n" +
                "       &&&&&&&    &&&&&            &&&.%&&&&&&&&&&&&&@&&&&&&  #                 \n" +
                "   &&&&&&&&       &&&&                 ,&&&&&&&&&&&&&&&&                        \n" +
                "   &&&&&         &&&&&&&                      #&&&&&&&&&&&                      \n" +
                "   (&&&&            @&&&&&&&&&&                    /&&&&&&&&&                   \n" +
                "    %&&&                   @&&&&&                       &&&&&&&&                \n" +
                "     &&&&&&&&&%               &&&&&                        &&&&&&&&&&&&&&&     " + Colors.RESET);
    }

    public static void medusaPic() {
        System.out.println(Colors.GREEN_BRIGHT +
                "                                                                                \n" +
                "                                  @@@@      &@@@@@@@@@@@#@@                     \n" +
                "                               @@@    @#  @@@%        .@@@@ %                   \n" +
                "            @@@@@@@@@&@       @@    @@@@ @@@               ((&@@@.              \n" +
                "          @@@@@@@@/ .@@@@@   #@@    @@&@@@@@           @@@@.     @@@@@          \n" +
                "       @                @@@@  @@@       %@@@@        @@@@           @@@&%       \n" +
                "                         @@@(  @@@% #    @@@@@%      @@@              @@@@      \n" +
                "         @@@@@            @@@   @@@@@      @@@@@@    @@@@                       \n" + Colors.RESET +
                "      @@@     @@@@#       @@@@    @@@@@      @@@@@@   @@@@                      \n" + Colors.GREEN +
                "      @@&        @@@&     ,@@@      @@@@@@      @@@@@   @@@@       @@@@,  .@@@  \n" +
                "       @@@@@@&    @@@@     @@@@        @@@@@@@    @@@@@  @@@@(   @@@          @@\n" +
                "          .@,      @@@@     @@@@          @@@@@@@   @@@@   @@@@  @@           @@\n" +
                "    (@@@@@@#        .@@@     @@@@@           @@@@@   @@@@   @@@  @#        @@@@ \n" + Colors.RESET +
                "  @@@      /%/@       @@@@    @@@@@@           @@@@   @@@@  ,@@* #((      @@%@@ \n" + Colors.GREEN_BRIGHT +
                " @@@@        @@@@      @@@@@@    @@@@@@         @@@   @@@   @@@  @@@     @      \n" +
                " @@@@         @@@@        @@@@@@@   @@@@@@@      @   @@   &@@%  @@@@   ,        \n" +
                "               (@@@@         @@@@@@@@                        @@@@@@             \n" +
                "  #              @@@@@           @@@@@@                     @@@                 \n" +
                "      @@@@@%       @@@@@@@          @@@                    *                    \n" +
                "   @@@@   @@(@@@       @@@@@@@@(@@@  @@        @                                \n" +
                "  &@@         @@@@@@             ,@@      &@@@@@@      @@@@                     \n" +
                "  @@@@           ,@@@@@@@@@@@@@@@    @                                          \n" +
                "   @*@(                            @@@                @                         \n" +
                "            @@@@@@@@@@@@@@@@@@@@@@@@# %                   @                     \n" + Colors.RESET +
                "          @@@@                        @ @       %%####   .                      \n" + Colors.GREEN +
                "         @@@            @@@%@        *@ @              @           @   @        \n" +
                "         @@          @@@@@@@@        @@  ,    @      @@       @         @       \n" +
                "     @%@@@@         @@@            @@@#  #                                      \n" +
                "    @@@@             @@@@@@@%@@@@@@@&                                    @      \n" +
                "                          @@@@@@                                         @      \n" +
                "                                                                         @      \n" +
                "                                      @                                  @      \n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@    ( @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + Colors.RESET);
    }

    public static void wyvernPic() {
        System.out.println(Colors.RED_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                   @.              @@           \n" +
                "                                                 @@.           @@               \n" +
                "                                                @@@         @@@                 \n" +
                "                           % /                .@,@@      (@@@@                  \n" +
                "                          ,&@                 @@@@@@   @@@@@@                   \n" +
                "              @          @.@@@               @@@@@@@ @@@@@@@@@/                 \n" +
                "              @ @@@@@@  @@&@@@    @          @@@@@#@@@@@@@@@@@@@/@              \n" +
                "        @     @ *    @@@@@@@@@@@@            @@@@.@ @@@@@@@@ @@@@               \n" +
                "        @     @   /@@&@@@@@@@@@@@@@          @@@ @,@@@@@@ @@@@@@@               \n" +
                "           *     &@       @@@@@@@@@@@@       @@ @ @@@@@@@@@@@@@@.               \n" +
                "                            ,@@@@@@@@       *@@@(@@@/@@@@@@@@@@@@               \n" +
                "                             @@@@@@@@        #@#@@@@@@@@@@@@@@@@@@&             \n" +
                "        @@@/ @,             @@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@@@@@@          \n" +
                "      @@@@ @@/@           &@@@@@@@@@       @@@@@@@@/@@@@@@@@@@@@@@@@            \n" +
                "         @@@@@@          @@@@@@@@@@@        @@@@@@@@@@@@@@@@@@@@@@/             \n" +
                "           (@@@@@&      @@@@@@@@@@@@@./,       @@@@@@@%@@@@@@@@@@&     @@       \n" +
                "           @@  @@@@@@@ @@@@@@@@@@@@@@          @@@@@@@@@@@@ @@@@@      @@       \n" +
                "         .       .@@@@@@@@@@@@@@@@@@@@@@    (@@@@@@@@@@@@@@@@@ @@     @@@       \n" +
                "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@(@@@@@@@@@@@@@@@@    @@@@       \n" +
                "                     ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@    @@@@ @        \n" +
                "                       @@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@             \n" +
                "                        @@@@@@@@@@@@@@*@@@@@@@@@@@@@@@ @@@@@@@@@@@@             \n" +
                "                          @@@@ @@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@          \n" +
                "                             @@@@@@@@@@@ @@@@@@@@@@@%@@@@@@@@@@@@@@@@@@         \n" +
                "                              @@@@@@@@#@@(@@ @@/ @@            @@@@@@@@@        \n" +
                "  ,                          (@@@@@@          @@@                @@ @@@@        \n" +
                "  .                          @@@@@@         @@@@@                 @@@@@@@@@     \n" +
                "  ,                         #@@@@            @@@@*               #@@@@@@        \n" +
                "  #                   @ @@@@@@@@              @@@@@             @@@@@@@         \n" +
                "  %                 @@@ @@@@@@@                 @@@@@@@&@@@@@@@ @@@@@           \n" +
                "  .                  /@@      @@                   @@@@@@@@@@@@@@@@             \n" +
                "  *                  #         ,                        @(                      \n" +
                "  (                                                                             " + Colors.RESET);
    }

    public static void phoenixPic() {
        System.out.println(Colors.RED_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                      /                         \n" +
                "                                              (     ./          .               \n" +
                "                                              /     /        /                  \n" +
                "                        .                    (/    //.     //                   \n" +
                "                  /      /.                  ///   *//    //      //            \n" +
                "                    //    //                 ////   ///  ///  //(               \n" +
                "                     //    //                 ////, /// (//  //         /       \n" +
                "              .//     //   ///                  ///,///(/// //*       /         \n" +
                "                 //*  ///  //                   //////////////  ,///            \n" +
                "          *///*    /// ///.//                    ///////////, ////              \n" +
                "                //* *///,/////     */*          *////////. /////   //           \n" + Colors.RESET +
                "                  ///( ////////      ///*       //////////////  /(              \n" + Colors.YELLOW_BOLD_BRIGHT +
                "          (//////,  ,////////////     ////    //////////////////                \n" +
                "                 //////////////////// ///////////////////  .                    \n" +
                "            ./////.  .,. ////////////( //////////.//////.                       \n" +
                "                    /////////// // ////  ///////////*                           \n" +
                "                         /.      /*  /.     /////*                              \n" +
                "                    (                         //////                            \n" +
                "                                               ////// /                         \n" + Colors.RESET +
                "                     */  /                    //////// /                        \n" + Colors.RED_BOLD_BRIGHT +
                "                       /*  /                ////////(////                       \n" +
                "                         //* .*  (////////////////// /,,/                       \n" +
                "                    /       (////      ,/////////// ./ (/                       \n" +
                "                       //   ./*    ,,,.*////( ///* .*  /                        \n" +
                "                            //(            ////   (                             \n" +
                "                                  ,*/((/*.                                      \n" +
                "                                                                                \n" +
                "                                                                                " + Colors.RESET);
    }

    public static void krakenPic() {
        System.out.println(Colors.MAGENTA_BOLD +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                   /@@@@@@@@@,                                  \n" +
                "                                @@@@@@@@@@@@@@@@@                               \n" +
                "                              @@@@@@@@@@@@@@@@@@@@@                             \n" +
                "                             @@@@@@@@@@@@@@@@@@@@@@@                            \n" + Colors.RESET +
                "                             @@@@@@@@@@@@@@@@@@@@@@@                            \n" + Colors.MAGENTA_BOLD_BRIGHT +
                "                (@@.&@@@@    @@@@@@@@@@@@@@@@@@@@@@@    @@@@%.@@,               \n" +
                "               #@     @@@@   @@@@@@@@@@@@@@@@@@@@@@@   @@@@    .@.              \n" +
                "                     @@@@@   .@@@@@@@@@@@@@@@@@@@@@    @@@@@                    \n" + Colors.RESET +
                "                    @@@@&  @& #@@@@@@@@@@@@@@@@@@@* @#  @@@@@                   \n" + Colors.MAGENTA_BOLD +
                "                  #@@@@   @@    @@@@@@@@@@@@@@@@@    @@   @@@@,                 \n" +
                "                 @@@@@/  @@*   @@@@@@@@@@@@@@@@@@@   #@@  %@@@@@                \n" +
                "                @@@@@@   @@@    @% @@@@@@@@@@@ @@    @@@   @@@@@%               \n" +
                "                @@@@@@@  @@@@@@%@@@@@@@@@@@@@@@@@*@@@@@@  @@@@@@@               \n" +
                "                @@@@@@@@@.   @@@@@@@@@@@@@@@@@@@@@@@   .@@@@@@@@@               \n" +
                "                 @@@@@@@@@@@* @@@@%@@@@@@@@@@@,@@@@ %@@@@@@@@@@@                \n" +
                "                    *@@@@@ @@(@@ @@@@@@@@@@@@@@@ @@@@@ @@@@@,                   \n" +
                "                 @@@@@@@@@ @@ ,@@@@@@@@@ @@@@@@@@@.,@@ @@@@@@@@@                \n" + Colors.RESET +
                "                @@@@@@    @ @@@@@@@@@@.   ,@@@@@@@@@@ @   .@@@@@@               \n" + Colors.MAGENTA_BOLD_BRIGHT +
                "                @@@@@@@@@ @@@@@@@@@  &     %  @@@@@@@@@ @@@@@@@@@               \n" +
                "                 @@@@@@@@ @@@@@@      @@ @@      @@@@@@ @@@@@@@@                \n" +
                "                          @@@@@@      @@ @@      @@@@@@                         \n" +
                "                           @@@@@@@@@@@@   @@@@@@@@@@@@                          \n" +
                "                             @@@@@@@#       %@@@@@@@                            \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                " + Colors.RESET);
    }

    public static void behemothPic() {
        System.out.println(Colors.GREEN_BRIGHT +
                "                                                                                \n" +
                "            @@@@@@%                                                     @@@@@@. \n" +
                "         @@@@@@@@@@@@@@@@@                                         .@@@@@@      \n" +
                "        @@@@@@@@@@@@@@@@@@@@@@@  & @& @                          @@@@@@         \n" +
                "           @@@@@@@@@@@@@@@@@@@@@@@@@@@#                         &@@@@           \n" +
                "           @@@/@@@@@@@@@@@@@@@@@@@@@@@, & @& @@@&              @@@@@            \n" +
                "                @@@@@@@@@@@@@@@@@@@@@@@@&@@@@@  .              @@@@             \n" + Colors.RESET +
                "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               .@@@@@            \n" + Colors.GREEN_BOLD +
                "             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&                  #@@@@@           \n" +
                "  #@@@@       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                @@@@@@          \n" +
                "  @@@@@@@.     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                @@@@@@@        \n" +
                "   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  @@@@@@       \n" +
                "           @@@@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               %@@@@@,      \n" +
                "                   &  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               @@@@@@@      \n" +
                "                     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.,             @@@@@@@@      \n" +
                "                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @  @ #@@@@@@@@      \n" +
                "                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@@@@@@@@@(      \n" + Colors.RESET +
                "                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       \n" + Colors.GREEN_BRIGHT +
                "                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \n" +
                "                @@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@           \n" +
                "               &@@@@@@@@@(             @@@@@@@@@@@@@@@@@@@@@@@@@@@              \n" +
                "                 @@@@@@@@@@                  @@@@@@@@@@@@(&                     \n" +
                "                 @@@@@@@@@@                   @@@@@@@@@@@                       \n" +
                "                  @@@@@@@@.                       .@@@@@@@@.                    \n" +
                "                  #@@@@@@@@                         @@@@@@@@@                   \n" +
                "              @@@@@@@@@@@@@@                       @@@@@@@@@@@@                 \n" +
                "             @@@@@@@@@@@                           @@& @@@ @@@@@                " + Colors.RESET);
    }

    public static void dragonPic() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                        &       \n" +
                "                                                                   %            \n" +
                "                                   @                           @/               \n" +
                "                                  @                       @@@                   \n" +
                "                            @   @@  @       ,#        @@@&                      \n" +
                "                         @@@@@@@ @@@@@@  @@ @@     @@@%              @@%        \n" +
                "                     @@@@@@@@@@@@@@@@@@@@@* @@@ @@@@       @@@@,                \n" +
                "                 @   @@@ .@@@@@@@@@@&@@@@@@@ @@@@@ %@@@@@@                      \n" +
                "                @@@@@@@@@@@@@@@*  @/ @ .@@@@@@@@@@@@#                           \n" +
                "               @@@@@@#  @@@@   (      @ @@@@@@#@@@@@@/                          \n" + Colors.RESET +
                "                                      @@@@@@@@@@@@@(           *@@%             \n" + Colors.RED_BOLD_BRIGHT +
                "                %   @@ @@ @ @  @ @ ,@@@ @@@@@*@@@@@                             \n" +
                "            &@@@@@/@@@(@@@@@@@. @ @ @@@@@@@@@@@@   @@@                          \n" +
                "           @@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@ @@  @%       @                       \n" +
                "          @@@.@@@@@@@@@@@@@@@@@@@@@@@@ @@%      (           %                   \n" +
                "          @@@@@@@@@@ @               / @                                        \n" +
                "        @(@(/@@@@@@.         @ @@@@@@@@@@@@@                                    \n" +
                "         @@@/@@@@@@@@     *@@@@@@@@@@@@@@@@@@    @                              \n" +
                "          @@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                               \n" +
                "          @ @(@@@@@@@@@@@@@@@@@@&        @@@@@@@  @                             \n" + Colors.RESET +
                "              @@@%@@/@@@@@@@.            @@@@@@ @                               \n" + Colors.YELLOW_BOLD_BRIGHT +
                "                 % @    @             @@@@@@@ @  @                              \n" +
                "                       ,@@@@@@@@@@@@@@@@@@ @  *                                 \n" +
                "                    @@@@@@@    @ @ @ @  @                                       \n" +
                "                   @@@     @@@@                                                 \n" +
                "                  @@@    @@@  @@@                                               \n" +
                "                   @@@  @@@  /@@                                                \n" + Colors.RESET +
                "                     @@@@@@@@@                                                  \n" + Colors.RED_BOLD_BRIGHT +
                "                          @@                                                    \n" +
                "                           @@@*                                                 \n" +
                "                          @@@@@                                                 \n" +
                "                             @@@@                                               \n" +
                "                                @@                                              \n" +
                "                                    @                                           \n" +
                "                                                                                \n" +
                "                                                                                \n" + Colors.RESET);
    }

    public static void chestFound() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "Oh, you found a chest! Checking things inside.." + Colors.RESET);
    }

    public static void getFinalGameMessage() {
        System.out.println(Colors.RED_BOLD_BRIGHT +
                "    ███        ▄█    █▄       ▄████████ ███▄▄▄▄      ▄█   ▄█▄    ▄████████                         \n" +
                "▀█████████▄   ███    ███     ███    ███ ███▀▀▀██▄   ███ ▄███▀   ███    ███                         \n" +
                "   ▀███▀▀██   ███    ███     ███    ███ ███   ███   ███▐██▀     ███    █▀                          \n" +
                "    ███   ▀  ▄███▄▄▄▄███▄▄   ███    ███ ███   ███  ▄█████▀      ███                                \n" +
                "    ███     ▀▀███▀▀▀▀███▀  ▀███████████ ███   ███ ▀▀█████▄    ▀███████████                         \n" +
                "    ███       ███    ███     ███    ███ ███   ███   ███▐██▄            ███                         \n" +
                "    ███       ███    ███     ███    ███ ███   ███   ███ ▀███▄    ▄█    ███                         \n" +
                "   ▄████▀     ███    █▀      ███    █▀   ▀█   █▀    ███   ▀█▀  ▄████████▀                          \n" +
                "                                                    ▀                                              \n" +
                "    ███      ▄██████▄       ▄██   ▄    ▄██████▄  ███    █▄     ▄████████                           \n" +
                "▀█████████▄ ███    ███      ███   ██▄ ███    ███ ███    ███   ███    ███                           \n" +
                "   ▀███▀▀██ ███    ███      ███▄▄▄███ ███    ███ ███    ███   ███    ███                           \n" +
                "    ███   ▀ ███    ███      ▀▀▀▀▀▀███ ███    ███ ███    ███  ▄███▄▄▄▄██▀                           \n" +
                "    ███     ███    ███      ▄██   ███ ███    ███ ███    ███ ▀▀███▀▀▀▀▀                             \n" +
                "    ███     ███    ███      ███   ███ ███    ███ ███    ███ ▀███████████                           \n" +
                "    ███     ███    ███      ███   ███ ███    ███ ███    ███   ███    ███                           \n" +
                "   ▄████▀    ▀██████▀        ▀█████▀   ▀██████▀  ████████▀    ███    ███                           \n" +
                "                                                              ███    ███                           \n" +
                " ▄████████  ▄██████▄   ▄█     █▄     ▄████████    ▄████████ ████████▄   ▄█   ▄████████    ▄████████\n" +
                "███    ███ ███    ███ ███     ███   ███    ███   ███    ███ ███   ▀███ ███  ███    ███   ███    ███\n" +
                "███    █▀  ███    ███ ███     ███   ███    ███   ███    ███ ███    ███ ███▌ ███    █▀    ███    █▀ \n" +
                "███        ███    ███ ███     ███   ███    ███  ▄███▄▄▄▄██▀ ███    ███ ███▌ ███         ▄███▄▄▄    \n" +
                "███        ███    ███ ███     ███ ▀███████████ ▀▀███▀▀▀▀▀   ███    ███ ███▌ ███        ▀▀███▀▀▀    \n" +
                "███    █▄  ███    ███ ███     ███   ███    ███ ▀███████████ ███    ███ ███  ███    █▄    ███    █▄ \n" +
                "███    ███ ███    ███ ███ ▄█▄ ███   ███    ███   ███    ███ ███   ▄███ ███  ███    ███   ███    ███\n" +
                "████████▀   ▀██████▀   ▀███▀███▀    ███    █▀    ███    ███ ████████▀  █▀   ████████▀    ██████████\n" +
                "                                                 ███    ███                                        \n" +
                "    ███        ▄█    █▄       ▄████████                                                            \n" +
                "▀█████████▄   ███    ███     ███    ███                                                            \n" +
                "   ▀███▀▀██   ███    ███     ███    █▀                                                             \n" +
                "    ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄                                                                \n" +
                "    ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀                                                                \n" +
                "    ███       ███    ███     ███    █▄                                                             \n" +
                "    ███       ███    ███     ███    ███                                                            \n" +
                "   ▄████▀     ███    █▀      ██████████                                                            \n" +
                "                                                                                                   \n" +
                " ▄█     █▄   ▄██████▄     ▄████████  ▄█       ████████▄                                            \n" +
                "███     ███ ███    ███   ███    ███ ███       ███   ▀███                                           \n" +
                "███     ███ ███    ███   ███    ███ ███       ███    ███                                           \n" +
                "███     ███ ███    ███  ▄███▄▄▄▄██▀ ███       ███    ███                                           \n" +
                "███     ███ ███    ███ ▀▀███▀▀▀▀▀   ███       ███    ███                                           \n" +
                "███     ███ ███    ███ ▀███████████ ███       ███    ███                                           \n" +
                "███ ▄█▄ ███ ███    ███   ███    ███ ███▌    ▄ ███   ▄███                                           \n" +
                " ▀███▀███▀   ▀██████▀    ███    ███ █████▄▄██ ████████▀                                            \n" +
                "                         ███    ███ ▀                                                              \n" +
                "   ▄████████ ███▄▄▄▄   ████████▄     ▄████████ ████████▄                                           \n" +
                "  ███    ███ ███▀▀▀██▄ ███   ▀███   ███    ███ ███   ▀███                                          \n" +
                "  ███    █▀  ███   ███ ███    ███   ███    █▀  ███    ███                                          \n" +
                " ▄███▄▄▄     ███   ███ ███    ███  ▄███▄▄▄     ███    ███                                          \n" +
                "▀▀███▀▀▀     ███   ███ ███    ███ ▀▀███▀▀▀     ███    ███                                          \n" +
                "  ███    █▄  ███   ███ ███    ███   ███    █▄  ███    ███                                          \n" +
                "  ███    ███ ███   ███ ███   ▄███   ███    ███ ███   ▄███                                          \n" +
                "  ██████████  ▀█   █▀  ████████▀    ██████████ ████████▀                                           " + Colors.RESET);
    }
}

