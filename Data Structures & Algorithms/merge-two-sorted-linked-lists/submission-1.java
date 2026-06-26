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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return list1 ;
        ListNode dum = new ListNode(-1) ;
        ListNode ptr = dum ;
        ListNode f = list1 ;
        ListNode s = list2 ;
        while(f != null && s != null){
            if(f.val <= s.val){
                ptr.next = f ;
                f = f.next ;
            }
            else{
                ptr.next = s ;
                s = s.next ;
            }
            ptr = ptr.next ;
        }
        while(f != null){
            ptr.next = f ;
            f = f.next ;
            ptr = ptr.next ;
        }
        while(s != null){
            ptr.next = s ;
            s = s.next ;
            ptr = ptr.next ;
        }
        return dum.next ;
    }
}