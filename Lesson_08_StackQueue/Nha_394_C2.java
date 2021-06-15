class Solution {
    public String newString(String s, int head, int tail){
        if (head > tail){
            return s;
        }
        else{
            if (s.charAt(head) != ']'){
                return newString(s, head+1, tail);
            }
            else{
                int startSubstr, startStr;
                
                startSubstr = head-1;
                while(true){
                    if (s.charAt(startSubstr) == '['){
                        break;
                    }
                    startSubstr--;
                }
                startSubstr++;
                
                startStr = startSubstr-2;
                while(true){
                    if (startStr < 0){
                        break;
                    }
                    if (!checkNumber(s.charAt(startStr))){
                        break;
                    }
                    startStr--;
                }
                startStr++;
                
                // System.out.println("index: " + startStr + " " + startSubstr + " " + head);
                
                String headStr = s.substring(0, startStr);
                String middleStr = s.substring(startStr, head+1);
                String tailStr = s.substring(head+1);
                
                int times = Integer.parseInt(s.substring(startStr, startSubstr-1));
                String subStr = s.substring(startSubstr, head);
                
                // System.out.println("result:");
                // System.out.println(headStr);
                // System.out.println(middleStr);
                // System.out.println(tailStr);
                // System.out.println(times);
                // System.out.println(subStr);
                // System.out.println("end result");
                
                String newMiddleStr = new String();
                for (int i=0; i<times; i++){
                    newMiddleStr += subStr;
                }
                
                int deltaLong = newMiddleStr.length() - middleStr.length();
                
                return newString(headStr.concat(newMiddleStr).concat(tailStr), 
                                 head+1+deltaLong, tail+deltaLong);
                
            }
        }
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