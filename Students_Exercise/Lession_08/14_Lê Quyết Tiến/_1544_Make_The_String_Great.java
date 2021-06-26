import java.util.Stack;

public class _1544_Make_The_String_Great {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek().equals((char)(c + 32)) || stack.peek().equals((char) (c - 32))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        String s = "LeEeetcode";
        System.out.println(makeGood(s));
    }
}
