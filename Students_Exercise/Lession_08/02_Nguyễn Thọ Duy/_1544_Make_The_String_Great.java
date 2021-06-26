import java.util.Stack;

public class _1544_Make_The_String_Great {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char temp = stack.peek();
                if (Character.toLowerCase(temp) == Character.toLowerCase(c) && temp != c) {
                    stack.pop();
                }

                else {
                    stack.push(c);
                }

            }
        }
        StringBuilder str = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }        
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "leEeetcode"; // output: leetcode
        System.out.println("------------------------------");
        System.out.println(makeGood(s));
    }

}
