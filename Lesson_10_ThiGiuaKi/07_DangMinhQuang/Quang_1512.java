package lesson10;

public class Quang_1512 {
    public static void main(String[] args) {
        int[] nums = {2,3,2,4,1,4};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums){
        int ct = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    ct++;
            }
        }
        return ct;
    }
}
