package utils;
import java.util.Scanner;

public class MenuNavigator {
    private static final Scanner userInput = new Scanner(System.in);
    public static void askToReturn() {
        System.out.println("\n\nDo you want to go back to the menu? Y/N");
        String answer = userInput.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            menu.Menu.displayMenu();
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("\nExiting the calculator. Goodbye!");
        } else {
            System.out.println("Invalid option. Please enter Y or N.");
            askToReturn();
        }
    }
}
