public class Main{
    public static void travel(int[][] a, int i, int j){
        if (i < a.length){
            System.out.println("[" + i + "," + j + "]");
            if (j < a[i].length - 1){
                travel(a, i, j + 1);
            }
            else{
                travel(a, i + 1, 0);
            }
        }
    }

    public static void main(String[] args){
        int[][] arr = new int[2][3];

        travel(arr, 0, 0);
    }
}

