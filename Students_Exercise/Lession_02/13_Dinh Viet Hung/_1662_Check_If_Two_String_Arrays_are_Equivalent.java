public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1;
        String w2;
        boolean result = false;

        for (int i = 0; i < word1.length; i++) {
            w1 = word1[i] + word1[i + 1];
        }

        for (int j = 0; j < word2.length; j++) {
            w2 = word2[j] + word2[j + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int w1;
        int w2;
        boolean result = false;

        for (int i = 0; i < word1.length; i++) {
            w1 = word1[i] + word1[i + 1];
        }
    }
}
