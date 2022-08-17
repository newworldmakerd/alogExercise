package FastAndSlowPoint;

public class MideDwonPreNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next.next;
        if(head == null||head.next == null||head.next.next == null){
            return null;
        }
        while(fast.next != null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
