import java.util.Stack;

/**
 * Test
 */
class Solution 
{
    public String decodeString(String s) 
    {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) 
        {
            char c = s.charAt(i);

            if(c == ']')
            {
                //Main Xuly

                // Pop until meet '['
                String loopString = "";
                while (stack.peek() != '['){
                    loopString = stack.pop() + loopString;
                }

                // Remove '['
                stack.pop();

                // Get number
                String numberString = "";
                while (stack.isEmpty() == false && Character.isDigit(stack.peek())){
                    numberString = stack.pop() + numberString;
                }
                int nLoop = Integer.parseInt(numberString);

                // Repeat the string
                loopString = loopString.repeat(nLoop);

                // Add the result back to the stack
                for (int j = 0; j < loopString.length(); j++) {
                    stack.push(loopString.charAt(j));
                }
            }
            else
            {
                stack.push(c);
            }
        }

        String result = "";
        while (stack.isEmpty() == false)
        {
            result = stack.pop() + result;
        }

        return result;
    }
}