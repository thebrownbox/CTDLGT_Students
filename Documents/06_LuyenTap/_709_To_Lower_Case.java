public class _709_To_Lower_Case {
    public String toLowerCase(String str) {
        String result = "";
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if(c >= 'A' && c <= 'Z'){
                char t = (char)(c + ((int)'a' - (int)'A'));
                result += t;
            }else{
                result += c;
            }
        }

        return result;
    }
}
