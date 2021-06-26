public class _766_Toeplitz_Matrix {
    public static void main(String[] args) {
        int[][] a = { 
            { 1, 2, 3, 4 }, 
            { 5, 3, 2, 3 }, 
            { 9, 5, 1, 2 },
           
        };

        // System.out.println(isToeplitzMatrix(a));
    }
    
    // public static boolean isToeplitzMatrix(int[][] a) {
    //     boolean check = false;
    //     int num = a[0][0];
    //     for (int i = 1; i < a.length; i++) {
    //         for (int j = 1; j < a.length; j++) {
    //            if (i == j) {
    //                if (a[i][j] == num) {
    //                    check = true;
    //                    break;
    //                } else {
    //                    check = false;
    //                    return check;
    //                }
    //            }
    //         }
    //     }
    //     return check;
    // }
}
