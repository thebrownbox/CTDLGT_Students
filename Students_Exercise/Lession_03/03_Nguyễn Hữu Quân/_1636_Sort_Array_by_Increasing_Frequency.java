import java.util.*;

public class _1636_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) throws Exception {
        int[] arr = {8,-8,2,-8,-5,-3};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }

    public static int[] frequencySort(int[] nums) {
        int[] subArr = new int[201];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int index = nums[i];
            if(index < 0){
                index = 100 - index;
            }
            subArr[index]++;
            for(int j = i+1; j<n; j++){
                if(nums[j] == nums[i]){
                    subArr[index]++;
                    nums[j] = nums[n-1];
                    j--;
                    n--;
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                int subMinIndex = nums[minIndex];
                if(subMinIndex < 0){
                    subMinIndex = 100 - subMinIndex;
                }
                int index = nums[j];
                if(index < 0){
                    index = 100 - index;
                }
                if(subArr[index] < subArr[subMinIndex]){
                    minIndex = j;
                }else if(subArr[index] == subArr[subMinIndex]){
                    if(nums[j] > nums[minIndex]){
                        minIndex = j;
                    }
                }
            }
            if(minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            nums[nums.length-i-1] = nums[n-i-1];
        }
        int addIndex = 0;
        for(int i = 0; i < n; i++){
            int subMinIndex = nums[nums.length-n+i];
            if(subMinIndex < 0){
                subMinIndex = 100 - subMinIndex;
            }
            for(int j = 0; j < subArr[subMinIndex]; j++){
                nums[addIndex] = nums[nums.length-n+i];
                addIndex++;
            }
        }
        return nums;
    }
}
