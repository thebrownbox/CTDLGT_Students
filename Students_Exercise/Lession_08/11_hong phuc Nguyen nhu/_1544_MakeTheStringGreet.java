public class _1544_MakeTheStringGreet {
     public static String makeGood(String s) {
        for (int i = 0; i < s.length()-1 ; i++) {
            if (s.charAt(i)+32 == s.charAt(i+1)||s.charAt(i) == s.charAt(i+1)+32){
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }

        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
    }
}
