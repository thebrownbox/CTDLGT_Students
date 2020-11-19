package lesson10;

public class Quang_724 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(pivotIndex(nums));
    }


    public static int pivotIndex(int[] nums){
        for(int i=0;i<nums.length;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0;j<i;j++){
                sum1 +=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                sum2+=nums[j];
            }
            if(sum1==sum2)
                return i;
        }
        return -1;
    }
}
