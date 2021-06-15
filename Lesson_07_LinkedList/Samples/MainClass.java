public class MainClass {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList();
     
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtHead(3);
        myLinkedList.print();
        myLinkedList.removeAtTail();
        myLinkedList.print();
        myLinkedList.removeAtHead();
        myLinkedList.print();
        myLinkedList.removeAtHead();
        myLinkedList.print();
        myLinkedList.removeAtHead();
        myLinkedList.print();
    }
}
