public class _1662_arrayStrings {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean check = false;
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < word1.length; i++) {
            temp1 = temp1+ word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            temp2 = temp2+ word2[i];
        }
        if (temp1.equals(temp2)) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        String[] w1 = {"abc", "d", "defg" };
        String[] w2 = { "abcddefg" };
        boolean check = false;
        String temp1="";
        String temp2="";
        for (int i = 0; i < w1.length; i++) {
            temp1 = temp1 + w1[i];
        }
        for (int i = 0; i < w2.length; i++) {
            temp2 = temp2+ w2[i];
        }
        if (temp1.equals(temp2)) {
            check = true;
        }
        System.out.println(check);
        System.out.println(arrayStringsAreEqual(w1, w2));
    }
}
