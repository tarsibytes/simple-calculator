package operations;

import utils.InputHelper;
import utils.MenuNavigator;

public class Division {
    public static void divide() {
        System.out.println("""
        
        -------------------------------------------------------------
        ==== OPERATION 4 - DIVISION ===
        """);

        double num1 = InputHelper.readDouble("Enter the first number: ");
        double num2 = InputHelper.readDouble("Enter the second number: ");

        while (num2 == 0) {
            System.out.println("Cannot divide by zero. Please enter a different number.");
            num2 = InputHelper.readDouble("Enter the second number: ");
        }

        double result = num1 / num2;
        System.out.printf("Calculation:\n%.2f / %.2f = %.2f", num1, num2, result);

        MenuNavigator.askToReturn();
    }
}