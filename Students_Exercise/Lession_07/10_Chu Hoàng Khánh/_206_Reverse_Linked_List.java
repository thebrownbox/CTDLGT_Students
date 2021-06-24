public class _206_Reverse_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        reverseList(head);
    }

    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node secondNode = head.next;

        head.next = null;
        
        Node reverseRest = reverseList(secondNode);

        secondNode.next = head;
        return reverseRest;
    }
}
