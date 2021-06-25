import java.util.Stack;

public class _1544_Make_The_String_Great {
    public static void main(String[] args) {
        String s = "Cc";

        System.out.println(makeGood(s));
    }
    
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
            } else if (!stack.empty() && Math.abs((stack.peek() - s.charAt(i))) != 32) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        
        for (Character ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
