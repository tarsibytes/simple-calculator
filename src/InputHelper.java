import java.util.Scanner;

public class InputHelper {
    private static final Scanner userInput = new Scanner(System.in);

    public static double readDouble(String message) {
        System.out.println(message);
        return userInput.nextDouble();
    }
}