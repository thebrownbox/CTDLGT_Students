
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

        head = MyLinkedList.addAtHead(head, 0);
        head = MyLinkedList.addToLast(head, 7);
        // 0->1->2->3->7->x
        MyLinkedList.removeAtLast(head);    //0->1->2->3
        MyLinkedList.removeAtLast(head);    //0->1->2
        MyLinkedList.removeAtLast(head);    //0->1->
        MyLinkedList.removeAtLast(head);    //0-

        //------ list: 
        MyLinkedList.removeAtLast(head);    //
        // List is empty: Hung, Tin | Lam
        // '0': , Minh, Khanh
        MyLinkedList.printLinkedList(head);
    }
}