/**
 * _485_findMaxConsecutiveOnes
 */
public class _485_findMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int max = 0;
        int surmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                surmax++;
            else {
                if (surmax > max)
                    max = surmax;
                surmax = 0;
            }
        }
        if (surmax > max)
            max = surmax;
        System.out.print("Gia tri can tim la: ");
        System.out.println(max);
    }
}
