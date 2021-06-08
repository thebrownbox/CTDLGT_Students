class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]  = s.split(" ");
        String str= "";
        for(int i = 0; i < k; i++){
            str = str + arr[i] + " ";
        }
        str = str.trim();
        return str;
    }
}