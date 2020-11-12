class MyLinkedList {
    
    public class Node {
        public int data;
        public Node next;
        
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            if(count == index){
                return temp.data;
            }
            count++;
            temp = temp.next;
        }

        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val, null);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }  
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val, null);
        if(head == null){
            // Linked List rong
            head = newNode;
        }else{
            Node temp = head;
            while(temp != null){
                if(temp.next == null){
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val, null);
        if(head == null){
            head = newNode;
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        index--;
        Node curNode = head;
        int count = 0;
        while(curNode != null)
        {
            if(count == index){
                Node nextNode = curNode.next;
                curNode.next = newNode;
                newNode.next = nextNode;
            }
            count++;
        }

    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(head)
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */