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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<ListNode> arr = new ArrayList<>();
        if(temp==null) return head;
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }
        int size = arr.size();
        for(int i = size-1;i>=1;i--){
            ListNode t1 = arr.get(i);
            ListNode t2 = arr.get(i-1);
            t1.next = t2;
        }
        arr.get(0).next = null;
        return arr.get(size-1);
    }
}