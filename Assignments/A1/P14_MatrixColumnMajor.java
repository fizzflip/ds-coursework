public class P14_MatrixColumnMajor {
    static void columnMajorOrder(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        for (int i = 0; i < C; i++)
            for (int j = 0; j < R; j++)
                System.out.print(matrix[j][i] + " ");
    }
}
