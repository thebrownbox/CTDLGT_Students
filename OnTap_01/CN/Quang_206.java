import java.util.ArrayList;

public class Quang_206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        System.out.println("The list node: ");

        print(reverseList(node1));
        print(reverseList2(node5));
    }

    public static void print(ListNode head){
        while(head!=null){
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.print("NULL\n");
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
    public static ListNode reverseList2(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}

class ListNode{
    int val;
    ListNode next;

    public ListNode(){}
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

