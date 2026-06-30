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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head ;
        ListNode dum = new ListNode(-1) ;
        dum.next = head ;
        ListNode p = head , q = head ;
        while(p != null && q != null){
            int num = k ;
            while(q != null && num > 0){
                q = q.next ;
                num-- ;
            }
            if(num > 0) break ;
            ListNode front = dum , rear = dum ;
            while(front.next != p){
                front = front.next ;
            }
            while(rear.next != q){
                rear = rear.next ;
            }
            front.next = null ;
            rear.next = null ;
            ListNode curr = reverse(p) ;
            front.next = curr ;
            rear = dum ;
            while(rear.next != null){
                rear = rear.next ;
            }
            rear.next = q ;
            p = q ;
        }
        return dum.next ;
    }
    public ListNode reverse(ListNode root){
        ListNode prev = null ;
        while(root != null){
            ListNode nxt = root.next ;
            root.next = prev ;
            prev = root ;
            root = nxt ;
        }
        return prev ;
    }
}
