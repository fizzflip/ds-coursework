import java.util.Scanner;

public class P02_SSNegativeEnd {
    
    static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) if (array[i] == key) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        int[] array = new int[N];
        System.out.println("Values: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = sc.nextInt();

            if (array[i] < 0) {
                System.out.println("Abort: Negative number");
                System.exit(0);
            }
        }

        System.out.print("Key: ");
        int key = sc.nextInt();

        int keyIndex = sequentialSearch(array, key);
        if (keyIndex == -1) System.out.printf("Key (%d) not found.", key);
        else System.out.printf("Key (%d) found at [%d].", key, keyIndex);
    }
}
