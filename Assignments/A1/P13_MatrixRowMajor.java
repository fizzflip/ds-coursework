public class P13_MatrixRowMajor {
    static void rowMajorOrder(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                System.out.print(matrix[i][j] + " ");
    }
}
