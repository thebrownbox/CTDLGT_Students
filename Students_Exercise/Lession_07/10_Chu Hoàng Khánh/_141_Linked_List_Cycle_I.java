public class _141_Linked_List_Cycle_I {
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

        System.out.println(hasCycle(head));
    }
    
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

  
    // public static Node size(Node head) {
    //     Node[] nodes = new Node[50];
    //     Node temp = null;
    //     Node current = head;
    //     int i = 0;
    //     while (true) {
    //         temp = current.next;
    //         current.next = null;
    //         nodes[i++] = current;
    //         current = temp;
    //         if (temp.next == null) {
    //             for (int j = 0; j < nodes.length; j++) {
    //                 if (nodes[j] == temp.next) {
    //                     temp.next.next = nodes[j + 1];
    //                 }
    //             }
    //             return temp;
    //         }
    //     }

    // }

}
