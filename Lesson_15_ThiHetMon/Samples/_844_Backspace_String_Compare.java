/**
 * https://leetcode.com/problems/backspace-string-compare/
 * Tags: Array, Stack
 */
import java.util.Stack;

public class _844_Backspace_String_Compare {

    public String formatString(String s)
    {
        Stack<Character> st1 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '#'){
                if(st1.isEmpty() == false)
                    st1.pop();
            }else{
                st1.push(c);
            }
        }

        String result = "";
        for (Character character : st1) {
            result += character;
        }
        return result;
    }

    public boolean backspaceCompare(String S, String T) {
        String s2 = formatString(S);
        String t2 = formatString(T);
        return s2.equals(t2);
    }

    public static void main(String[] args) {
        
    }
}
