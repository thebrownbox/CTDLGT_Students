package finalexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duy_LeetCode_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        //sort the list
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i ++){
            if(nums[i] == nums[i-1]) {
                numList.add(nums[i]);
            }
        }
        return numList;
    }

    public static void main(String[] args) {
        int[] abc = {4,3,2,7,8,2,3,1};
        Duy_LeetCode_442 sd = new Duy_LeetCode_442();
        System.out.println(sd.findDuplicates(abc));
    }
}

