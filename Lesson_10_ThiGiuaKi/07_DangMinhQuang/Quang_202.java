package lesson10;

public class Quang_202 {
    public static void main(String[] args) {
        System.out.println("19 is happy number " + isHappy(19));
    }

    public static boolean isHappy(int n){
        int fast = n, slow = n;
        while(fast != 1){
            fast = sum(fast);
            fast = sum(fast);
            slow = sum(slow);
            if(fast == slow){
                return fast == 1;
            }
        }
        return true;
    }

    public static int sum(int n){
        int sum = 0;
        while(n>0){
            sum+= (n%10)*(n%10);
            n/=10;
        }
        return sum;
    }

}
