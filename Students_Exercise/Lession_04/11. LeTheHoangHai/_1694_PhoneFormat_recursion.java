public class _1694_PhoneFormat_recursion {
    public static String reformatNumber(String number) {
        // 123
        StringBuilder result = new StringBuilder();
        number = number.replace(" ", "");
        number = number.replace("-", "");

        if (number.length() == 4) {
            result.append(number.substring(0, 2) + '-' + number.substring(2));
        } else if (number.length() == 2 || number.length() == 3) {
            result.append(number);
        } else {
            result.append(number.substring(0, 3) + "-" + reformatNumber(number.substring(3)));
        }
        return result.toString();
    }
}
