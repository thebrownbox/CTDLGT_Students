class Solution {
     public static int thirdMax(int[] nums) {
        int count = 1;
        int count1 = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] < key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1])
            {
                count++;
            }

        }

        if(count < 3)
        {
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > max)
                {
                    max = nums[i];
                }

            }

            return  max;
        }
        else if(count>=3)
        {
            for (int i = 0; i < nums.length; i++) {

                if (count1 == 2) {
                    return nums[i];
                }
                if (nums[i] != nums[i + 1]) {
                    count1++;
                }
            }
        }
        return  -1;

    }
}