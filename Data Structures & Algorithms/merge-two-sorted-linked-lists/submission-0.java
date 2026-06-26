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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> ls = new ArrayList<>();
        while(l1 != null){
            ls.add(l1.val);
            l1 = l1.next ;
        }
        while(l2 != null){
            ls.add(l2.val);
            l2 = l2.next ;
        }
        Collections.sort(ls);
        ListNode q = new ListNode(0) ;
        ListNode p = q ;
        for(int i = 0 ; i < ls.size() ; i++){
            ListNode o = new ListNode(ls.get(i));
            p.next = o ;
            p = p.next ;
        }
        return q.next;
    }
}