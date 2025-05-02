package utils;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner userInput = new Scanner(System.in);

    public static double readDouble(String message) {
        System.out.println(message);

        while (!userInput.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number: ");
            userInput.next();
        }

        return userInput.nextDouble();
    }
}