public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int dem = 0;
        for(int i=0; i<n; i++){
            dem = 0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]) dem++;
            }
            arr[i] = dem;
        }
        return arr;
    }
    public static void main(String[] args) throws Exception {
       
    }
}
