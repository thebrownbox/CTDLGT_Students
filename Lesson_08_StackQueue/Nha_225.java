class MyStack {
    Node head;
    
    public class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
    }

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int value = head.value;
        head = head.next;
        return value;
    }
    
    /** Get the top element. */
    public int top() {
        return head.value;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (head == null);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */