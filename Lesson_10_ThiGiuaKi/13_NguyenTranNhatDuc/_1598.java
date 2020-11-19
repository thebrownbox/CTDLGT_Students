package com.techmaster;

import java.text.ParseException;
import java.util.Stack;

public class _1598 {
    public static int minOperations(String[] logs) {
        String str="";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(stack.size()!=0){
                    stack.pop();}
            }else if(logs[i].equals("./")){

            }else {
                for (int z=0;z<logs[i].length();z++){
                    if(checkifNum(logs[i].charAt(z))){
                        str=logs[i].substring(0,z+1);
                        break;
                    }
                }
                if(stack.size()!=0){
                    if(stack.peek()!=str){
                        stack.push(str);}
                }else{
                    stack.push(str);
                }
            }
        }
        return stack.size();
    }

    public static boolean checkifNum(char s){
        try {
            int num=Integer.parseInt(String.valueOf(s));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
