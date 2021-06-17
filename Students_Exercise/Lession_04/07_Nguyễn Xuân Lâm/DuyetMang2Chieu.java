public class DuyetMang2Chieu {
    static void travel(int[][] a, int i, int j) {
        if (i >= 0) {
            if (j >= 0) {
                if (i < a.length && j < a[i].length) {
                    System.out.println(i + " " + j);
                    if (j == a[i].length - 1) {
                        i++;
                        j = 0;
                        if (i < a.length)
                            System.out.println(i + " " + j);
                    }
                    travel(a, i, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][]a = new int[3][3];
        travel(a, 0, 0);
    }
}
