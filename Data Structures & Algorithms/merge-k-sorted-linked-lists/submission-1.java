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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null ;
        return pass(lists,0,lists.length-1) ;
    }
    public ListNode pass(ListNode[] ls , int i , int j){
        if(i == j) return ls[i] ;
        int mid = i + (j-i) / 2 ; 
        ListNode l1 = pass(ls,i,mid) ;
        ListNode l2 = pass(ls,mid+1,j) ;
        return merge(l1,l2) ;
    }
    public ListNode merge(ListNode l1 , ListNode l2){
        if(l1 == null) return l2 ;
        if(l2 == null) return l1 ;
        if(l1.val <= l2.val){
            l1.next = merge(l1.next,l2) ;
            return l1 ;
        }
        else{
            l2.next = merge(l1,l2.next); 
            return l2 ;
        }
    }
}
