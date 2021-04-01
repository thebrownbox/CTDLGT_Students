public class _1221SplitaStringinBalancedStrings {

    public static int balancedStringSplit(String s) {
        int L_count = 0;
        int R_count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                R_count++;
            }else{
                L_count++;
            }

            if(L_count == R_count){
                // Chawt
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
