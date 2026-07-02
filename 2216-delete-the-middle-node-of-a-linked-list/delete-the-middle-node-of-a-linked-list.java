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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count=0;
        if(temp.next==null) return null;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        temp = head;
        for(int i = 0;i<(count/2)-1;i++){
            temp  = temp.next;
        }
        temp.next = temp.next.next;
        return head; 
    }
}