import java.util.Arrays;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        int n = s.length;
       char[] a = new char [s.length];
       for (int i = 0; i < s.length; i++) {
           a[n-1-i] = s[i];
       }
       System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    
}
