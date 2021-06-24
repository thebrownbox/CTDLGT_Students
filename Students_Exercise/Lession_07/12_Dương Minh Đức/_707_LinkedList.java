public class _707_LinkedList {
        class MyLinkedList {
        int length;
        Node head;

        class Node {
            Node next;
            int val;
            public Node(int val) {
                this.val = val;
            }
        }
        /**
         * Initialize your data structure here.
         */
        public MyLinkedList() {
            length = 0;
            head = new Node(0);

        }
        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         */
        public int get(int index) {
            if (index < 0 || index >= length) {
                return -1;
            }
            Node cur = head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            return cur.val;
        }
        /**
         * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            if (length == 0) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            length++;

        }
        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int val) {
            Node newNode = new Node(val);
            if (length == 0) {
                head = newNode;
            } else {
                Node cur = head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = newNode;
            }
            length++;
        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
         */
        public void addAtIndex(int index, int val) {
            if (index > length) {
                return;
            }
            if (index == length) {
                addAtTail(val);
            } else {
                if (index <= 0) {
                    addAtHead(val);
                } else {
                    Node cur = head;
                    int i = index - 1;
                    while (i > 0) {
                        cur = cur.next;
                        i--;
                    }
                    Node newNode = new Node(val);
                    newNode.next = cur.next;
                    cur.next = newNode;
                    length++;
                }
            }

        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {
            if (index >= length) {
                return;
            }
            if (index <= 0) {
                head = head.next;
            } else {
                Node curr = head;
                Node pre = null;
                int count = 0;
                boolean check = false;
                while (curr.next != null) {
                    if (count == index) {
                        check = true;
                        break;
                    }
                    pre = curr;
                    curr = curr.next;
                    count++;
                }
                if (check == true) {
                    if (pre == null) {
                        return;
                    } else {
                        if (curr != null) {
                            pre.next = curr.next;
                            length--;
                        }
                    }
                }
            }

        }
    }
}





