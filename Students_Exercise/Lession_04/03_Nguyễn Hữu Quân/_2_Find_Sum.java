public class _2_Find_Sum {
    
    public static int findSum(int[] arr, int i){
        if(i >= arr.length || i < 0){
            return 0;
        }else{
            return arr[i] + findSum(arr, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findSum(arr, 0));
    }
}
