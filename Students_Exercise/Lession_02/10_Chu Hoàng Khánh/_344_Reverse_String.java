public class _344_Reverse_String {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'l' };
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        for (int i = r; i > l; i--) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
        }

       
    }
}
