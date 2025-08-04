import java.util.Scanner;

public class P04_RecursiveSeries {

    public static int factorial(int num) {
        return (num <= 1) ? 1 : num * factorial(num - 1);
    }

    public static int gcd(int a, int b) {
        return (b != 0) ? gcd(b, a % b) : a;
    }

    public static int fibonacci(int num) {
        return (num <= 1) ? num : fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ==== Menu ====
                [1] Factorial
                [2] Greatest Common Divisor
                [3] Fibonacci Nth Term
                [4] Exit
                """);
        do {
            System.out.print("\nChoice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("N: ");
                    int num = sc.nextInt();
                    System.out.println("Factorial: " + factorial(num));
                }

                case 2 -> {
                    System.out.print("A: ");
                    int a = sc.nextInt();
                    System.out.print("B: ");
                    int b = sc.nextInt();
                    System.out.println("GCD: " + gcd(a, b));
                }

                case 3 -> {
                    System.out.print("N: ");
                    int num = sc.nextInt();
                    System.out.println("Fibonacci Nth Term: " + fibonacci(num));
                }

                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
