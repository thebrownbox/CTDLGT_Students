import java.util.Stack;

public class _1544_Make_The_String_Great {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32){
                stack.pop();
            }
            else{
                stack.add(c);
            }
        }
        StringBuilder s1 = new StringBuilder();
        while(stack.size() > 0){
            s1.append(stack.pop());
        }
        return s1.reverse().toString();
    }
    public static void main(String[] args) throws Exception {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
