import java.util.Stack;

public class Vinh_844 {
    public boolean backspaceCompare(String S, String T) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!s1.isEmpty()) s1.pop();
            } else {
                s1.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (!s2.isEmpty()) s2.pop();
            } else {
                s2.push(T.charAt(i));
            }
        }
        String s = "";
        String t = "";
        while (!s1.isEmpty()) {
            s += s1.peek();
            s1.pop();
        }
        while (!s2.isEmpty()) {
            t += s2.peek();
            s2.pop();
        }
        if (s.equals(t)) return  true;
        return false;
    }
}
