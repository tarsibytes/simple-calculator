public class Subtraction {
    public static void subtract() {
        System.out.println(
                "-------------------------------------------------------------" +
                        "\n==== OPERATION 2 - SUBTRACTION ===="
        );

        double num1 = InputHelper.readDouble("Enter the first number: ");
        double num2 = InputHelper.readDouble("Enter the second number: ");

        double result = num1 - num2;
        System.out.printf("Current subtraction:\n%.2f - %.2f = %.2f", num1, num2, result);
    }
}