class Solution {
    int[] stepArr = new int[50];
    
    public int climbStairs(int n) {
        if (n <= 2){
            return n;
        }
        if (stepArr[n] != 0){
            return stepArr[n];
        }
        
        stepArr[n] = climbStairs(n-1) + climbStairs(n-2); 
        return stepArr[n];
    }
}