public class MyLinkedList {


    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("list is empty!");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    /***
     * Them node(val) vào linkedlist, và trả về head mới
     * @param head
     * @param val
     * @return
     */
    public static Node addAtHead(Node head, int val) {
        Node newNode = new Node (val);
        newNode.next = head;
        head = newNode;
        return newNode;
    }

}
