
public class _707_Design_Linked_List {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        // linkedList.addAtHead(1);
        // linkedList.addAtTail(3);
        // linkedList.addAtHead(0);
        linkedList.addAtIndex(0, 10);
        linkedList.addAtIndex(0, 20);
        linkedList.addAtIndex(0, 30);
        linkedList.addAtTail(40);
        
        // linkedList.get(1);
        linkedList.deleteAtIndex(2);
        linkedList.get(0);

        // linkedList.printList(head);

        // int param_1 = linkedList.get(index);
        // linkedList.addAtHead(val);
        // linkedList.addAtTail(val);
        // linkedList.addAtIndex(index,val);
        // linkedList.deleteAtIndex(index);
    }
    
    
}
