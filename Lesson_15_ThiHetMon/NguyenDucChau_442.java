package Final;

import java.util.*;

public class NguyenDucChau_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i - 1]){
                result.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        NguyenDucChau_442 n = new NguyenDucChau_442();
        System.out.println(n.findDuplicates(a));
    }
}

