package LinkedListHuiwen;

import java.util.List;

public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        if(head.next.next == null){
            if(head.val == head.next.val){
                return true;
            }else {
                return false;
            }
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode n1 = slow.next;
        ListNode n2 = n1.next;
        ListNode n3 = n2.next;
        slow.next = null;
        ListNode head2 = n1;
        while (n1!=null){
            n2.next = n1;
            n1 = n3;
            n3.next = n2;
            n2 = n1.next;
            n3 = n2.next;
            if(head2.next!=null){
                head2.next = null;
            }
        }
        ListNode n = head;
        while (n.next!=null&&n1!=null){
            if(n.val!=n1.val){
                return false;
            }
            n = n.next;
            n1 = n1.next;
        }
        return true;
    }
}
