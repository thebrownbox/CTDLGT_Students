package finalexam;

public class Duy_LeetCode_844 {
    private String getString(String st) {
        StringBuilder s = new StringBuilder();
        for (char c : st.toCharArray()) {
            if (c == '#') {
                int endIndex = Math.max((s.length() - 1), 0);
                s = new StringBuilder(s.substring(0, endIndex));
            } else {
                s.append(c);
            }
        }
        return s.toString();
    }

    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        Duy_LeetCode_844 sd = new Duy_LeetCode_844();
        System.out.println(sd.backspaceCompare(S, T));
    }
}
