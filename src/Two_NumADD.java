public class Two_NumADD {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        res.val     = (l1.val + l2.val)%10;
        int next    = (l1.val + l2.val)/10;
        if(l1.next!=null||l2.next!=null||next!=0){
            if(l1.next!=null){
                l1 = l1.next;
            }else {
                l1.next = new ListNode(0);
                l1  =l1.next;
            }
            if(l2.next!=null){
                l2 = l2.next;
            }else {
                l2.next = new ListNode(0);
                l2 = l2.next;
            }
            l1.val += next;
            res.next = addTwoNumbers(l1,l2);
        }
        return res;
    }
}
//[9,10,9,9,9,9,9] [9,9,9,9]
//[8,9,9,9,0,0,0,
