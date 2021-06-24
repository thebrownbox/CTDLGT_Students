
public class _707_Design_Linked_List {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    static class MyLinkedList {
        public Node head;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = null;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is
         * invalid, return -1.
         */
        public int get(int index) {

            Node temp = head;
            int count = 0;
            while (temp != null) {              
                if (count == index) {
                    // System.out.println(temp.value);
                    return temp.value;
                }
                count++;
                temp = temp.next;
            }
            return -1;

            // int count = 0;
            // Node temp = head;
            // while(temp.next != null && count != index){
            // count++;
            // temp = temp.next;
            // }
            // return temp.value;
        }

        /**
         * Add a node of value val before the first element of the linked list. After
         * the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;

        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node lastNode = new Node(val);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = lastNode;

        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index
         * equals to the length of linked list, the node will be appended to the end of
         * linked list. If index is greater than the length, the node will not be
         * inserted.
         */
        public void addAtIndex(int index, int val) {
            Node newNode = new Node(val);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node temp = head;
                int count = 1;
                while (count != index && temp != null) {
                    temp = temp.next;
                    count++;
                }
                newNode.next = temp.next;
                temp.next = newNode;

            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index == 0) {
                head = head.next;
            } else {
                int count = 1;
                Node temp = head;
                while (temp.next.next != null && count != index) {
                    temp = temp.next;
                    count++;
                }
                temp.next = temp.next.next;
            }
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.printf("%d ", temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.printList();
        obj.addAtTail(3);
        obj.printList();
        // obj.addAtIndex(1, 2);
        // obj.printList();
        // obj.get(1);
        // obj.printList();
        obj.deleteAtIndex(1);
        obj.printList();
        obj.get(2);
        obj.printList();

    }

    // Explanation
    // MyLinkedList myLinkedList = new MyLinkedList();
    // myLinkedList.addAtHead(1); //return 1
    // myLinkedList.addAtTail(3); //list becomes 1->3
    // myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
    // myLinkedList.get(1); // return 2
    // myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
    // myLinkedList.get(1); // return 3

}