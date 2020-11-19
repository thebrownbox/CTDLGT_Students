class Solution {
    public String newString(String s, int head, int tail){
        if (head > tail){
            return s;
        }
        
        if (s.charAt(head) != ']'){
            return newString(s, head+1, tail);
        }
        
        int endStr = head, startSubstr = head;
        while(s.charAt(startSubstr) != '['){
            startSubstr--;
        }
        int startStr = startSubstr - 1;
        while(startStr >= 0){
            if (!checkNumber(s.charAt(startStr))){
                break;
            }
            startStr--;
        }
        startStr++;
        
        
        int times = Integer.parseInt(s.substring(startStr, startSubstr));
        String headStr = s.substring(0, startStr);
        String middleStr = s.substring(startStr, endStr+1);
        String tailStr = s.substring(endStr+1);
        String subStr = s.substring(startSubstr+1, endStr);
        String newMiddleStr = "";
        for (int i=0; i<times; i++){
            newMiddleStr += subStr;
        }
        

        
        int deltaLength = newMiddleStr.length() - middleStr.length();
        
        String newStr = headStr.concat(newMiddleStr).concat(tailStr);
        
        return newString(newStr, head+deltaLength, tail+deltaLength);
        // return new String();
        
        
    }

    public boolean checkNumber(char a){
        boolean check = true;
        try{
            int number = Integer.parseInt(""+a);
        }catch(Exception e){
            check = false;
        }
        return check;
    }
    
    public String decodeString(String s) {
        return newString(s, 0, s.length()-1);
    }
}