package LinkedListHuiwen;


import java.util.List;
import java.util.Stack;

public class Solution {
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
        Stack<Integer> stack = new Stack<>();
        while (slow!=null){
            stack.push(slow.val);
            slow = slow.next;
        }
        ListNode n = head;
        while (!stack.isEmpty()){
            if(n.val!=stack.pop()){
                return false;
            }
            n = n.next;
        }
        return true;
        //[1,2,3,4,5,6,]
    }
}
