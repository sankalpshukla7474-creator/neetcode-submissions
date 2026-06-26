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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0) return head ;
        if(head.next == null && n == 1) return null ;

        int count = 0 ;
        ListNode ptr = head ;
        while(ptr != null){
            count++ ;
            ptr = ptr.next ;
        }

        int p = count - n ;
        if(p == 0 ) return head.next ;
        ptr = null ;
        ListNode t = head ;
        while(p != 0 ){
            ptr = t ;
            t = t.next ;
            p--;
        }

        ptr.next = t.next ;
        return head ; 

    }
}
