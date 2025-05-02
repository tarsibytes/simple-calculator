public class Multiplication {
    public static void multiple() {
        System.out.println(
                "-------------------------------------------------------------" +
                "\n==== OPERATION 3 - MULTIPLICATION ===="
        );

        double num1 = InputHelper.readDouble("Enter the first number: ");
        double num2 = InputHelper.readDouble("Enter the second number: ");

        double result = num1 * num2;
        System.out.printf("Current multiplication:\n%.2f * %.2f = %.2f", num1, num2, result);
    }
}