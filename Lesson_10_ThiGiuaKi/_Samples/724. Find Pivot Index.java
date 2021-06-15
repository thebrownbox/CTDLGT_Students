class Solution {
    public int pivotIndex(int[] a) {
        int n = a.length;
        if(n == 0)
            return -1;

        int[] leftSum = new int[n+2];

        for (int k = 1; k <= n; k++)
        {
            int i = k-1;
            leftSum[k] = leftSum[k-1] + a[i];
        }
        leftSum[n+1] = leftSum[n];

        for (int k = 1; k <= n; k++)
        {
            int rightSumKp1 = leftSum[n+1] - leftSum[k];
            if(leftSum[k-1] == rightSumKp1)
                return k-1;
        }

        return -1;
    }
}