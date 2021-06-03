/**
 * _1662
 */
public class _1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arr = "";
        String arr1 = "";
        for (int i = 0; i < word2.length; i++) {
            arr1 += word2[i];
        }
        for (int i = 0; i < word1.length; i++) {
            arr += word1[i];
        }
        return arr.equalsIgnoreCase(arr1);
    }
    public static void main(String[] args) {
      String[] word1 = {"ab", "c"};

      String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}