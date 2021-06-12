public class _3_Find_Sum_In_Range {
    
    public static int findSumInRange(int[] arr, int startIndex, int endIndex){
        if(startIndex > endIndex || startIndex < 0){
            return 0;
        }else{
            return arr[startIndex] + findSumInRange(arr, startIndex+1, endIndex);
        }   
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findSumInRange(arr, -2, 6));
    }
}
