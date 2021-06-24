public class _1816_Truncate_Sentence {
    public static String truncateSentence(String s, int k) {
        String [] str = s.split(" ");
        String res ="";
        for (int i = 0; i < k; i++) {
            res = res + str[i] + " ";
            
        }
        return res.trim();
    }
    public static void main(String[] args) {
        String s = "Heloo Hello how are you Contestant";
        System.out.println(truncateSentence(s, 3));
    }
    
}
