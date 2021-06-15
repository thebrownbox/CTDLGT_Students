class Solution {
    Node head;
    
    class Node{
        char value;
        Node next;
        
        Node(char value){
            this.value = value;
        }
    }
    
    public void addNode(char value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    
    public boolean checkHeadNode(char value){
        if (head == null){
            return false;
        }
        if ((head.value == '[' && value == ']')
            || (head.value == '{' && value == '}')
            || (head.value == '(' && value == ')')){
            head = head.next;
            return true;
        }
        return false;
    }
    
    public boolean isValid(String s) {
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                addNode(s.charAt(i));
            }
            else{
                if (checkHeadNode(s.charAt(i)) == false){
                    return false;
                }
            }
        }
        if (head != null){
            return false;
        }
        return true;
    }
}