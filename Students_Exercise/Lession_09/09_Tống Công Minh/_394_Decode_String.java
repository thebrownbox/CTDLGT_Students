
import java.util.*;

public class _394_Decode_String {

    public static String decodeString(String s) {
        return decodeBracket(s);
    }

    public static String decodeBracket(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> charList = new ArrayList<>();
        char[] tmp = s.toCharArray();
        int mul = 0;
        for (int i = 0; i < tmp.length; i++) {
            char c = tmp[i];
            if (c == ']') {
                while (stack.peek() != '[') {
                    charList.add(stack.pop());
                }
                stack.pop();
                String mulString = getMul(stack);
                mul = Integer.valueOf(mulString);
                Collections.reverse(charList);
                List<Character> tmpChar = multipleChar(charList, mul);
                for (char c1 : tmpChar) {
                    stack.push(c1);
                }
                charList.clear();
                tmpChar.clear();
            } else {
                stack.add(c);
            }
        }

        List<Character> newCharList = new ArrayList<>();
        while (!stack.isEmpty()) {
            newCharList.add(stack.pop());
        }

        Collections.reverse(newCharList);

        String result = "";
        for (Character c : newCharList) {
            result+=c;
        }

        System.out.println("DONE");

        return result;
    }

    public static List<Character> multipleChar (List<Character> list, int mul) {
        List<Character> tmpChars = new ArrayList<>();

        for (int i = 0; i < mul; i++) {
            for (Character c : list) {
                tmpChars.add(c);
            }
        }

//        System.out.println("DONE");
        return tmpChars;
    }

    public static String getMul(Stack<Character> stack) {
        List<Character> chaList = new ArrayList<>();
        while (!stack.isEmpty()) {
            if (stack.peek() >= '0' && stack.peek() <= '9') {
                chaList.add(stack.pop());
            } else {
                break;
            }
        }
        Collections.reverse(chaList);
        String result = "";
        for (Character c : chaList) {
            result+=c;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        decodeBracket(s);
//        List<Character> list = Arrays.asList('a','b','c');
//        multipleChar(list, 3);

    }
}
