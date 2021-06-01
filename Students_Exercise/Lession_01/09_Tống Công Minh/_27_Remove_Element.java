public class _27_Remove_Element {

  public static int removeElement(int[] nums, int val) {

    int arrLength = nums.length;

    for (int i = 0; i < arrLength; i++) {
      if (nums[i] == val) {
        // gan gia tri i cua mang = i+1
        for (int j = i; j < arrLength - 1; j++) {
          nums[j] = nums[j + 1];
        }
        // giam length, i cua nums di 1
        i--;
        arrLength--;
      }
    }

    return arrLength;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
    System.out.println(removeElement(nums, 2));

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}
