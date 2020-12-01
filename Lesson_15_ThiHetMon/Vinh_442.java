import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vinh_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return result;
    }
}
