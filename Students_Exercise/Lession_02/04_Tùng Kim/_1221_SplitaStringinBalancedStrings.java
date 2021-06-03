public class SplitaStringinBalancedStrings {
    public static void main(String[] args) {
        SplitaStringinBalancedStrings splitaStringinBalancedStrings = new SplitaStringinBalancedStrings();
        int result = splitaStringinBalancedStrings.balancedStringSplit("RLRRLLRLRL");
        System.out.println(result);
    }

    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int R = 0 , L = 0, count = 0;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i] == 'R')R++;
            if (chars[i] == 'L')L++;

            if (R == L){
                R = 0 ;
                L = 0 ;
                count++;
            }
        }
        return count ;
    }
}
