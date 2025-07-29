import java.util.Scanner;

public class P01_ArrayOrder {

    static int R, C;

    static void rowMajorOrder(int[][] array) {
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                System.out.print(array[i][j] + " ");
    }

    static void columnMajorOrder(int[][] array) {
        for (int i = 0; i < C; i++)
            for (int j = 0; j < R; j++)
                System.out.print(array[j][i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("R: ");
        R = sc.nextInt();
        System.out.print("C: ");
        C = sc.nextInt();

        int[][] array = new int[R][C];

        System.out.println("\nValues: ");
        for (int i = 0; i < R; i++) {
            System.out.printf("Row [%d]: ", i + 1);
            for (int j = 0; j < C; j++) array[i][j] = sc.nextInt();
        }

        System.out.print("\nColumn Major Order : ");
        columnMajorOrder(array);

        System.out.print("\nRow Major Order    : ");
        rowMajorOrder(array);
    }
}
