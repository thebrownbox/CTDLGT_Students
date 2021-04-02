class _1694ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = number.replaceAll("[- ]", "");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < number.length() - 4) {
            sb.append(number.substring(i, i + 3)).append("-");
            i += 3;
        }
        if (number.length() - i == 4) {
            sb.append(number.substring(i, i + 2)).append("-");
            i += 2;
        }
        sb.append(number.substring(i));
        System.out.println(sb);

        return sb.toString();

    }
    public static void main(String[] args) {
        String number = "123 4-567 8 9";
        reformatNumber(number);
    }
}