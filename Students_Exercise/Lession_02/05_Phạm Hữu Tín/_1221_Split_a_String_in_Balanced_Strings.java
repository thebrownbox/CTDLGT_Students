public class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int balancecount = 0 ;
        int count = 0;
     for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
   if(current == 'L'){
       count++;
   } else if( current =='R'){
       count--;
   }        
   if(count == 0){
       balancecount++;
   }
     }
   return balancecount;
     }
    
    public static void main(String[] args) {
        
    }
    
}
