public class _206_Reverse_Linked_List {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;

        }
        return prev;
    }
    public static void print(ListNode head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }

            }
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    
        reverseList(head);
        print(n4);
    }
}
