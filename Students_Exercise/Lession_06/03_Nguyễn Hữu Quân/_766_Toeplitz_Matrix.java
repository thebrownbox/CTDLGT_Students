public class _766_Toeplitz_Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 1;
        matrix[1][2] = 2;
        matrix[1][3] = 3;
        matrix[2][0] = 9;
        matrix[2][1] = 5;
        matrix[2][2] = 1;
        matrix[2][3] = 2;

        System.out.println(isToeplitzMatrix(matrix));
    }

    // GOOOD!
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int currRow = 1;
        while(currRow < matrix.length){
            for(int i = 1; i < matrix[0].length; i++){
                if(matrix[currRow-1][i-1] != matrix[currRow][i]){
                    return false;
                }
            }
            currRow++;
        }
        return true;
    }
}
