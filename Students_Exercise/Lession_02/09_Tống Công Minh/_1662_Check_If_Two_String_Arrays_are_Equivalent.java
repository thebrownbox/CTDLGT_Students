package lab2_string_array;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {

  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    String w1 = "";
    String w2 = "";

    for (int i = 0; i < word1.length; i++) {
      w1 += word1[i];
    }

    for (int i = 0; i < word2.length; i++) {
      w2 += word2[i];
    }

    if (w1.equals(w2))
      return true;
    return false;
  }

  public static void main(String[] args) {
    String[] word1 = { "ab", "c" };
    String[] word2 = { "a", "bcd" };

    System.out.println(arrayStringsAreEqual(word1, word2));
    System.out.println("Done");
  }
}
