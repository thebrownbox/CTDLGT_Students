
public class _1089_DuplicateZeros {

    /*
     * Given a fixed length array arr of integers, duplicate each occurrence of
     * zero, shifting the remaining elements to the right. Note that elements beyond
     * the length of the original array are not written. Do the above modifications
     * to the input array in place, do not return anything from your function.
     * Input: [1,0,2,3,0,4,5,0] Output: null Input: [1,2,3] Output: null
     */
    public void duplicateZero(int[] nums) {
        int i = 0,j = nums.length - 1;
        while (i < nums.length - 1) {
            if (nums[i] == 0) {
                // dịch phần tử sang bên phải
                while (j > i + 1) {
                    nums[j] = nums[j - 1];
                    j--;
                }
                // gán phần tử liền kề bằng 0
                nums[i + 1] = 0;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        _1089_DuplicateZeros a = new _1089_DuplicateZeros();
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        a.duplicateZero(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
