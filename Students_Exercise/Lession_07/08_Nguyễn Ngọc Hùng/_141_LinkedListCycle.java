public class _141_LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next != null) {
                fast = fast.next.next;

                if (fast == null) {
                    return false;
                }

                slow = slow.next;

                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }

        public void printLinkedList(ListNode head) {
            if (head == null) {
                System.out.println("List is empty!");
            } else {
                ListNode temp = head;
                while (temp != null) {
                    System.out.print(temp.val);
                    temp = temp.next;
                    if (temp != null) {
                        System.out.print("-->");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        listNode.next = n2;
        n2.next = n3;
        n3.next = n4;
        listNode.printLinkedList(listNode);
        System.out.println(listNode.hasCycle(listNode));
        System.out.println(listNode.hasCycle(n3));
        System.out.println(listNode.hasCycle(n4));
    }
}
