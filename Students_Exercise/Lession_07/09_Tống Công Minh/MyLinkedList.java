package lab5_linked_list;

public class MyLinkedList {

    public class MyNode {
        int val;
        MyNode next;

        public MyNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /** Initialize your data structure here. */
    MyNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
    }

    public MyNode goToNode(int index) {
        if (head == null) {
            return null;
        } else {
            int i = 0;
            MyNode temp = head;
            while (temp.next != null) {
                i++;
                temp = temp.next;
                if (i == index) {
                    return temp;
                }
            }
            return temp;
        }
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (head == null) {
            return -1;
        } else {
            if (index == 0) {
                return head.val;
            } else {
                int i = 0;
                MyNode temp = head;
                while (temp.next != null) {
                    i++;
                    temp = temp.next;
                    if (i == index) {
                        return temp.val;
                    }
                }
                return -1;
            }
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new MyNode(val);
        } else {
            MyNode newNode = new MyNode(val);
            newNode.next = head;
            head = newNode;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            head = new MyNode(val);
        } else {
            MyNode tail = goToNode(1000);
            MyNode newNode = new MyNode(val);
            tail.next = newNode;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int val) {
        if (head == null) {
            head = new MyNode(val);
        } else {
            if (index == 0) {
                addAtHead(val);
            } else {
                int i = 0;
                MyNode pre = head;
                MyNode cur = head;
                while (cur.next != null) {
                    pre = cur;
                    cur = cur.next;
                    i++;
                    if (i == index) {
                        MyNode newNode = new MyNode(val);
                        newNode.next = cur;
                        pre.next = newNode;
                        break;
                    }
                }

                if (i + 1 == index) {
                    addAtTail(val);
                }
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("Invalid");
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                int i = 0;
                MyNode pre = head;
                MyNode cur = head;
                while (cur.next != null) {
                    i++;
                    pre = cur;
                    cur = cur.next;
                    if (i == index) {
                        if (cur.next == null) {
                            pre.next = null;
                        } else {
                            pre.next = cur.next;
                            cur.next = null;
                        }
                        break;
                    }
                }
            }
        }
    }

    public void printList() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        } else {
            MyNode curNode = head;
            while (curNode != null) {
                if (curNode.next == null) {
                    System.out.print(curNode.val + "\n");
                } else {
                    System.out.print(curNode.val + " -> ");
                }
                curNode = curNode.next;
            }
        }
    }

}
