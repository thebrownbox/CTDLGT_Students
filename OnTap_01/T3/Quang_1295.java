public class Quang_1295 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println("Numbers of even digits: " + findNumbers(arr));
    }

    public static int findNumbers(int[] nums){
        int ct = 0;
        for(var num:nums){
            int digits = 0;
            while(num>0){
                digits++;
                num=num/10;
            }
            if(digits%2==0)
                ct++;
        }
        return ct;
    }
}
