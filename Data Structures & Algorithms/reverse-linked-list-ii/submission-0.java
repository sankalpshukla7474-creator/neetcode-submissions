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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return head ;
        int count = 0 ;
        ListNode x = head ;
        while(x != null){
            count++;
            x = x.next ;
        }
        x = head ;
        List<Integer> ls = new ArrayList<>();
        for(int i = 1 ; i <= count ; i++){
            if(i>=left && i<=right){
                ls.add(x.val);
            }
            x = x.next ;
        }
        Collections.reverse(ls);
        x = head ;
        int z = 0 ;
        for(int i = 1 ; i <= count ; i++){
            if(i>=left && i<=right){
                x.val = ls.get(z);
                z++;
            }
            x = x.next ;
        }
        return head ;
    }
}