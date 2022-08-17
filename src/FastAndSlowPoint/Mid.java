package FastAndSlowPoint;
//奇数返回中点，偶数返回上中点
public class Mid {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        if(head == null||head.next == null||head.next.next == null){
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
