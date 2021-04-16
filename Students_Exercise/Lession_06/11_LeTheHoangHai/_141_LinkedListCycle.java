public class _141_LinkedListCycle {


    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null|| head.next == null) return false;
            
            ListNode run = head;
            int pos = 0;
            
            while (run.next != null ){
                run = run.next;
                pos++;
                
                ListNode run2 = head;
                for (int i =0; i < pos; i++ ){
                    if (run == run2) {
                        return true;
                    }
                    run2 = run2.next;
                }
                
            }
            return false;
        }
    }
}
