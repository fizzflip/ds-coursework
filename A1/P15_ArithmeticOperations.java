import java.util.Scanner;

public class P15_ArithmeticOperations {

    static int add(int a, int b) { return a + b; }

    static int subtract(int a, int b) { return a - b; }

    static int multiply(int a, int b) { return a * b; }

    static double divide(int a, int b) { return (double) a / b; }

    static int modulo(int a, int b) { return a % b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N1: ");
        int num1 = sc.nextInt();

        int num2;
        while (true) {
            System.out.print("N2: ");
            num2 = sc.nextInt();
            if (num2 != num1) break;
            else System.out.println("The second number must be different from the first.");
        }

        System.out.println("""
        Choose operation:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        5. Modulo
        """);

        System.out.print("Choice (1 - 5): ");
        String result = switch (sc.nextInt()) {
            case 1 -> "Result: " + add(num1, num2);
            case 2 -> "Result: " + subtract(num1, num2);
            case 3 -> "Result: " + multiply(num1, num2);
            case 4 -> (num2 != 0) ? "Result: " + divide(num1, num2) : "Division by zero is not allowed.";
            case 5 -> (num2 != 0) ? "Result: " + modulo(num1, num2) : "Modulo by zero is not allowed.";
            default -> "Invalid choice.";
        };

        System.out.println(result);
    }
}
