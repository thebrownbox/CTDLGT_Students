import java.util.Stack;

/**
 * _1544_Make_The_String_Great
 */
public class _1544_Make_The_String_Great {
    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && Math.abs(st.peek() - c) == 32) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        while (!st.isEmpty())
            result.append(st.pop());
        return result.reverse().toString();
    }

    public static void main(String args[]) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));

    }

}
