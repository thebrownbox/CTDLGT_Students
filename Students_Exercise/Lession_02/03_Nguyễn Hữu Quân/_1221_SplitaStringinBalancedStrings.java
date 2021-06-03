public class _1221_SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        int countL = 0;
        int countR = 0;
        int countSub = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='R'){
                countR++;
            }else{
                countL++;
            }
            if(countR==countL){
                countSub++;
            }
        }
        return countSub;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
