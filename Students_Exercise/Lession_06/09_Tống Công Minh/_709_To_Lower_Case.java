package binary_search;

public class _709_To_Lower_Case {

    public static String toLowerCase(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i);
            if (index <= 90 && index >= 65) {
                result += (char) (index + 32);
            } else {
                result += s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
}
