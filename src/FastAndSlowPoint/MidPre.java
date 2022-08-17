package FastAndSlowPoint;


//
public class MidPre {
    public ListNode deleteMiddlePre(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        if(head == null||head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        while(fast.next != null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
