public class _160_Intersection_Of_Two_Linked_Lists {
    public static void main(String[] args) {
        Node headA = new Node(4);
        Node node1A = new Node(1);

        Node headB = new Node(5);
        Node node1B = new Node(6);
        Node node2B = new Node(1);
       

        Node node1C = new Node(8);
        Node node2C = new Node(4);
        Node node3C = new Node(5);

        headA.next = node1A;
        node1A.next = node1C;

        headB.next = node1B;
        node1B.next = node2B;
        node2B.next = node1C;

        node1C.next = node2C;
        node2C.next = node3C;

        getIntersectionNode(headA, headB);
    }
    
    public static Node getIntersectionNode(Node headA, Node headB) {
        // if (headA == null || headB == null || headA.next == null || headB.next == null) {
        //     return null;
        // }

            
        Node tempA = headA;
        Node tempB = headB;

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;

            
            if (headA == null && headB == null) {
                break;
            } else if (headA == null) {
                headA = tempB;
            } else if (headB == null) { 
                headB = tempA;
            }
        }

        return null;
    }
}
