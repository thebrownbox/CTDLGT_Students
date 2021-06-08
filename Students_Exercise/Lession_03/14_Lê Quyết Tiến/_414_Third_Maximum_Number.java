public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        int result =0;
        int n = nums.length - 1;
        int count = 0;
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > n - i; j--) {
                if (nums[j] > nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }

            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[0] && nums[i] != nums[i-1]) {
                count++;
            }
            if (count == 2) {
                result = nums[i];
                break;
            }       
        }
        if (count < 2) {
            result = nums[0];
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        int[] nums = { 2,2,3,2 };
        System.out.println(thirdMax(nums)); 
    }
}
