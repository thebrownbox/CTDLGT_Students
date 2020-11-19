package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class NguyenDucChau_202 {
    public static boolean isHappy(int n) {
        int sum = 0;
        int result = 0;
        Set<Integer> mySet = new HashSet<>();
        while (mySet.contains(n) == false) {
            mySet.add(n);
            n = sum(n);
            if(n == 1){
                return true;
            }
        }

        return false;
    }

    public static int sum(int n){
        int sum = 0;
        while (n > 0){
            sum = sum + (int)Math.pow(n%10,2);
            n = n/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        int n = 1;
        System.out.println(isHappy(n));
    }
}
