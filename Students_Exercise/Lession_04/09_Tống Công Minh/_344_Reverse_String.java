package Recursion;

public class _344_Reverse_String {

    public static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        reverse(l, r, s);
    }

    public static void reverse(int l, int r, char[] s) {
        if (l > r) return;

        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;

        reverse(l+1, r-1, s);
    }



    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};

        reverseString(s);
        System.out.println("DONE");

    }
}
