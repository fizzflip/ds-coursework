import java.util.Scanner;

public class P10_MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Values: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Row [%d]: ", i + 1);
            for (int j = 0; j < 3; j++) matrix[i][j] = sc.nextInt();
        }

        System.out.println("\nRows-wise sum:");
        for (int[] row : matrix) {
            int sumRow = 0;

            System.out.print("│");
            for (int i : row) {
                System.out.printf("%2d ", i);
                sumRow += i;
            }

            System.out.printf("│\t│%3d│\n", sumRow);
        }
    }
}