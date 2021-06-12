public class _414_Thirdmax {
    public static int thirdMax(int[] nums) {
        int max;
        int temp2;
        int temp;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j + 1] > nums[j]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max > nums[i]) {
                count++;
                max = nums[i];
                if (count == 2) {
                    break;
                }
            }
        }
        if (count < 2) {
                max = nums[0];
            }
        return max;
    }

    public static void main(String[] args) {
        int[] a = { 1,2 };
        System.out.println(thirdMax(a));
    }
}
