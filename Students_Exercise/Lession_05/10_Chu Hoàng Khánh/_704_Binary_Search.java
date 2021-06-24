
public class _704_Binary_Search {
    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        System.out.println(search(a, 9));
    }

    public static int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}