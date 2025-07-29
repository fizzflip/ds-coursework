import java.util.Scanner;

public class P07_ArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        int[] array = new int[N];
        System.out.print("Values: ");
        for (int i = 0; i < N; i++) array[i] = sc.nextInt();

        int min = 0;
        for (int i : array) min = Math.min(min, i);

        System.out.println("Min: " + min);
    }
}
