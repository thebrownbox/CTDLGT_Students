public class Leetcode_202 {
    public static boolean isHappy(int n) {
        int i = 0;
        while (n != 1){
            int temp = 0;
            while (n > 0) {
                int x = n % 10;
                n = n / 10;
                temp += x * x;
            }
            n = temp;
            i++;
            if (i > 1000) {
                return false;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(496));
    }
}
