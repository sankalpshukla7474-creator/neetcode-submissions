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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0) ;
        ListNode f = l1 ;
        ListNode s = l2 ;
        ListNode ptr = dum ;
        int bow = 0 ;
        while(f != null && s != null){
             int c = f.val + s.val + bow ;
             if(c <= 9){
                ListNode i = new ListNode(c) ;
                ptr.next = i ;
                ptr = ptr.next ;
                bow = 0 ;
             }
             else{
                c = c - 10 ;
                ListNode i = new ListNode(c) ;
                ptr.next = i ;
                ptr = ptr.next ;
                bow = 1 ;
            }
            f = f.next ;
            s = s.next ;

        }
        while(f != null){
            int c = f.val + bow ;
            if(c <= 9){
                ListNode i = new ListNode(c) ;
                ptr.next = i ;
                ptr = ptr.next ;
                bow = 0 ;
             }
             else{
                c = c - 10 ;
                ListNode i = new ListNode(c) ;
                ptr.next = i ;
                ptr = ptr.next ;
                bow = 1 ;
            }
            f = f.next ;
        }
        while(s != null){
            int c = s.val + bow ;
            if(c <= 9){
                ListNode i = new ListNode(c) ;
                ptr.next = i ;
                ptr = ptr.next ;
                bow = 0 ;
             }
             else{
                c = c - 10 ;
                ListNode i = new ListNode(c) ;
                ptr.next = i ;
                ptr = ptr.next ;
                bow = 1 ;
            }
            s = s.next ;
        }
        if(bow == 1){
            ListNode i = new ListNode(1) ;
            ptr.next = i ;
        }
        return dum.next ;
    }
}
