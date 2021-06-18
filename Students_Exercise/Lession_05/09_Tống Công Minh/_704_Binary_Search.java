package binary_search;

public class _704_Binary_Search {

    public static int search(int[] nums, int target) {

        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int l, int r) {

        if (l > r)
            return -1;

        int m = (l + r) / 2;

        if (target == nums[m]) {
            return m;
        } else if (target < nums[m]) {
            return binarySearch(nums, target, l, m - 1);
        } else {
            return binarySearch(nums, target, l + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };

        System.out.println(search(nums, 5));
    }
}
