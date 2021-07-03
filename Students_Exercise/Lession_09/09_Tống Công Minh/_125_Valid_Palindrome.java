
import java.util.ArrayList;
import java.util.List;

public class _125_Valid_Palindrome {

    public static boolean isPalindrome(String s) {

        char[] temp = s.toLowerCase().trim().toCharArray();
        int a = (int)'a';
        int z = (int)'z';
        int zero = (int)'0';
        int nine = (int)'9';
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            int c = (int)temp[i];
            if (c  > (a-1) && c  < (z+1)) {
                chars.add(temp[i]);
            } else if (c  > (zero-1) && c  < (nine+1)) {
                chars.add(temp[i]);
            }
        }

        if (chars.isEmpty()) return true;
        if (chars.size() == 1) return true;

        for (int i = 0; i < chars.size()/2+1; i++) {
            if (chars.get(i) != chars.get(chars.size() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "9,8";
        System.out.println(isPalindrome(s));
    }
}
