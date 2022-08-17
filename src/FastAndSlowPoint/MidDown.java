package FastAndSlowPoint;


//奇数返回中点，偶数返回下中点
public class MidDown {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head.next;
        ListNode fast = head.next;
        if(head == null||head.next == null){
            return head;
        }
        while(fast.next != null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
