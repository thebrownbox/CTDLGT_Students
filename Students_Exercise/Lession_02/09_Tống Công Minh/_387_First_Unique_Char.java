package lab2_string_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _387_First_Unique_Char {

  public static int firstUniqChar(String s) {

    // Xac dinh cac ky tu chi xuat hien 1 lan
    int[] count = new int[123];

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int index = (int)c;
      count[index]++;
    }

    // Trong nhung ky tu tren tra ve index cua ky tu dau tien xuat hien
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (count[(int) c] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String s = "leetcode";
  }
}
