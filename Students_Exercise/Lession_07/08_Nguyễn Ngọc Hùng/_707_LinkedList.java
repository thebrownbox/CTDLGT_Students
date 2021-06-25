public class _707_LinkedList {
    public static class LinkedList {
        int val;
        LinkedList next;

        public LinkedList(int x) {
            val = x;
        }
    }

    static class MyLinkedList {
        private LinkedList head;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = null;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is
         * invalid, return -1.
         */
        public int get(int index) {
            LinkedList temp = head;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    return temp.val;
                }
                count++;
                return temp.val;
            }
            return -1;
        }

        /**
         * Add a node of value val before the first element of the linked list. After
         * the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            LinkedList temp = new LinkedList(val);
            temp.next = head;
            head = temp;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            LinkedList temp = head;
            while (temp != null) {
                if (temp.next == null) {
                    LinkedList newNode = new LinkedList(val);
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }

        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index
         * equals to the length of linked list, the node will be appended to the end of
         * linked list. If index is greater than the length, the node will not be
         * inserted.
         */
        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            } else {
                LinkedList temp = head;
                int count = 0;
                while (temp != null) {
                    if (count == index - 1) {
                        LinkedList newNode = new LinkedList(val);
                        newNode.next = temp.next;
                        temp.next = newNode;
                        return;
                    }
                    count++;
                    temp = temp.next;
                }
                if (count == index) {
                    addAtTail(val);
                }
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            LinkedList temp = head;
            LinkedList prev = null;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    if (index == 0) {
                        head = head.next;
                    } else {
                        prev.next = temp.next;
                        return;
                    }

                }
                count++;
                prev = temp;
                temp = temp.next;
            }
        }

        public void showLinkList() {
            LinkedList temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
     * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.showLinkList();
        myLinkedList.addAtTail(3);
        myLinkedList.showLinkList();
        myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
        myLinkedList.showLinkList();
        myLinkedList.get(1); // return 2
        myLinkedList.showLinkList();
        myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
        myLinkedList.showLinkList();
        myLinkedList.get(1); // return 3
    }
}
