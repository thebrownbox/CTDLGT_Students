public class _1_Tim_Kiem_Tuan_Tu {
    
    public static int find (int x, int[] arr, int i){
        if(i >= arr.length || i < 0) {
            return -1;
        }else if(arr[i] == x){
            return i;
        }else{
            return find(x, arr, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(find(5, arr, 0));
    }
}
