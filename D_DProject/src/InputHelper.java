import java.util.Scanner;

class InputHelper {
    private static final String LEAVE = "0";
    private static final String ATTACK_MONSTER = "1";
    private static final String SPECIAL_ATTACK = "2";
    private static final String ULTIMATE_ATTACK = "3";
    private static final String TALK = "4";
    public static int getOptionFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nOptions\n\n0.Leave\n1.Attack Monster\n2.Special Attack\n3.Ultimate Attack\n4.Talk");
        String selectedOption;
        while (true) {
            selectedOption = scan.nextLine();
            switch (selectedOption) {
                case LEAVE:
                    return 0;
                case ATTACK_MONSTER:
                    return 1;
                case SPECIAL_ATTACK:
                    return 2;
                case ULTIMATE_ATTACK:
                    return 3;
                case TALK:
                    return 4;
                default:
                    System.out.println("error, try again");
                    break;
            }
        }
    }
}
