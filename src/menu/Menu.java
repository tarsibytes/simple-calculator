package menu;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        Scanner operationInput = new Scanner(System.in);

        while(true) {
            System.out.println("""
        
            ==== CALCULATOR ====
            1 - Addition
            2 - Subtraction
            3 - Multiplication
            4 - Division
            0 - Exit
            """);

            System.out.println("Please, inform which operation do you want to use: ");

            if (!operationInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                operationInput.next();
                continue;
            }

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
}