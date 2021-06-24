public class _766_Toeplitz {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = 0;
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                m = i + 1;
                n = j + 1;
                while (m < matrix.length && n < matrix[0].length) {
                    if (temp == matrix[m][n]) {
                        m++;
                        n++;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
        int[][] b = { {1,2},{2,2} };
        System.out.println(isToeplitzMatrix(a));
        System.out.println(isToeplitzMatrix(b));
    }
}
