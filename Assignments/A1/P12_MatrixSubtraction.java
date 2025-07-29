import java.util.Scanner;

public class P12_MatrixSubtraction {

    static Scanner sc = new Scanner(System.in);

    static int[][] getMatrix() {
        int[][] matrix = new int[3][3];

        System.out.println("Matrix: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Row [%d]: ", i + 1);
            for (int j = 0; j < 3; j++) matrix[i][j] = sc.nextInt();
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrixOne = getMatrix(), matrixTwo = getMatrix();

        System.out.println("Result: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%2d ", matrixOne[i][j] - matrixTwo[i][j]);
            System.out.println();
        }
    }
}