
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int count = 0;
        int R_count = 0;
        int L_count = 0;
        char[] s1 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            s1[i] = s.charAt(i);
            if (s1[i] == 'L') {
                L_count++;
            }
            if (s1[i] == 'R') {
                R_count++;
            }
            if (R_count == L_count) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        int count = 0;
        int R_count = 0;
        int L_count = 0;
        char[] s1 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            s1[i] = s.charAt(i);
            if (s1[i] == 'L') {
                L_count++;
            }
            if (s1[i] == 'R') {
                R_count++;
            }
            if (R_count == L_count) {
                count++;
            }
        }
        System.out.println(count);

    }
}
