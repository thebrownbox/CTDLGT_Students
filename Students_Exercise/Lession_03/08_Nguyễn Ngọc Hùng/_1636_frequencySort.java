import java.util.Arrays;

public class _1636_frequencySort {
    public static int[] frequencySort(int[] nums) {
        int[] count = new int[201];
        for (int n : nums)
            count[n + 100]++;
        for (int i = 0; i < nums.length; i++)
            nums[i] = count[nums[i] + 100] * 1000 - nums[i] + 100;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            nums[i] = 100 - nums[i] % 1000;
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
        System.out.println(Arrays.toString(frequencySort(new int[]{2, 3, 1, 3, 2})));
        System.out.println(Arrays.toString(frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
    }
}
