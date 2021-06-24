public class _766_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int size = matrix.length;
        boolean[] thina = new boolean[size - 1];

        int k = 0;
        for (int i = 0; i < size - 1; i++) {
            int num = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i + 1][j + 1]) {
                    num = num + 1;
                }
            }
            if (num == matrix[i].length - 1) {
                thina[k] = true;
                k = k + 1;
            } else {
                thina[k] = false;
                k = k + 1;
            }
        }
        
        boolean result = true;
        for (int i = 0; i < thina.length; i++) {
            if (thina[i] == false) {
                result = false;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {

    }

}
