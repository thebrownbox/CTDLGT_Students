package com.techmaster;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(longestPalindrome("babac"));
    }

    public static String longestPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        String reverse = stringBuffer.reverse().toString();
        String compare = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int z=i;
            for (int j=0;j<reverse.length();j++){
                if(z<reverse.length()) {
                    if(s.charAt(z)==reverse.charAt(j)){
                        compare+=s.charAt(z);
                    }else{
                        compare="";
                        z=i;
                        if (s.charAt(z) == reverse.charAt(j)) {
                            compare += s.charAt(z);
                        }
                    }
                    z++;
                }
                if(result.length()<compare.length()){
                    result=compare;
                }
            }
            compare="";
        }
        StringBuffer stringBuffers = new StringBuffer(result);
        if(!result.equals(stringBuffers.reverse().toString())){
            result=longestPalindrome(result);}
        return result;
    }
}
