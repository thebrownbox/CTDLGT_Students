public class _1221_Split_A_String_In_Balanced_Strings {

    public int balancedStringSplit(String s) {
        int result = 0;
        int countR = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else {
                countL++;
            }
            if (countR == countL) {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        String s = "RLRRLLRLRL";
    }
}
