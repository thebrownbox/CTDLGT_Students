package Final;

import java.util.Stack;

public class NguyenDucChau_844 {
    public static boolean backspaceCompare(String S, String T) {
        if (S.length() < 0 || T.length() < 0) {
            return false;
        }
        if (xuLy(S).equals(xuLy(T))) {
            return true;
        }

        return false;
    }

    public static String xuLy(String s) {
        String result = "";
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            if (cS != '#')
                myStack.push(cS);

            if (cS == '#' && myStack.isEmpty() == false)
                myStack.pop();

        }
        for (Character sI : myStack) {
            result += sI;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
//        System.out.println(xuLy(s));
    }

}
