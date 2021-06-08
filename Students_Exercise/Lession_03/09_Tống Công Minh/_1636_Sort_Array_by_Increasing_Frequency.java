package lab3_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class _1636_Sort_Array_by_Increasing_Frequency {

  public static int[] frequencySort(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    List<MyMap> maps = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = i + 1; j < n; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (maps.isEmpty()) {
        maps.add(new MyMap(nums[i], count));
        continue;
      }

      boolean existed = false;

      for (int j = 0; j < maps.size(); j++) {
        if (maps.get(j).k == nums[i]) {
          existed = true;
          break;
        }
      }

      if (!existed) {
        maps.add(new MyMap(nums[i], count));
      }
    }

    Collections.sort(maps);

    int j = 0;
    for (int i = 0; i < maps.size(); i++) {
      int count = maps.get(i).v;
      while (count > 0) {
        result[j] = maps.get(i).k;
        j++;
        count--;
      }
    }

    return result;
  }

  static class MyMap implements Comparable {
    int k;
    int v;

    public MyMap(int k, int v) {
      this.k = k;
      this.v = v;
    }

    @Override
    public int compareTo(Object o) {
      MyMap other = (MyMap) o;
      if (this.v > other.v) {
        return 1;
      }
      if (this.v == other.v && this.k < other.k) {
        return 1;
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    int[] nums = { -1, 1, -6, 4, 5, -6, 1, 4, 1};
    System.out.println(Arrays.toString(frequencySort(nums)));
    System.out.println("Done");
  }
}
