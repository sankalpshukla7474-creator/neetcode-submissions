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
    public Node copyRandomList(Node head) {
        if(head == null) return head ;

        Node curr = head ;
        while(curr != null){
            Node nai = new Node(curr.val);
            nai.next = curr.next ;
            curr.next = nai ;
            curr = nai.next ;
        }

        curr = head ;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next ;
            }
             curr = curr.next.next;
        }
        curr = head ;
        Node nh = head.next ;
        Node nc = nh ;
        while(curr != null){
            curr.next = nc.next ;
            curr = curr.next ;
            if(curr != null){
                nc.next = curr.next ;
                nc = nc.next ;
            }
        }
        return nh ;

    }
}