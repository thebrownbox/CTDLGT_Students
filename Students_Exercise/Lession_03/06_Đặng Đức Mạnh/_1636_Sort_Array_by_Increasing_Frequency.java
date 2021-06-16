public class _1636_Sort_Array_by_Increasing_Frequency {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
        System.out.println(Arrays.toString(frequencySort(new int[]{2, 3, 1, 3, 2})));
        System.out.println(Arrays.toString(frequencySort(new int[]{2, 8, -6, 4, 53, -6, 1, 4, 1})));
    
    }
    public static int[] frequencySort(int[] nums) {
        /*
         * Given an array of integers nums, sort the array in increasing order based on
         * the frequency of the values. If multiple values have the same frequency, sort
         * them in decreasing order.
         * 
         * Return the sorted array. Input: nums = [2,3,1,3,2] Output: [1,3,3,2,2]
         */
        int[] temp = new int[201];
        for (int n : nums)
            temp[n + 100]++;
        for (int i = 0; i < nums.length; i++)
            nums[i] = temp[nums[i] + 100] * 10000 - nums[i] + 100;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            nums[i] = 100 - nums[i] % 10000;
        return nums;
        return nums;
    }
}
