
public class MyLinkedList {

    Node head;
    int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        length = 0;
    }
    
    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (index < 0) {
            return -1;
        }else{
            Node current = head;
            int count = 0;
            while (current != null) {
                if (count == index) {
                    return current.val;
                }
                count++;
                current = current.next;
            }
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        length++;
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtHead(int val, Node newNode) {
        length++;
        newNode.next = head;
        head = newNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (true) {
                if (current.next == null) {
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        length++;
    }
    
    public void addAtTail(int val, Node newNode) {
        if (head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (true) {
                if (current.next == null) {
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        length++;
    }

    /**
         * Add a node of value val before the index-th node in the linked list. If index
         * equals to the length of linked list, the node will be appended to the end of
         * linked list. If index is greater than the length, the node will not be
         * inserted.
     */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (index > length) {
            return;
        } else if (index == length) {
            addAtTail(val, newNode);
        } else if(index == 0){
            addAtHead(val, newNode);
        }else {
            Node current = head;
            int count = 0;
            while (true) {
                if (count == index - 1) {
                    Node temp = current.next;
                    current.next = newNode;
                    newNode.next = temp;
                    break;
                }
                count++;
                current = current.next;
            }
            length++;
        }
    }
    
    public void deleteAtTail() {

    }
    
    public void deleteAtHead() {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node temp = head;
        if (index < 0) {
            return;
        } else if(index == 0){
            head = temp.next;
            length--;
            return;
        }else {
                //Tìm node đứng trước node sẽ bị xóa
                for (int i = 0; temp != null && i < index - 1; i++) {
                    temp = temp.next;
                }

                if (temp == null || temp.next == null){
                    return;
                }
            
                Node next = temp.next.next;
                temp.next = next;

        }
    }
    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
