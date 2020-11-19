package Leetcode_202;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int count = 0;
        while (count < 100) {
            int sum = 0;
            while (n != 0) {
                int c = n % 10;
                n = n / 10;
                System.out.println(c);
                sum += Math.pow(c, 2);
            }
            if (sum == 1) {
                break;
            }
            n = sum;
            count++;
        }
        if (count >= 100) {
            return false;
        }
        return true;
    }
}
