package CTDLGT_Students.Students_Exercise.Lession_06.04_TruongBaThuong;

public class 21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1 == null)
    return l2;

else if(l2 == null)
    return l1;

else if(l1.val < l2.val) {
    l1.next = mergeTwoLists(l1.next, l2);
    return l1;
}

else {
    l2.next = mergeTwoLists(l1, l2.next);
    return l2;
}
}   
}
