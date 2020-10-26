package com.techmaster;

public class Main {

    public static void main(String[] args) {
        char[] c={'h','e','l','l','o'};
	// write your code here
        reverseString(c);
        System.out.println(c);
    }

    public static void swap(char[] s,int i,int j){
        if(i<j){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            swap(s,i+1,j-1);
        }
    }

    public static void reverseString(char[] s) {
        swap(s,0,s.length-1);
    }


}
