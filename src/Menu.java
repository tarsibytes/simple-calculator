import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        System.out.println(
                "==== CALCULATOR ====\n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication\n" +
                "4 - Division\n" +
                "0 - Exit"
        );

        Scanner operacaoEscolhida = new Scanner(System.in);
        System.out.println("\nPlease, inform which operation do you want to use: ");
        int userInput = operacaoEscolhida.nextInt();

        switch (userInput) {
            case 1:
                Addition.sum();
                break;
            case 2:
                Subtraction.subtract();
                break;
            case 3:
                Multiplication.multiple();
                break;
            case 4:
                Division.divide();
                break;
            default:
                System.out.println("\n\nSee you!");
        }

    }
}