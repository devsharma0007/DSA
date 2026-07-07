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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp  = head;
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }
        int i = left-1;
        int j = right-1;
        while(i<j){
            ListNode t1 = arr.get(i);
            ListNode t2 = arr.get(j);
            arr.set(i,t2);
            arr.set(j,t1);
            i++;
            j--;
        }
        for(i = 0;i<arr.size();i++){
            if(i==arr.size()-1){
                arr.get(i).next = null;
                break;
            }
            arr.get(i).next  = arr.get(i+1);
        }

        return arr.get(0);

        
        
    //     if(head.next==null) return head;
    //     ListNode a = head;
    //     ListNode b = head;
    //     ListNode c = head;
    //     ListNode d = head;
    //     ListNode e = head;

    //     int n = 1;
    //     int m = 1;
        

    //     while(n<left){
    //         a = a.next;
    //         n++;
    //     }
    //     while(m<right){
    //         b = b.next;
    //         m++;
    //     }

    //     c = b.next;
        
    //     b.next = null;

    //     a = reverseList(a);

    //     d.next = a;
    //     b.next = c;
    //     c.next = null;

    //     return e;
    // }
    //     public ListNode reverseList(ListNode head) {
    //     ListNode temp = head;
    //     ArrayList<ListNode> arr = new ArrayList<>();
    //     if(temp==null) return head;
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int size = arr.size();
    //     for(int i = size-1;i>=1;i--){
    //         ListNode t1 = arr.get(i);
    //         ListNode t2 = arr.get(i-1);
    //         t1.next = t2;
    //     }
    //     arr.get(0).next = null;
    //     return arr.get(size-1);

        
}
}