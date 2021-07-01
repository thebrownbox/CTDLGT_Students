
import java.util.Arrays;

public class _1365_How_Many_Numbers_Are_Smaller {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j] && nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {6,5,4,8};
        int[] result =  smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}
