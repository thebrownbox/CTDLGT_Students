package binary_search;

public class _709_To_Lower_Case {

    public static String toLowerCase(String s) {

        String result = "";
        int distance = 'a' - 'A';
        for (int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i);
            // Nen su dung ky tu
            if (index <= 'Z' && index >= 'A') {
                result += (char) (index + distance);
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
