package lab2_string_array;

public class _1221_Split_a_String {

  public static int balancedStringSplit(String s) {
    int countR = 0;
    int countL = 0;
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (countL == countR) {
        count++;
      }
      if (s.charAt(i) == 'R') {
        countR++;
      }
      if (s.charAt(i) == 'L') {
        countL++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String s = "LLLLRRRR";

    System.out.println(balancedStringSplit(s));
  }

}
