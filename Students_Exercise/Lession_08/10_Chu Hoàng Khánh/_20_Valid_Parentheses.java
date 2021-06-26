import java.util.Stack;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()";
        // System.out.println(s.charAt(0));
        
        System.out.println(isValid(s));
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = stack.peek();
                if (c == ')' && temp == '(') {
                    stack.pop();
                }else if(c == '}' && temp == '{'){
                    stack.pop();

                } else if (c == ']' && temp == '[') {
                    stack.pop();
                } else {
                    return false;
                }
                
            }


        }
        
        return stack.isEmpty();
    }
}
