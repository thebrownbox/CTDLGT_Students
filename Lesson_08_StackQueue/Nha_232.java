class MyQueue {
    Node head;
    Node tail;
    
    public class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
    }

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Node newNode = new Node(x);
        if (empty()){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int value = head.value;
        if (head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
        }
        return value;
    }
    
    /** Get the front element. */
    public int peek() {
        return head.value;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (head == null && tail == null);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */