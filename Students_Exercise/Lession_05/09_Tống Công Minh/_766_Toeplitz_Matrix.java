package binary_search;

public class _766_Toeplitz_Matrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {

        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        while (i + 1 < m) {
            while (j + 1 < n) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
                j++;
            }
            j = 0;
            i++;
        }

        return true;

    }

    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
        // int[][] matrix = { { 39, 24 } };
        int[][] matrix = { { 53, 64, 90, 98, 34 }, { 91, 53, 64, 90, 98 }, { 17, 91, 53, 64, 0 } };
        System.out.println(isToeplitzMatrix(matrix));
    }

}
