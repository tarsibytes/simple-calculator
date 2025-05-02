package operations;

import utils.InputHelper;
import utils.MenuNavigator;

public class Addition {
    public static void sum() {
        System.out.println("""
        
        -------------------------------------------------------------
        ==== OPERATION 1 - ADDITION ===
        """);

        double num1 = InputHelper.readDouble("Enter the first number: ");
        double num2 = InputHelper.readDouble("Enter the second number: ");

        double result = num1 + num2;
        System.out.printf("\nCalculation:\n %.2f + %.2f = %.2f", num1, num2, result);

        MenuNavigator.askToReturn();
    }
}