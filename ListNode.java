
public class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next;  }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while (l1 != null || l2 != null || carry!=0) {
            int res = carry;
            if(l1 != null){
                res += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                res += l2.val;
                l2 = l2.next;
            }
            carry = res/10;
            result.next = new ListNode(res%10);
            result = result.next;
        }
        if(carry>0){
            result.next = new ListNode(carry);
        }
        return dummy.next;
    }
}