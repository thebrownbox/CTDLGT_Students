public class _1221_Split_a_String {
    public static int balancedStringSplit(String s) {
        int count = 0; 
        int lvalue = 0; 
        int rvalue = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') rvalue ++;
            if (c == 'L') lvalue ++;
            if (lvalue == rvalue) count ++;
        }
        return count;
    }
        public static void main(String[] args) {
            String s = "RLRRLLRLRL";
            System.out.println(balancedStringSplit(s));
        }
}
