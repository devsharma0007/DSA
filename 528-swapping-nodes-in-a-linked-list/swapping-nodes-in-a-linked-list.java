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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size==1) return head;
        temp = head;
        int point = size-k+1;
        for(int i = 1;i<k;i++){
            slow = slow.next;
        }
        for(int i = 1;i<point;i++){
            fast = fast.next;
        }
        if(fast == slow) return head;
        slow.val = slow.val+fast.val;
        fast.val = slow.val-fast.val;
        slow.val = slow.val-fast.val;
        return head;
    }
}