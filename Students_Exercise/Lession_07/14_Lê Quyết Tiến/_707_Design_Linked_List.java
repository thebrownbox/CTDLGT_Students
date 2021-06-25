public class _707_Design_Linked_List {
    public static class MyLinkedList {

        public class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

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
            if (index >= 0 && index < length) {
                Node getNode = head;
                while (index != 0) {
                    getNode = getNode.next;
                    index--;
                }
                return getNode.val;
            } else {
                return -1;
            }
        }

        /**
         * Add a node of value val before the first element of the linked list. After
         * the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            length++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
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
            if (index > length || index < 0) {
                return;
            } else if (index == length) {
                addAtTail(val);
            } else if (index == 0) {
                addAtHead(val);
            } else {
                Node curNode = head;
                while (index != 1) {
                    curNode = curNode.next;
                    index--;
                }
                newNode.next = curNode.next;
                curNode.next = newNode;
                length++;
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            Node curNode = head;
            Node prevNode = null;
            if (index == 0) {
                head = head.next;
                length--;
            } else if (index > 0 && index < length) {
                while (index != 0) {
                    prevNode = curNode;
                    curNode = curNode.next;
                    index--;
                }
                prevNode.next = curNode.next;
                length--;
            } else {
                return;
            }
        }

        public void printLinkedList() {
            if (head == null) {
                System.out.println("list is empty!");
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.val + "->");
                    temp = temp.next;
                }
            }
        }
    }

    

    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(6);
        myLinkedList.addAtIndex(1, 3);
        myLinkedList.printLinkedList();
        System.out.println();
        System.out.println(myLinkedList.get(2));
        myLinkedList.deleteAtIndex(1);
        myLinkedList.printLinkedList();
    }
}
