package menu;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        System.out.println(
                "\n\n==== CALCULATOR ====\n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication\n" +
                "4 - Division\n" +
                "0 - Exit"
        );

        Scanner operationInput = new Scanner(System.in);
        System.out.println("\nPlease, inform which operation do you want to use: ");
        int userInput = operationInput.nextInt();

        switch (userInput) {
            case 1:
                operations.Addition.sum();
                break;
            case 2:
                operations.Subtraction.subtract();
                break;
            case 3:
                operations.Multiplication.multiply();
                break;
            case 4:
                operations.Division.divide();
                break;
            case 0:
                System.out.println("\n\nSee you!");
            default:
                System.out.println("\nInvalid option. Try again.\n");
                Menu.displayMenu();
        }
    }
}