/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * Level: E
 * Tags: Array
*/

/**
 * Bai_1_01
 */
public class Bai_1_01 {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    result++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        
    }
}