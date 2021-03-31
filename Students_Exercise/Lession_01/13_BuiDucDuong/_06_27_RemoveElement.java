public class _06_27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 2, 3 };
        int val = 3;
        System.out.println("Count " + removeElement(nums, val));
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
