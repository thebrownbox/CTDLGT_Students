import java.util.Arrays;

public class _1636_Sort_Array_by_Increasing_Frequency {
    public static int[] frequencySort(int[] nums) {
        int[] temp = new int[201];
        for (int n : nums)
            temp[n + 100]++;
        for (int i = 0; i < nums.length; i++)
            nums[i] = temp[nums[i] + 100] * 10000 - nums[i] + 100;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            nums[i] = 100 - nums[i] % 10000;
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
        System.out.println(Arrays.toString(frequencySort(new int[]{2, 3, 1, 3, 2})));
        System.out.println(Arrays.toString(frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
    }
}
