public class _1816_Truncate_Sentence {
    public String truncateSentence(String s, int k) {
        String [] str = s.split(" ");
        String t ="";
        for (int i = 0; i < k; i++) {
            t = t+str[i] +" ";
        }

        return t;
    }
}
