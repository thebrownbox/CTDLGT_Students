package LeetCode;

public class NguyenDucChau_1512 {
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));

    }
}
