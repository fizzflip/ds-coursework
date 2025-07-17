import java.util.Scanner;

public class P15_ArithmeticOperations {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    static int modulo(int a, int b) {
        return a % b;
    }

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

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");

        System.out.print("Choice (1 - 5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println((num2 != 0) ? "Result: " + divide(num1, num2) : "Division by zero is not allowed.");
                break;
            case 5:
                System.out.println((num2 != 0) ? "Result: " + modulo(num1, num2) : "Modulo by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
