public class _1221 {
    public static int balancedStringSplit(String s) {
        int result = 0;
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else {
                countL++;
            }
            if (countL == countR) {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLR";
        System.out.println(balancedStringSplit(s));
    }
}
