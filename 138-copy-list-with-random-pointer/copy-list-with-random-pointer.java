/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepcopy(Node head1){
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1!=null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        return head2.next; 
    }
    public void merge(Node head1,Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2!=null){
            temp.next = temp1;
            temp = temp1;
            temp1 = temp1.next;
            temp.next = temp2;
            temp = temp2;
            temp2 = temp2.next;
        }
    }
    public void randomConnections(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while(t1!=null && t2!=null){
            if(t1.random==null) t2.random = null;
            else t2.random = t1.random.next;
            t1 = t1.next.next;
            if(t2.next!=null) t2 = t2.next.next;
        }
    }
    public void splitting(Node head1,Node head2){
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node t1 = dummy1;
        Node t2 = dummy2;
        Node t = head1;
        //Node temp2 = head2;
        while(t!=null){
            t1.next = t;
            t1 = t;
            t = t.next;
            t2.next = t;
            t2 = t;
            t = t.next;
        }
        t1.next = null;
    }

    public Node copyRandomList(Node head1) {
        //step 1 : creating deep copy without random
        Node head2 = deepcopy(head1);
        //step 2 : alternatively connecting a dummy
        merge(head1,head2);
        //step 3 : assign random connection
        randomConnections(head1,head2);
        //splitting the combined
        splitting(head1,head2);

        return head2;

        
    }
}