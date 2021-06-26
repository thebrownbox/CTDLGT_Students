public class _142_Linked_List_Cycle_II {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;

        detectCycle(head);
    }

    public static Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer) {
                while (head != null) {
                    if (head == fastPointer) {
                        return head;
                    }
                    head = head.next;
                    fastPointer = fastPointer.next;
                }
            }
        }

        return null;
    }
}
