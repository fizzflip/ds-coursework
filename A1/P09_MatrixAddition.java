import java.util.Scanner;

public class P09_MatrixAddition {

    static Scanner sc = new Scanner(System.in);
    static int R, C;

    static int[][] getMatrix() {
        int[][] matrix = new int[R][C];

        System.out.println("Values: ");
        for (int i = 0; i < R; i++) {
            System.out.printf("Row [%d]: ", i + 1);
            for (int j = 0; j < C; j++) matrix[i][j] = sc.nextInt();
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.print("R: ");
        R = sc.nextInt();
        System.out.print("C: ");
        C = sc.nextInt();

        int[][] matrixOne = getMatrix(), matrixTwo = getMatrix();

        int[][] resultMat = new int[R][C];
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                resultMat[i][j] = matrixOne[i][j] + matrixTwo[i][j];

        System.out.println("Result: ");
        for (int[] row : resultMat) {
            for (int i : row) System.out.printf("%2d ", i);
            System.out.println();
        }
    }
}
