package lab3_sorting;

import java.util.Arrays;

public class _414_Third_Maximum_Number {

  public static int thirdMax(int[] nums) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    int[] tmpArr = nums.clone();

    // Sap xep lai mang theo thu tu tang dan
    // Duyet nguoc lai tang bien dem khi gap gia tri nho hon
    Arrays.sort(tmpArr);
    int lower = tmpArr[n - 1];
    int count = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (tmpArr[i] < lower) {
        lower = tmpArr[i];
        count++;
      }
      if (count == 2) {
        return tmpArr[i];
      }
    }
    return tmpArr[n - 1];
  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 1 };
    int result = thirdMax(nums);
    System.out.println(result);
  }
}
