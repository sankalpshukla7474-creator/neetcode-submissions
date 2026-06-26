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
    public ListNode mergeKLists(ListNode[] l) {
        if(l.length == 0) return null ;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < l.length ; i++){
           ListNode temp = l[i] ;
           while(temp != null){
            ls.add(temp.val);
            temp = temp.next ;
           } 
        }
        Collections.sort(ls);
        ListNode head = new ListNode(-1) ;
        ListNode t = head ;
        for(int i = 0 ; i < ls.size() ; i++){
            ListNode o = new ListNode(ls.get(i));
            t.next = o ;
            t = t.next ;
        }
        return head.next ;
    }
}
