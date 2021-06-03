package lab2_string_array;

public class _1221_Split_a_String {

  public static int balancedStringSplit(String s) {
    int countR = 0;
    int countL = 0;
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'R') {
        countR++;
      }
      if (s.charAt(i) == 'L') {
        countL++;
      }
      if (countL == countR) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String s = "LLRLRRLLRR";

    System.out.println(balancedStringSplit(s));
  }

}
