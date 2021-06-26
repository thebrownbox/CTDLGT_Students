import java.util.Stack;

public class _1544_StringGreat {
    public static String makeGood(String s) {
        Stack<Character> myStack = new Stack();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!myStack.empty())
            {
                int a = charArray[i];
                int b = myStack.peek();
                if(a-b == 32 || a-b == -32){
                    myStack.pop();
                }
                else
                {
                    myStack.push(charArray[i]);
                }
            }
            else
            {
                myStack.push(charArray[i]);
            }

        }
        StringBuilder result = new StringBuilder();
        while (!myStack.empty())
        {
            result.append(myStack.pop());
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}

