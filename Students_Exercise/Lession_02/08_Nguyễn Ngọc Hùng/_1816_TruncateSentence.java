public class _1816_TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String temp = "";
        String[] s1 = s.split("\\s");
        for (int i = 0; i < k; i++) {
            temp = temp.concat(s1[i]);
            if (i < k - 1) {
                   temp = temp + " ";
            }
         
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 3;
        System.out.println(truncateSentence(s, k));
    }
}
