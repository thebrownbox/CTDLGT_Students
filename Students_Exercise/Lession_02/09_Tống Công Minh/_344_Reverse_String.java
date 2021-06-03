package lab2_string_array;

public class _344_Reverse_String {

  public static void reverseString(char[] s) {

    for (int i = 0; i < s.length/2; i++) {
      char temp = s[s.length - 1 - i];
      s[s.length - 1 - i] = s[i];
      s[i] = temp;
    }
  }

  public static void main(String[] args) {
    char[] s = { 'h', 'e', 'l', 'l', 'o' };
    reverseString(s);
  }
  
}
