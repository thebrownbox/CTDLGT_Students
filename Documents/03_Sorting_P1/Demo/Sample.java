import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sample{
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3){
            return nums[nums.length-1];
        }
        return nums[nums.length-3];
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        
    }
}