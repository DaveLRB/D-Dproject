import java.util.LinkedList;

public class GameMessage {
    public static void getMenuMessage() {
        System.out.println("1 - Enter the dungeon");
        System.out.println("2 - Check character stats");
        System.out.println("3 - Check inventory");
        System.out.println("4 - Shop");
        System.out.println("5 - Leave game");
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
        System.out.println("Welcome " + name + ", please select a character:");
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

        System.out.println("Character: " + player.getSelectedCharacter().getName() + "\n" + "\n" +
                "Types of attack:" +
                "\nStrength: " + player.getSelectedCharacter().getStrength() + " (+" + str + ")"
                + "\nDexterity: " + player.getSelectedCharacter().getDexterity() + " (+" + dex + ")"
                + "\nCharisma: " + player.getSelectedCharacter().getCharisma() + " (+" + cha + ")"
                + "\nIntelligence: " + player.getSelectedCharacter().getIntelligence() + " (+" + ite + ")");
        getOneBlankSpace();
        System.out.println("Equiped: " + player.getWhatIsEquiped());

        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "HP: " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + player.getSelectedCharacter().getHealthPoints() + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "XP: " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + player.getXp() + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "GOLD: " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + player.getGold() + Colors.RESET);


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
            if (item.getCharisma() != null) {
                System.out.println(count++ + " | " + item.getName() + " | Price: " + item.getPriceToBuy() + " | Skill: +" + item.getSkillToMenu());
            } else {
                System.out.println(count++ + " | " + item.getName() + " | Price: " + item.getPriceToBuy());
            }
        }
    }

    public static void shopMenu() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1 -" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "BUY" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2 -" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " UPGRADE" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "3 - " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "SELL" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "4 - " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "LEAVE" + Colors.RESET);
    }

    public static void getShopSuccessMessage(Item item) {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "You bought " + item.getName() + " for " + item.getPriceToBuy() + " gold." + Colors.RESET);
    }

    public static void getOption() {
        System.out.print(Colors.YELLOW_BOLD_BRIGHT + "Option: " + Colors.RESET);
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
                        System.out.println(Colors.WHITE_BOLD_BRIGHT + "" + count2++ + " | " + item.getName() + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " (" + item.getPriceToUpgrade() + " gold to upgrade)" + Colors.RESET);
                    } else {
                        System.out.println(Colors.WHITE_BOLD_BRIGHT + "" + count2++ + " | " + item.getName() + Colors.RESET + Colors.RED_BOLD_BRIGHT + " (Can't upgrade anymore)" + Colors.RESET);
                    }
                });
    }

    public static void getInventoryMenu() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "1 -" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Equip item" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "2 -" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Unequip item" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "3 -" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " USE" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "4 -" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + " Exit" + Colors.RESET);
    }

    public static void upgradeSuccess(Item item) {
        System.out.println(Colors.WHITE_BOLD_BRIGHT +"You upgraded your " + item.getName() + "." + Colors.RESET);
    }

    public static void errorUsingSomething(Player player) {
        System.out.println(Colors.CYAN_BOLD_BRIGHT+"Interesting " + player.getSelectedCharacter().getInventory().getItemList() + "... but this cannot be used, only equipped." + Colors.RESET);
    }

    public static void usedHealPotion() {
        System.out.println(Colors.CYAN_BOLD_BRIGHT + "You drank the potion and fully restored your HP." + Colors.RESET);
    }

    public static void whatItemYouWantToSell() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "What item you want to sell?" + Colors.RESET);
    }

    public static void successSell(LinkedList<Item> playerItem, int index) {
        Item item = playerItem.get(index);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "You sold " + item.getName() + " for " + item.getPriceToBuy() / 2 +Colors.RESET +Colors.YELLOW_BOLD_BRIGHT+ " gold." + Colors.RESET);
    }

    public static void slimePic() {
        System.out.println("                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                      (*,.,*(                                   \n" +
                "                            /.........         ........,                        \n" +
                "                        .....             ..................                    \n" +
                "                    ......       . ............................/                \n" +
                "                 /..   .......*************************.... ......              \n" +
                "               ...........****,*************************,,..........            \n" +
                "             ,..........************************************..........          \n" +
                "            ..........,******(**************(****************..........         \n" +
                "           ..........***************************************............        \n" +
                "          .......... ..***********************************,......*.......       \n" +
                "         ......,,.,.....********************************..,,.,,,,,,,...../      \n" +
                "         .......,.........**************************..............,,,,...*      \n" +
                "         .....,........,*****************************,,,.........,,,,,,..       \n" +
                "         *...,,,,,,,,**,*************************************,,,*,,,,,,..       \n" +
                "          (.*******,,,*,**********************************************..        \n" +
                "            ..****************************************.************....         \n" +
                "             %,....*********************************.....******,....%%%         \n" +
                "              %%%%&...........................................*%%%%%%           \n" +
                "  *                   /%%%%%%%%%%%%%%%%%%%&%(//(#&%%%%%%%%%%%%%%                \n" +
                "  .                                                                             \n" +
                "  .                                                                             \n" +
                "                                                                                \n" +
                "  %                                                                             \n" +
                "  %                                                                             \n" +
                "  *                                                                         ");
    }

    public static void babySpiderPic() {
        System.out.println(" .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .   ,#&@@@&#.  .  .  \n" +
                ".. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. @@@@@@@@@@@@@@@@@@@@ .. ..\n" +
                ".. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .@@@@@@# .. .. .. ..@@@@.. ..\n" +
                "..  .  @@@@@@@@@@@@@@@@@@.  .  .  .  (&&&#..  . .. @@@@@  . ..  .  .  . ..  .  .\n" +
                "  .  @@@@@@@@@@%**#@@@@@@@@   %&&&&&&&&&&&&&&&&&%/@@@@@ .  @@@@@@@@@@@@@  .  .  \n" +
                "  . @@@@.  .  .  .  .  @@@@&&&&&&&&&&&&&&&&&&&&%&&&&%@  %@@@@@@@  *@@@@@@@@@@%  \n" +
                "  .  .  .  ,@@@@@@@@.  .*&&&&&&     %&&&&%         &&&%@@@@@# .  .  .  . &@@@@@@\n" +
                ".. .. .@@@@@@@@@@@@@@@@%&&&&&         %&%   @@     /&&&&@&. .@@@@@@. .. .. .*@@@\n" +
                ".. %@@@@@@@ .. .. .@@@@&&&&&  @@@@@    &&  @@@@@   &&&&&@@@@@@@@@@@@@@. .. ..  &\n" +
                ".@@@@@@. .. .. .   . ..&&&&&& (@@@.   %&&&&*     &&&&&&&@@@... .. ..@@@@@  .. ..\n" +
                "@@@@#.  .  . @@@@@@@@@@%&&&&&&&&%&&&&&&&&&&&&&&&&&&&&&&&@@@@@@@@@@  .  @@@@@ .  \n" +
                " @@  .  . @@@@@. .  .*@@&&&&&&&&&&&&&&&*%%%%&&&&&&&&&&&,.  .  .,@@@@.  . @@@@.  \n" +
                "  .  .  @@@@@ .  (@@@@@@@@&&&&&&&&&&&&&&&&&&&&&&&&&&&.  .  .  .  .@@@  . .@@ .  \n" +
                ".. .. %@@@@ .. @@@@@@&. .. .. %&&&&&&&&&&&&&&&&&&# .. .. .. .. .. .@@@( .. .. ..\n" +
                ".. .. @@@/. ..@@@ .. .. .. .. .. .. .#&&&%.. .. .. .. .. .. .. .. ..@@@ .. .. ..\n" +
                ".. ..  @@.. .@@@. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. ..@@. .. .. ..\n" +
                "  .  .  .  .#@@@ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  \n" +
                "  .  .  .  .(@@@ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  ");
    }

    public static void goblinPic() {
        System.out.println("                                                                               \n" +
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
                "                   %***/#/(#  (  (,/*/********///(#&%&#  .                      \n" +
                "                       (%   *    (%#(///////##@%%%&%%%&&&                       \n" +
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
                "              .     .%#%####  /.                                ,(/**/((#%%   /");
    }

    public static void skeletonPic() {
        System.out.println("                                                                               \n" +
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
                "                                            /                                  ");
    }

    public static void zombiePic() {
        System.out.println("                                                                               \n" +
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
                "                                      (@//@#                     &@%.*&#((#%/(#(");
    }

    public static void spectrePic() {
        System.out.println("                                                                         \n" +
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
                "                  ,    ,         *           /,*., # * / * * (.*             ");
    }

    public static void werewolfPic() {
        System.out.println("                                                                       \n" +
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
                "                                                                        ");
    }

    public static void ghostPic() {
        System.out.println(" . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .\n" +
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
                "  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .  . .. .");
    }

    public static void witchPic() {
        System.out.println("       .@@@@@@@@@@@@@@@@@@@@@.                                     \n" +
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
                "                    ,@@@@(  @@@@@@@*       &@@@@@@@@@@,               ");
    }

    public static void vampirePic() {
        System.out.println("            .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/                        \n" +
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
                "                                  @@@@@@@@@@@@@");
    }

    public static void mummyPic() {
        System.out.println("                                                                           \n" +
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
                "                                        .@@@@@@@@                           ");
    }

    public static void creeperPic() {
        System.out.println(". .. .  . .. .  . .. .  . .. .  . .. @@ . .. .  . .. .  . .. .  . .. .  . .. .\n" +
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
                "  . .. .  . .. .  . .. .  . .. .  . .. . @@@@@@.  . .. .  . .. .  . .. .  . .. .");
    }

    public static void harpyPic() {
        System.out.println(" @&   /,,                                                                     \n" +
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
                "                                              ,%                         ");
    }

    public static void centaurPic() {
        System.out.println("                                                                            \n" +
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
                "  *                                                                            ");
    }

    public static void minotaurPic() {
        System.out.println("                                                                         \n" +
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
                "                                                                            ");
    }

    public static void cyclopsPic() {
        System.out.println("                                                                      \n" +
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
                "                        *                                                ");
    }

    public static void basiliskPic() {
        System.out.println("                                                                        \n" +
                "                                            #@                                  \n" +
                "                                            @.@                                 \n" +
                "                                           @@@@  @ @                            \n" +
                "                                       @.@@@@@@@@(@                             \n" +
                "                                      @@@@@@@@@@@@@@@@@                         \n" +
                "                                    .@@@@@@@@@@@@@@@ @                          \n" +
                "                                   &@@@@@@@@@@@@@@@@@@@@                        \n" +
                "                                   @@@@@@@@@@@  @@@@@@@@%                       \n" +
                "                                    @@          .@@@@@@@@                       \n" +
                "                                                 @@@@@@@@@*                     \n" +
                "                                                 @@@@@@@@                       \n" +
                "                                                @@@@@@@@@                       \n" +
                "                           %                   @@@@@@@@@@                       \n" +
                "                     %  @@@@@                @@@@@@@@@@ @                       \n" +
                "                  @@ @@@@@@                @@@@@@@@@@ @                         \n" +
                "                   @@@@@@@@@@            @@@@@@@@@@@                            \n" +
                "                     @@@@@@@@@         @@@@@@@@@@/                              \n" +
                "                    @@@@@            @@@@@@@@@@@@                               \n" +
                "                   # @@            @@@@@@@@@@@@                                 \n" +
                "                    @&@          @@@@@@@/@@@&                                   \n" +
                "                     @@@        @@@@@@@@@@@@@@@@@@@@@@@@@@@@                    \n" +
                "                       @@@@@@#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  \n" +
                "                            @@@@@@@@@@@@@@@.           @@@@@@@@                 \n" +
                "                              @@@@@@@@@@@@@@@     .@@@@@@@@@@@@                 \n" +
                "                               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  \n" +
                "                                @@@@@@@@@@@@@@@@@@@@@@@@@@@                     \n" +
                "                                     @@@@@@@@@@@@@@@@                   ");
    }

    public static void griffinPic() {
        System.out.println("                                                                       \n" +
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
                "                                                                        ");
    }

    public static void chimeraPic() {
        System.out.println("                                    &&.   &                                    \n" +
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
                "     &&&&&&&&&%               &&&&&                        &&&&&&&&&&&&&&&     ");
    }

    public static void medusaPic() {
        System.out.println("                                                                                \n" +
                "                                  @@@@      &@@@@@@@@@@@#@@                     \n" +
                "                               @@@    @#  @@@%        .@@@@ %                   \n" +
                "            @@@@@@@@@&@       @@    @@@@ @@@               ((&@@@.              \n" +
                "          @@@@@@@@/ .@@@@@   #@@    @@&@@@@@           @@@@.     @@@@@          \n" +
                "       @                @@@@  @@@       %@@@@        @@@@           @@@&%       \n" +
                "                         @@@(  @@@% #    @@@@@%      @@@              @@@@      \n" +
                "         @@@@@            @@@   @@@@@      @@@@@@    @@@@                       \n" +
                "      @@@     @@@@#       @@@@    @@@@@      @@@@@@   @@@@                      \n" +
                "      @@&        @@@&     ,@@@      @@@@@@      @@@@@   @@@@       @@@@,  .@@@  \n" +
                "       @@@@@@&    @@@@     @@@@        @@@@@@@    @@@@@  @@@@(   @@@          @@\n" +
                "          .@,      @@@@     @@@@          @@@@@@@   @@@@   @@@@  @@           @@\n" +
                "    (@@@@@@#        .@@@     @@@@@           @@@@@   @@@@   @@@  @#        @@@@ \n" +
                "  @@@      /%/@       @@@@    @@@@@@           @@@@   @@@@  ,@@* #((      @@%@@ \n" +
                " @@@@        @@@@      @@@@@@    @@@@@@         @@@   @@@   @@@  @@@     @      \n" +
                " @@@@         @@@@        @@@@@@@   @@@@@@@      @   @@   &@@%  @@@@   ,        \n" +
                "               (@@@@         @@@@@@@@                        @@@@@@             \n" +
                "  #              @@@@@           @@@@@@                     @@@                 \n" +
                "      @@@@@%       @@@@@@@          @@@                    *                    \n" +
                "   @@@@   @@(@@@       @@@@@@@@(@@@  @@        @                                \n" +
                "  &@@         @@@@@@             ,@@      &@@@@@@      @@@@                     \n" +
                "  @@@@           ,@@@@@@@@@@@@@@@    @                                          \n" +
                "   @*@(                            @@@                @                         \n" +
                "            @@@@@@@@@@@@@@@@@@@@@@@@# %                   @                     \n" +
                "          @@@@                        @ @       %%####   .                      \n" +
                "         @@@            @@@%@        *@ @              @           @   @        \n" +
                "         @@          @@@@@@@@        @@  ,    @      @@       @         @       \n" +
                "     @%@@@@         @@@            @@@#  #                                      \n" +
                "    @@@@             @@@@@@@%@@@@@@@&                                    @      \n" +
                "                          @@@@@@                                         @      \n" +
                "                                                                         @      \n" +
                "                                      @                                  @      \n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@    ( @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public static void wyvernPic() {
        System.out.println("                                                                                \n" +
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
                "  (                                                                             ");
    }

    public static void phoenixPic() {
        System.out.println("                                                                                \n" +
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
                "                //* *///,/////     */*          *////////. /////   //           \n" +
                "                  ///( ////////      ///*       //////////////  /(              \n" +
                "          (//////,  ,////////////     ////    //////////////////                \n" +
                "                 //////////////////// ///////////////////  .                    \n" +
                "            ./////.  .,. ////////////( //////////.//////.                       \n" +
                "                    /////////// // ////  ///////////*                           \n" +
                "                         /.      /*  /.     /////*                              \n" +
                "                    (                         //////                            \n" +
                "                                               ////// /                         \n" +
                "                     */  /                    //////// /                        \n" +
                "                       /*  /                ////////(////                       \n" +
                "                         //* .*  (////////////////// /,,/                       \n" +
                "                    /       (////      ,/////////// ./ (/                       \n" +
                "                       //   ./*    ,,,.*////( ///* .*  /                        \n" +
                "                            //(            ////   (                             \n" +
                "                                  ,*/((/*.                                      \n" +
                "                                                                                \n" +
                "                                                                                ");
    }

    public static void krakenPic() {
        System.out.println("                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                   /@@@@@@@@@,                                  \n" +
                "                                @@@@@@@@@@@@@@@@@                               \n" +
                "                              @@@@@@@@@@@@@@@@@@@@@                             \n" +
                "                             @@@@@@@@@@@@@@@@@@@@@@@                            \n" +
                "                             @@@@@@@@@@@@@@@@@@@@@@@                            \n" +
                "                (@@.&@@@@    @@@@@@@@@@@@@@@@@@@@@@@    @@@@%.@@,               \n" +
                "               #@     @@@@   @@@@@@@@@@@@@@@@@@@@@@@   @@@@    .@.              \n" +
                "                     @@@@@   .@@@@@@@@@@@@@@@@@@@@@    @@@@@                    \n" +
                "                    @@@@&  @& #@@@@@@@@@@@@@@@@@@@* @#  @@@@@                   \n" +
                "                  #@@@@   @@    @@@@@@@@@@@@@@@@@    @@   @@@@,                 \n" +
                "                 @@@@@/  @@*   @@@@@@@@@@@@@@@@@@@   #@@  %@@@@@                \n" +
                "                @@@@@@   @@@    @% @@@@@@@@@@@ @@    @@@   @@@@@%               \n" +
                "                @@@@@@@  @@@@@@%@@@@@@@@@@@@@@@@@*@@@@@@  @@@@@@@               \n" +
                "                @@@@@@@@@.   @@@@@@@@@@@@@@@@@@@@@@@   .@@@@@@@@@               \n" +
                "                 @@@@@@@@@@@* @@@@%@@@@@@@@@@@,@@@@ %@@@@@@@@@@@                \n" +
                "                    *@@@@@ @@(@@ @@@@@@@@@@@@@@@ @@@@@ @@@@@,                   \n" +
                "                 @@@@@@@@@ @@ ,@@@@@@@@@ @@@@@@@@@.,@@ @@@@@@@@@                \n" +
                "                @@@@@@    @ @@@@@@@@@@.   ,@@@@@@@@@@ @   .@@@@@@               \n" +
                "                @@@@@@@@@ @@@@@@@@@  &     %  @@@@@@@@@ @@@@@@@@@               \n" +
                "                 @@@@@@@@ @@@@@@      @@ @@      @@@@@@ @@@@@@@@                \n" +
                "                          @@@@@@      @@ @@      @@@@@@                         \n" +
                "                           @@@@@@@@@@@@   @@@@@@@@@@@@                          \n" +
                "                             @@@@@@@#       %@@@@@@@                            \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                ");
    }

    public static void behemothPic() {
        System.out.println("                                                                                \n" +
                "            @@@@@@%                                                     @@@@@@. \n" +
                "         @@@@@@@@@@@@@@@@@                                         .@@@@@@      \n" +
                "        @@@@@@@@@@@@@@@@@@@@@@@  & @& @                          @@@@@@         \n" +
                "           @@@@@@@@@@@@@@@@@@@@@@@@@@@#                         &@@@@           \n" +
                "           @@@/@@@@@@@@@@@@@@@@@@@@@@@, & @& @@@&              @@@@@            \n" +
                "                @@@@@@@@@@@@@@@@@@@@@@@@&@@@@@  .              @@@@             \n" +
                "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               .@@@@@            \n" +
                "             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&                  #@@@@@           \n" +
                "  #@@@@       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                @@@@@@          \n" +
                "  @@@@@@@.     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                @@@@@@@        \n" +
                "   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  @@@@@@       \n" +
                "           @@@@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               %@@@@@,      \n" +
                "                   &  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@               @@@@@@@      \n" +
                "                     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.,             @@@@@@@@      \n" +
                "                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @  @ #@@@@@@@@      \n" +
                "                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@@@@@@@@@(      \n" +
                "                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       \n" +
                "                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \n" +
                "                @@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@           \n" +
                "               &@@@@@@@@@(             @@@@@@@@@@@@@@@@@@@@@@@@@@@              \n" +
                "                 @@@@@@@@@@                  @@@@@@@@@@@@(&                     \n" +
                "                 @@@@@@@@@@                   @@@@@@@@@@@                       \n" +
                "                  @@@@@@@@.                       .@@@@@@@@.                    \n" +
                "                  #@@@@@@@@                         @@@@@@@@@                   \n" +
                "              @@@@@@@@@@@@@@                       @@@@@@@@@@@@                 \n" +
                "             @@@@@@@@@@@                           @@& @@@ @@@@@                ");
    }

    public static void dragonPic() {
        System.out.println("                                                                                \n" +
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
                "               @@@@@@#  @@@@   (      @ @@@@@@#@@@@@@/                          \n" +
                "                                      @@@@@@@@@@@@@(           *@@%             \n" +
                "                %   @@ @@ @ @  @ @ ,@@@ @@@@@*@@@@@                             \n" +
                "            &@@@@@/@@@(@@@@@@@. @ @ @@@@@@@@@@@@   @@@                          \n" +
                "           @@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@ @@  @%       @                       \n" +
                "          @@@.@@@@@@@@@@@@@@@@@@@@@@@@ @@%      (           %                   \n" +
                "          @@@@@@@@@@ @               / @                                        \n" +
                "        @(@(/@@@@@@.         @ @@@@@@@@@@@@@                                    \n" +
                "         @@@/@@@@@@@@     *@@@@@@@@@@@@@@@@@@    @                              \n" +
                "          @@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                               \n" +
                "          @ @(@@@@@@@@@@@@@@@@@@&        @@@@@@@  @                             \n" +
                "              @@@%@@/@@@@@@@.            @@@@@@ @                               \n" +
                "                 % @    @             @@@@@@@ @  @                              \n" +
                "                       ,@@@@@@@@@@@@@@@@@@ @  *                                 \n" +
                "                    @@@@@@@    @ @ @ @  @                                       \n" +
                "                   @@@     @@@@                                                 \n" +
                "                  @@@    @@@  @@@                                               \n" +
                "                   @@@  @@@  /@@                                                \n" +
                "                     @@@@@@@@@                                                  \n" +
                "                          @@                                                    \n" +
                "                           @@@*                                                 \n" +
                "                          @@@@@                                                 \n" +
                "                             @@@@                                               \n" +
                "                                @@                                              \n" +
                "                                    @                                           \n" +
                "                                                                                \n" +
                "                                                                                \n");
    }

    public static void chestFound() {
        System.out.println("Oh, you found a chest! Checking things inside..");
    }

    public static void getFinalGameMessage() {
        System.out.println("Meh. Goodbye.");
    }
}

