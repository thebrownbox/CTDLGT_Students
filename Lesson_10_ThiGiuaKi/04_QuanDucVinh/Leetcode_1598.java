import java.util.Stack;

public class Leetcode_1598 {
    public static int minOperations(String[] logs) {
        Stack stack = new Stack();
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (logs[i].equals("./")) {
            } else {
                stack.push(logs[i]);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String[] logs = {"./","../","./"};
        System.out.println(minOperations(logs));
    }
}
