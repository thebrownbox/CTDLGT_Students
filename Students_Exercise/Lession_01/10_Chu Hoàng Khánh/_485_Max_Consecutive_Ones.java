/**
 * _485_Max_Consecutive_Ones
 */
public class _485_Max_Consecutive_Ones {

    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 1, 1, 1 };
        int[] a2 = { 1, 0, 1, 1, 0, 1 };

        findMaxConsecutiveOnes(a);
    }

    private static void findMaxConsecutiveOnes(int[] a) {
        int n = a.length;
        int count = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }

            if (count > k) {
                k = count;
            }
        }

        System.out.println(k);
    }
}