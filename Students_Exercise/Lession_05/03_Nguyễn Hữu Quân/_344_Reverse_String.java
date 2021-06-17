import java.util.Arrays;

public class _344_Reverse_String {
    
    public static void reverseRecur(char[] s, int startIndex, int endIndex){
        if(startIndex < endIndex){
            char temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
            reverseRecur(s, startIndex+1, endIndex-1);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseRecur(s, 0, s.length-1);
        System.out.println(Arrays.toString(s));
    }
}
