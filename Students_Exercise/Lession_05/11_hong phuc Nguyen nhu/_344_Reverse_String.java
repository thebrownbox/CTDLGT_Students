/**
 * _344_Reverse_String
 */
public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        
        reverseString(s);
    }
}