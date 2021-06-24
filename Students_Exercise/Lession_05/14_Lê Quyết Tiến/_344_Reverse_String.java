import java.util.Arrays;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        swapChar(s, i, j);
    }

    public static void swapChar(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        swapChar(s, i + 1, j - 1);
    }
    public static void main(String[] args) throws Exception {
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
