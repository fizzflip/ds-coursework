import java.util.Scanner;

public class P06_ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        int[] array = new int[N];
        System.out.print("Values: ");
        for (int i = 0; i < N; i++) array[i] = sc.nextInt();

        int max = 0;
        for (int i : array) max = Math.max(max, i);

        System.out.println("Max: " + max);
    }
}
