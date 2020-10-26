package com.techmaster;

public class fibonacinum {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int N) {
        if(N==0){
            return 0;
        }
        if(N<=2){
            return 1;
        }
        else{
            return fib(N-1)+fib(N-2);
        }
    }
}
