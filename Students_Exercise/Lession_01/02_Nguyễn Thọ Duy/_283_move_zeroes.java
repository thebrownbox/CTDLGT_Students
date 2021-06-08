public class _283_move_zeroes {
        public static void moveZeroes(int[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++)
                        for (int j = 0; j < n - i - 1; j++)
                                if (arr[j] == 0) {
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                }
        }

        public static void main(String[] args) {
                int[] nums = { 0, 2, 5, 0, 1 };
                moveZeroes(nums);
                System.out.println("check success!");
        }
}
