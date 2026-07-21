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
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        
        ListNode j = head;

        while(j!=null && j.next!=null){
            if(j.next.val<j.val){
                j.next = j.next.next;
            }
            else{
                j = j.next;
            } 
        }
        return reverseList(head);

        
    }
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
}
