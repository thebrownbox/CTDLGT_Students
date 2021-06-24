public class _709_To_Lower_Case {
    public static void main(String[] args) {
        String s = "HeLLo";

        // char ch = (char) (s.charAt(0) + 32);

        // System.out.println(ch);


        System.out.println(toLowerCase(s));
    }
    
    public static String toLowerCase(String s) {
        StringBuilder builder = new StringBuilder("");
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                builder.append((char)(s.charAt(i) + 32));
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
