public class MyLinkedList {

    private static class Node{
        int val;
        Node next;
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    
    Node head;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    private Node move(Node head, int index){
        Node curr = head;
        int countNode = 0;
        while(countNode < index){
            curr = curr.next;
            countNode++;
        }
        return curr;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }else{
            Node curr = move(head, index);
            return curr.val;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val, null);
        if(size == 0){
            head = newNode;
            size++;
        }else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val, null);
        if(size == 0){
            head = newNode;
            size++;
        }else{
            Node tail = move(head, size - 1);
            tail.next = newNode;
            size++;
        }
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == size){
            addAtTail(val);
        }else if(index >= 0 && index <= size - 1){
            Node newNode = new Node(val, null);
            Node curr = move(head, index);
            Node prev = null;
            if(size > 1){
                prev = move(head, index - 1);
            }
            if(prev == null){
                addAtHead(val);
            }else{
                newNode.next = curr;
                prev.next = newNode;
                size++;
            }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >=0 && index <= size - 1){
            if(index == 0){
                head = head.next;
                size--;
            }else{
                Node curr = move(head, index - 1);
                curr.next = curr.next.next;
                size--;
            }
        }
    }
}
