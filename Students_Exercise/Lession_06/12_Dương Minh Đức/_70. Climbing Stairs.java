int[]  result = new int[46];
    public int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        int t = 0;
        if(result[n]==0)
        {
            t = climbStairs(n-1)+climbStairs(n-2);
            result[n] = t;
        }
        else
        {
            t = result[n];
        }
        return  t;
    }