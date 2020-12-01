package FinalTest;

public class Quang_844 {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "c";
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String S, String T) {
        return  backspace(S).equals(backspace(T));

    }

    public static String backspace(String input){
        StringBuffer output_sb = new StringBuffer();
        int backCount = 0;
        for (int i = input.length()-1; i >=0 ; i--) {
            char s = input.charAt(i);
            if(s=='#'){
                backCount++;
            } else {
                if(backCount>0)
                    backCount--;
                else
                    output_sb.append(s);
            }
        }
        String output = output_sb.reverse().toString();
        return output;
    }
}
