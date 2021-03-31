import java.util.ArrayList;
import java.util.List;

public class _12_448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] fre = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (fre[i] == 0) {
                list.add(fre[i]);
            }
        }
        return list;
    }
}
