public class Bai1 {
    public int numIdenticalPairs(int[] nums) {
        int check = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    check++;
                }
            }
        }
        return check;
    }
}
