public class Travel_Array_2D {
    static int row = 0;
    static int column = 0;
    public static void travel(int[][] a, int i, int j) {
        if (row >= i) {
            return;
        }
        System.out.println("[" + row + "," + column + "]");
        column++;
        if (column >= j) {
            row++;
            column = 0;
        }
        travel(a, i, j);  
    }

    public static void main(String[] args) throws Exception {
        int[][] a = new int[2][3];
        travel(a, 2, 3);
    }
}
