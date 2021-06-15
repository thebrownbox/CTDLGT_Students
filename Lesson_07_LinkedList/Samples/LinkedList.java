public class LinkedList {
    private Node head;

    LinkedList(){
        head = null;
    }

    public void addAtHead(int data)
    {
        Node newNode = new Node(data, null);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeAtHead(){
        if(head == null){
            head = null;
        }else{
            head = head.next;
        }
    }

    public void removeAtTail(){
        if(head != null){// list is not empty
            Node prev = null;
            Node last = head;

            while(last != null){
                if(last.next == null)
                {
                    // xuly
                    if(prev == null){ // last la phan tu duy nhat
                        head = null; // TODO:
                    }else{
                        prev.next = null;
                    }
                    break;
                }
                prev = last;
                last = last.next;
            }

        }
    }

    public void addAtTail(int data){
        Node newNode = new Node(data, null);
        if(head == null){
            // Linked List rong
            head = newNode;
        }else{
            Node temp = head;
            while(temp != null){
                if(temp.next == null){
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
