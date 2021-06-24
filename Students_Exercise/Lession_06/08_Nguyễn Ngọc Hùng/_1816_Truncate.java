

public class _1816_Truncate {
    public static String truncateSentence(String s, int k) {
        int n = 0;
        int count = 0;
        while (n < s.length()) {
            if (s.charAt(n) == ' ') {
                count++;
            }
            if (count == k) {
                s = s.substring(0, n);
            }
            n++;
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        String s2 = "chopper is not a tanuki";
        System.out.println(truncateSentence(s, 4));
        System.out.println(truncateSentence(s2, 5));
    }
}
