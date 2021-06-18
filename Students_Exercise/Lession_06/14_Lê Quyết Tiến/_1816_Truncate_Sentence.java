public class _1816_Truncate_Sentence {

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
            if (count == k) {
                sb.delete(i, s.length());
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }
}
