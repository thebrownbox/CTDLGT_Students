
public class _344_reverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        reverse(s, start, end);
    }

    public static void reverse(char[] s, int start, int end) {
        char temp = s[start];
        if (start >= end) {
            return;
        }
        s[start] = s[end];
        s[end] = temp;
        reverse(s, start+1, end-1);
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        // System.out.println(Arrays.toString(s));
        reverseString(s);
    }
}
