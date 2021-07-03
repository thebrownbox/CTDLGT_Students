public class _1672_RichestCustomerWealth {
    static class Solution {
        public static int maximumWealth(int[][] accounts) {
            int m = accounts.length;
            if(m==0) return 0;
            int n = accounts[0].length;
            int answer = 0;
            for(int i=0;i<m;i++){
                int res=0;
                for(int j=0;j<n;j++){
                    res+=accounts[i][j];
                }
                answer= Math.max(answer,res);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int accounts[][]={{1,2,3},{3,2,1}};
//        System.out.println(maximumWealth(accounts));
    }
}
