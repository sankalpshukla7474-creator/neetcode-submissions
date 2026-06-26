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
    public void reorderList(ListNode head) {
        if(head == null) return ;
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode s = reverse(slow.next) ;
        slow.next = null ;
        ListNode f = head ;
        while(s != null){
            ListNode t1 = f.next ;
            ListNode t2 = s.next ;

            f.next = s ;
            s.next = t1 ;

            f = t1 ;
            s = t2 ;
        } 
    }
    public static ListNode reverse(ListNode ptr){
        ListNode prev = null ;
        ListNode curr = ptr ;
        while(curr != null){
            ListNode nxt = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = nxt ;
        }
        return prev ;
    }
}
