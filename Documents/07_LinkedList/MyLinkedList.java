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
        return newNode;
    }


    // tra ve head cua linked list
    public static Node addToLast(Node head, int val){
        //0. Tao new Node
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            // 1. Tim lastNode | chua xet head == null
            Node lastNode = head;
            while(true){
                if(lastNode.next == null){
                    break;
                }
                lastNode = lastNode.next;
            }

            // 2. Noi newNode vao lastNode
            lastNode.next = newNode;
        }

        return head;
    }


    // REturn head cua linkedList
    public static Node removeAtLast(Node head){
        //B1. Xac dinh lastNode va prevNode;
        Node lastNode = head;
        Node prevNode = null;

        if(head == null){ // 0 node
            return null;
        }
        if(head.next == null){ // 1 node
            head = null; // <= just added!
            head.data = 0;
            head = null;
            return null;
        }

        while(lastNode.next != null){ // Chay den khi lastNode tro den cuoi
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
       
        prevNode.next = null;

        return head;
    }

}
