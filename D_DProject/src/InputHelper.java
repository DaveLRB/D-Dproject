import java.util.Scanner;

class InputHelper {
    private static final String LEAVE = "0";
    private static final String ATTACK_MONSTER = "1";

    public static int getOptionFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nOptions\n\n0.Leave\n1.Attack Monster\n");
        String selectedOption;
        int option=0;
        do {
            selectedOption = scan.nextLine();
            switch (selectedOption) {
                case LEAVE:
                    break;
                case ATTACK_MONSTER:
                    option=1;
                    break;
                default:
                    System.out.println("error, try again");
                    break;
            }
        } while (!selectedOption.equals(LEAVE) && !selectedOption.equals(ATTACK_MONSTER));
        return option;
    }
}
