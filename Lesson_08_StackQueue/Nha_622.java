class MyCircularQueue {

    Node head;
    Node tail;
    int size;
    int numberElement;
    
    public class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
    }
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (!isFull()){
            Node newNode = new Node(value);
            if (isEmpty()){
                head = tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            numberElement++;
            
            return true;
        }
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (!isEmpty()){
            head = head.next;
            if (numberElement == 1){
                tail = null;
            }
            numberElement--;
            
            return true;
        }
        return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (!isEmpty()){
            return head.value;
        }
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (!isEmpty()){
            return tail.value;
        }
        return -1;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (numberElement == 0);
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (numberElement == size);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */