/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode fwd = null;
        while(current!=null){
            fwd = current.next;
            current.next = prev;
            prev  = current;
            current = fwd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        ListNode t1 = reverseList(l1);
        ListNode t2 = reverseList(l2);

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int sum = 0;
        int carry = 0;

        
        while (t1 != null || t2 != null) {
            
            int x = (t1 != null) ? t1.val : 0;
            int y = (t2 != null) ? t2.val : 0;

        sum = x + y + carry;
        carry = sum / 10;

        temp.next = new ListNode(sum % 10);
        temp = temp.next;

        if (t1 != null) t1 = t1.next;
        if (t2 != null) t2 = t2.next;
    }

        if (carry != 0) {
        temp.next = new ListNode(carry);
    }

        return reverseList(dummy.next);


    }
}