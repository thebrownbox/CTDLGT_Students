class _1694ReformatPhoneNumberRecursion {
    public static String reformatNumber(String number) {
        StringBuilder str = new StringBuilder();
        number = number.replaceAll("[- ]", "");

        if (str.length() == 4) {
            return str;
        }else if(str.length()){

        }

        return str;
        
    }
    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));

    }
}