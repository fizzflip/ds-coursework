import java.util.Scanner;

public class InterleaveArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        System.out.print("Array 1: ");
        int[] arrayOne = new int[N];
        for (int i = 0; i < N; i++) arrayOne[i] = sc.nextInt();

        System.out.print("Array 2: ");
        int[] arrayTwo = new int[N];
        for (int i = 0; i < N; i++) arrayTwo[i] = sc.nextInt();

        System.out.print("Result: ");
        for (int i = 0; i < N; i++)  {
            if (i == N - 1)  {
                System.out.printf("%d %d", arrayOne[i], arrayTwo[0]);
                break;
            }
            System.out.printf("%d %d ", arrayOne[i], arrayTwo[i + 1]);
        }
    }
}



