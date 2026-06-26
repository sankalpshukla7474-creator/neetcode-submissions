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
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        ListNode i = new ListNode(0) ;
        ListNode t = i ;
        int c = 0 ;
        while(h1 != null && h2 != null){
            int sum = h1.val + h2.val + c ;
            if(sum <= 9) {
                ListNode h = new ListNode(sum);
                t.next = h ;
                t = t.next ;
                c = 0 ;
            }
            else{
                ListNode h = new ListNode(sum % 10);
                t.next = h ;
                t = t.next ;
                c = 1 ; 
            }
            h1 = h1.next ;
            h2 = h2.next ;
        }
        while(h1 != null){
            int sum = h1.val + c ;
            if(sum <= 9) {
                ListNode h = new ListNode(sum);
                t.next = h ;
                t = t.next ;
                c = 0 ;
            }
            else{
                ListNode h = new ListNode(sum % 10);
                t.next = h ;
                t = t.next ;
                c = 1 ; 
            }
            h1 = h1.next ;
        }
        while(h2 != null){
            int sum = h2.val + c ;
            if(sum <= 9) {
                ListNode h = new ListNode(sum);
                t.next = h ;
                t = t.next ;
                c = 0 ;
            }
            else{
                ListNode h = new ListNode(sum % 10);
                t.next = h ;
                t = t.next ;
                c = 1 ; 
            }
            h2 = h2.next ;
        }
        if(c == 1){
            ListNode h = new ListNode(1);
            t.next = h ; 
            return i.next ;
        }
        return i.next ;
        
    }
    public ListNode reverse(ListNode head){
        if(head == null) return head ;
        ListNode prev = null; 
        ListNode curr = head ;
        while(curr != null){
            ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;

        }  
        return prev ; 
    }
}
