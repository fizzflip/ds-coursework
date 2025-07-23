import java.util.Scanner;

public class P05_MergeArrays {

    static Scanner sc = new Scanner(System.in);

    static int[] getArray() {
        System.out.print("N: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        System.out.print("Values: ");
        for (int i = 0; i < N; i++) array[i] = sc.nextInt();

        return array;
    }

    public static void main(String[] args) {
        int[] arr1 = getArray(), arr2 = getArray();

        int finalLength = arr1.length + arr2.length;
        int[] merged = new int[finalLength];

        int i;
        for (i = 0; i < arr1.length; i++) merged[i] = arr1[i];
        for (; i < finalLength; i++) merged[i] = arr2[i - arr1.length];

        System.out.print("Merged: ");
        for (int j : merged) System.out.print(j + " ");
    }
}
