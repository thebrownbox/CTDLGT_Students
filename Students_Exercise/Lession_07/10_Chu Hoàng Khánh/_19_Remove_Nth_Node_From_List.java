public class _19_Remove_Nth_Node_From_List {
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

        // removeNthFromEnd(head, 2);
    }
    
    // public static Node removeNthFromEnd(Node head, int n) {
    //     Node temp = head;
    //     Node current = head;
    //     int count = 0;
    //     int count1 = 0;
    //     while (true) {
    //         if (temp != null) {
    //             temp = temp.next;
    //             count++;
    //         }
    //         int Nth = count - n + 1;
    //         while () {
    //             current = current.next;
    //             if (count == count1) {
    //                 // current.next = 
    //             }
    //         }
    //     }
    //     return head;
    // }
}
