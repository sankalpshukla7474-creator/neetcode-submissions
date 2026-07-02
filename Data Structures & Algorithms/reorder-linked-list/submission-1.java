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
        Stack<ListNode> st = new Stack<>() ;
        if(head == null || head.next == null) return  ;
        ListNode temp = head ;
        while(temp != null){
            st.push(temp) ;
            temp = temp.next ;
        }
        temp = head ;
        int sum = st.size() / 2 ;
        while(sum > 0){
            ListNode nxt = temp.next ;
            ListNode jojo = st.pop() ;
            temp.next = jojo ;
            jojo.next = nxt ;
            temp = nxt ;
            sum-- ;
        }
        if(temp != null){
            temp.next = null ;
        }
    }
}
