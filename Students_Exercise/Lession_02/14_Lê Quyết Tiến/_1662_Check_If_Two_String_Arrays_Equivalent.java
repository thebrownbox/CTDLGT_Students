public class _1662_Check_If_Two_String_Arrays_Equivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 ="";
        String s2 ="";

        for (String s : word1) {
            s1 += s;
        }
        for (String s : word2) {
            s2 += s;
        }
        
        return s1.equals(s2);
        
    }
    public static void main(String[] args) throws Exception {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
