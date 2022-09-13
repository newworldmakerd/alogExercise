package LinkedListTest;


import LinkedListHuiwen.ListNode;

public class SeparatedLinkedList {
    public ListNode partition(ListNode head, int x) {
        ListNode sH = null;
        ListNode sT = null;
        ListNode mH = null;
        ListNode mT = null;
        ListNode next = null;
        while (head!=null){
            next = head.next;
            head.next = null;
            if(head.val<x){
                if(sH==null){
                    sH = head;
                    sT = head;
                }
                else {
                    sT.next = head;
                    sT= sT.next;
                }
            }
            else {
                if(mH == null){
                    mH = head;
                    mT = head;
                }
                else {
                    mT.next = head;
                    mT = mT.next;
                }
            }
            head = next;
        }
        if(sT!=null){
            sT.next = mH;
        }
        return sT != null? sH:mH;
    }
}
