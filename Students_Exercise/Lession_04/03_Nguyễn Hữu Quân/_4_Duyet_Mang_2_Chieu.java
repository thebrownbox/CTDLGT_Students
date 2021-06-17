public class _4_Duyet_Mang_2_Chieu {

    public static void travel(int[][] arr, int i, int j){
        if(i < arr.length){
            if(j < arr[i].length){
                travelJ(arr, i, j);
            }
            travel(arr, i+1, 0);
        }
    }

    public static void travelJ (int[][] arr, int i, int j){
        if(j < arr[i].length){
            System.out.print(arr[i][j] + " ");
            travelJ(arr,i, j+1);
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;
        travel(arr, 0, 0);
    }
}
