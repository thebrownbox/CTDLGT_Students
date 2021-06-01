public class Solution1 {
    public static void duplicateZeros(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if(i==0) count++;
        }
        int i = arr.length - 1, j = arr.length + count - 1;
        
        while (i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;
        }
        if (j < arr.length) {
            arr[j] = arr[i];
        }
        for (int k : arr) {
            System.out.print(k + "");
        }
    }
    
    private static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr); 
    }
}
