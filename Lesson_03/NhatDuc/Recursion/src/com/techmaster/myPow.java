package com.techmaster;

public class myPow {
    public static double myPow(double x, int n) {
        if(n>=0){
            if(n==0){
                return 1;
            }else if(n==1){
                return x;
            }else{
                return x*myPow(x,n-1);
            }
        }else{
            return 1 / myPow(x,-n);
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.001, -10));
    }
}
