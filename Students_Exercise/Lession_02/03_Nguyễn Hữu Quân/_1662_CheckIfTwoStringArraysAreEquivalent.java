public class _1662_CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(String s : word1){
            str1.append(s);
        }
        String s1 = str1.toString();
        for(String s : word2){
            str2.append(s);
        }
        String s2 = str2.toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
