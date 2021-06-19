
/**
 * Sample
 */
public class Sample {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        
        head.next = n2;
        n2.next = n3;

        MyLinkedList.addAtHead(head, 0);

        MyLinkedList.printLinkedList(head);
    }
}