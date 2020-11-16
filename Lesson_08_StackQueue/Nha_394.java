class Solution {
    Node headOfFinishStack;
    Node headOfCheckingStack;
    int lengthOfStack;
    int[] multipleTimes;
    int[] startPos;
    int[] endPos;
    int[] startSubString;
    // String[] partOfString;
        
    public class Node{
        int times, startPos, startSubString, end;
        Node next;
        
        Node(int times, int startPos, int startSubString){
            this.times = times;
            this.startPos = startPos;
            this.startSubString = startSubString;
        }
    }
    
    public void addCheckingStack(int times, int startPos, int startSubString){
        Node newNode = new Node(times, startPos, startSubString);
        newNode.next = headOfCheckingStack;
        headOfCheckingStack = newNode;
        
        lengthOfStack++;
    }
    
    public void addFinishStack(int value){
        headOfCheckingStack.end = value;
        Node nextHeadOfCheckingStack = headOfCheckingStack.next;
        headOfCheckingStack.next = headOfFinishStack;
        headOfFinishStack = headOfCheckingStack;
        headOfCheckingStack = nextHeadOfCheckingStack;
    }
    
    public void makeListPos(String s){
        startPos = new int[lengthOfStack];
        endPos = new int[lengthOfStack]; 
        startSubString = new int[lengthOfStack];
        multipleTimes = new int[lengthOfStack];
        
        int count = lengthOfStack-1;
        while(headOfFinishStack != null){
            startPos[count] = headOfFinishStack.startPos;
            endPos[count] = headOfFinishStack.end;
            startSubString[count] = headOfFinishStack.startSubString;
            multipleTimes[count] = headOfFinishStack.times;
            // String str = s.substring(headOfFinishStack.start+2, headOfFinishStack.end);
            // partOfString[count] = str;
            
            count--;
            headOfFinishStack = headOfFinishStack.next;
        }
        
        System.out.println(Arrays.toString(startPos));
        System.out.println(Arrays.toString(endPos));
        System.out.println(Arrays.toString(startSubString));
        System.out.println(Arrays.toString(multipleTimes));
        // System.out.println(Arrays.toString(partOfString));
    }
    
    public String makeNewString(String s, int count){
        String finalString = "";
        if (count < lengthOfStack){
            String head = s.substring(0, startPos[count]);
            String middle = s.substring(startPos[count], endPos[count]+1);
            String subStr = s.substring(startSubString[count], endPos[count]);
            String tail = s.substring(endPos[count]+1);
            String newMiddle = "";
            for (int i=0; i<multipleTimes[count]; i++){
                newMiddle += subStr;
            }
            
            int deltaLong = newMiddle.length() - middle.length();
            for (int i=count+1; i<lengthOfStack; i++){
                if (startPos[i] > startPos[count]){
                    startPos[i] += deltaLong;
                }  
                if (endPos[i] > startPos[count]){
                   endPos[i] += deltaLong; 
                }
                if (startSubString[i] > startPos[count]){
                    startSubString[i] += deltaLong;
                }
            }
            
            // System.out.println(head);
            // System.out.println(middle);
            // System.out.println(newMiddle);
            // System.out.println(tail);
            
            String newString = head.concat(newMiddle).concat(tail);
            
            System.out.println(newString);
            
            return makeNewString(newString, count+1);
        }
        else{
            return s;
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
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '['){
                int pos = i-1;
                while(checkNumber(s.charAt(pos))){
                    pos--;
                    if (pos < 0){
                        break;
                    }
                }
                pos++;
                int times = Integer.parseInt(""+s.substring(pos, i));
                int startPos = pos;
                int startSubString = i+1;
                addCheckingStack(times, startPos, startSubString);
            }
            if (s.charAt(i) == ']'){
                int value = i;
                addFinishStack(value);
            }
        }
        
        makeListPos(s);
        
        return makeNewString(s, 0);
    }
}