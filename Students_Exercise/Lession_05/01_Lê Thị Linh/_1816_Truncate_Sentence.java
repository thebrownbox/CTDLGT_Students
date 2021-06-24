/**
 * _1816_Truncate_Sentence
 */
public class _1816_Truncate_Sentence {

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.substring(0, sb.toString().length() - 1);
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }
}