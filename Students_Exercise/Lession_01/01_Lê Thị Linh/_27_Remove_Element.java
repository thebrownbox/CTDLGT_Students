class _27_Remove_Element {
    public static int remove(int nums[], int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                exch(nums, i, n - 1);
                n--;
            } else {
                i++;
            }
        }
        return n;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int rm = remove(nums, 2);
        System.out.print("So phan tu cua mang moi la: ");
        System.out.println(rm);
        System.out.println("Mang moi la: ");

        for (int i = 0; i < rm; i++) {

            System.out.println(nums[i]);
        }

    }

    private static void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
