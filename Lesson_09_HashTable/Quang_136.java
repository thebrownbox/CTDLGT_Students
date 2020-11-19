import java.util.HashMap;
import java.util.Map;

public class Quang_136 {
    public static void main(String[] args) {
        int[] nums = {5,5,4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (var me : map.entrySet()) {
            if (me.getValue() == 1)
                ans = me.getKey();
        }
        return ans;
    }
}

