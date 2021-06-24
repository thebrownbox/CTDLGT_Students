public class _1816_Truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";

        System.out.println(truncateSentence(s, 4));
    }
    
    public static String truncateSentence(String s, int k) {
        StringBuilder builder = new StringBuilder("");
        int count = 0;        
        for (char i : s.toCharArray()) {
            if (i == ' ') {
                count++;
            }
            if (count < k) {
                builder.append(i);
            }
        }
        return builder.toString();
        // int i = 0;
        // for (char c : s.toCharArray()) {
        //     if (c == ' ')
        //         k--;
        //     if (k == 0)
        //         return s.substring(0, i);
        //     i++;
        // }
        // return s;
    }
}
