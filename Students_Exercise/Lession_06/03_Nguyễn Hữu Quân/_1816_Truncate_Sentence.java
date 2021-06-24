public class _1816_Truncate_Sentence {

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }

    public static String truncateSentence(String s, int k) {
        int countSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countSpaces++;
            }
            if (countSpaces == k) {
                return s.substring(0, i);
            }
        }
        return s;
    }
}
