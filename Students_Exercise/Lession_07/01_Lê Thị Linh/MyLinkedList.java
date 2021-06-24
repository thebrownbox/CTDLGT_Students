/**
 * MyLinkedList
 */
public class MyLinkedList {

    static int size;

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static int get(Node headNode, int index) {

        Node temp = headNode;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.value;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);

        if (headNode != null) {
            newNode.next = headNode;
        }

        return newNode;

    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            // tim lastNode
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {

        if (index == 0) {
            return addToHead(headNode, value);

        } else {
            // tim vi tri can them
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode.next != null) {
                count++;
                if (count == index) {
                    // thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {

        if (headNode == null) {
            return null;
        }
        if (headNode.next == null) {
            return null;
        }
        // Xac dinh last va previous
        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if (prevNode == null) {

            return null;
        } else {
            prevNode.next = lastNode.next;

        }
        return headNode;

    }

    public static Node removeAtIndex(Node headNode, int index) {

        if (index == 0) {
            return removeAtHead(headNode);
        } else {
            int count = 1;
            Node temp = headNode;
            while (temp.next.next != null && count != index) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
        return headNode;
    }

    public static void print(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }

            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        print(n1);

        System.out.println(get(n1, 0));

        n1 = addToHead(n1, 0);
        print(n1);

        n1 = addToTail(n1, 4);
        print(n1);

        n1 = addToIndex(n1, 5, 4);
        print(n1);

        n1 = removeAtHead(n1);
        print(n1);

        n1 = removeAtTail(n1);
        print(n1);

        n1 = removeAtIndex(n1, 2);
        print(n1);

    }
}