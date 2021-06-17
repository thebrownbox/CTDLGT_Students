public class Travel_Array_2D {
    public static void travel(int[][] a, int i, int j) {
        if (i >= a.length) {
            return;
        }
        System.out.println("[" + i + "," + j + "]");
        j++;
        if (j >= a[i].length) {
            i++;
            j = 0;
        }
        travel(a, i, j);  
    }

    public static void main(String[] args) throws Exception {
        int[][] a = new int[2][3];
        travel(a, 0, 0);
    }
}
