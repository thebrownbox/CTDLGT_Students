public class _70_Climbing_Stairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    static int[] arr = new int[46];
    
    
    public static int climbStairs(int n) {
        if(n==0){
            return 1;
        }else if(n < 0){
            return 0;
        }else if(arr[n] > 0){
            return arr[n];
        }else{
            arr[n] = climbStairs(n-1) + climbStairs(n-2);
            return arr[n];
        }
    }
}
