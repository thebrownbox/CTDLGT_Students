package lab3_sorting;

import java.util.Arrays;

public class _1051_Height_Checker {

  public static int heightChecker(int[] heights) {
    int result = 0;
    int n = heights.length;
    int[] tempA = heights.clone();
    Arrays.sort(tempA);

    for (int i = 0; i < n; i++) {
      if (heights[i] != tempA[i]) {
        result++;
      }
    }

    return result;
  }

  public void bubbleSort(int[] heights) {
    int n = heights.length;
    for (int i = 0; i < n; i++) {
      boolean isSorted = true;
      for (int j = 0; j < n - i - 1; j++) {
        if (heights[j] > heights[j + 1]) {
          int t = heights[j];
          heights[j] = heights[j + 1];
          heights[j + 1] = t;
          isSorted = false;
        }
      }
      if (isSorted)
        break;
    }
  }

  

  public static void main(String[] args) {
    int[] heights = { 1, 1, 4, 2, 1, 3 };
    int result = heightChecker(heights);
    System.out.println(result);
  }

}
