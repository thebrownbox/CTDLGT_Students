package day02;

public class _1694_ReformatPhoneNumber {
    public static void main(String[] args) {
        String number = "1234";
        System.out.println(reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        int n = number.length();
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < n && !(number.charAt(i) >= '0' && number.charAt(i) <= '9')) {
            i++;
        }
        s.append(number.charAt(i));
        i++;
        int count = 3;
        for (int j = i; j < n; j++) {
            char c = number.charAt(j);
            if (c >= '0' && c <= '9') {
                if (s.length() % count == 0) {
                    s.append('-');
                    count += 4;
                }
                s.append(c);
            }
        }
        if (s.length() % count == 0 || s.length() < 3) {
            return s.toString();
        }
        String res = s.substring(0, s.length() - 3);
        String sub = s.substring(s.length() - 3, s.length()).replace("-", "");
        return res + "-" + sub;
    }
}
