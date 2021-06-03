public class _283_Move_Zero {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int i = 0, j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                    j++;
                }
            }

        }
        System.out.println("Mang moi la: ");
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }

    }

}
