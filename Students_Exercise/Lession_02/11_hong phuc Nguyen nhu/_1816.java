public class _1816 {
    public static String truncateSentence(String s, int k) {
        String result = " ";
        String s1[] = s.split(" ");
        for (int i = 0; i < k - 1; i++) {
            result += s1[i];
        }
        result += s1[k - 1];
        return result;
    }
public static void main(String[] args) {
    String s = "What is the solution to this problem";
    int k = 4;
    System.out.println(truncateSentence(s, k));
}
}
