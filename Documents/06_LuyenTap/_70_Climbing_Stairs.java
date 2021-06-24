public class _70_Climbing_Stairs {

    int[] count = new int[46];

    public int F(int n){
        if(count[n] != 0){
            return count[n];
        }else{
            count[n] = F(n-1) + F(n-2);
        }
        return count[n];
    }

    public int climbStairs(int n) {
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;

        F(n);

        return count[n];
    }
}
