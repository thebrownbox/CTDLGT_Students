public class _766_Toeplitz_Matrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
