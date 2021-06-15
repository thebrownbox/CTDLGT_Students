class Solution {
    public int maximumWealth(int[][] accounts) {
       int res = 0;
       for (int[] account : accounts){
          int property = 0;
          for(int i = 0; i <  account.length; i++){
            property += account[i];
          }
          res = Math.math(res, property);
       }
       return res;
    }
}








