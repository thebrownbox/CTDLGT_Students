

class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (temp < count) {
                    temp = count;
                }
            }
            else {
                count = 0;
}
        }
        return temp;

    }
public static void main(String[] args) {
    int[] nums = { 1,0,1,1,0,1};
   System.out.println(findMaxConsecutiveOnes(nums));
}
}