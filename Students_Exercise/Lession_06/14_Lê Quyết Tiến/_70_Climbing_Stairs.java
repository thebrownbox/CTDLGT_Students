public class _70_Climbing_Stairs {

    static int[] step = new int[46];

    public static int climb(int n) {
        if (step[n] != 0) {
            return step[n];
        }
        step[n] = climb(n - 1) + climb(n - 2);
        return step[n];
    }
    
    public static int climbStairs(int n) {
        int result = 0;
        step[1] = 1;
        step[2] = 2;
        if (n < 1 || n > 45) {
            result = 0;
        } else {
            result = climb(n);
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(climbStairs(7));
    }
}
