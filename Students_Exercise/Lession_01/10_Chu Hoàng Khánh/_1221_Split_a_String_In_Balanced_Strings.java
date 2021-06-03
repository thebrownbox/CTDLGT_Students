public class _1221_Split_a_String_In_Balanced_Strings {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));
    }

    private static int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int a = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'R')
                r++;
            if (c == 'L')
                l++;

            if (l == r) {
                a++;
            }
        }
        return a;
    }
}
