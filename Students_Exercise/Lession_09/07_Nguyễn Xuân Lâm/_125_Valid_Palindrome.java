public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String newString = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                newString += c;
            }
        }
        newString = newString.toLowerCase();
        int iLeft = 0;
        int iRight = newString.length()-1;
        while(iLeft<=iRight){
            if(newString.charAt(iLeft)!=newString.charAt(iRight)){
                return false;
            }
            iLeft++;
            iRight--;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
