/**
 * _344_Reverse_String
 */
public class _344_Reverse_String {

    public static void swap(char[] a, int i, int j) {
        if (i >= 0 && j <= a.length && i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            swap(a, i + 1, j - 1);
        }
    }

    public static void reverseString(char[] s) {
        swap(s, 0, s.length - 1);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
        }

    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        System.out.print("Mang dao nguoc la: ");
        reverseString(s);
    }
}