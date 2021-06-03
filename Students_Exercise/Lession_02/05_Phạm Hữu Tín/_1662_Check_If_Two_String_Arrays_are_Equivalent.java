public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = makeString(word1);
        String s2 = makeString(word2);
        return s1.equals(s2);
    }
    private static String makeString(String[] word1) {
        StringBuilder sb = new StringBuilder();
        for(String s:word1){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
