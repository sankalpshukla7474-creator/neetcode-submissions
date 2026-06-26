/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<Integer> ls = new ArrayList<>() ;
    Stack<Integer> st = new Stack<>() ;
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root , 0);
        while(!st.isEmpty()){
            ls.add(st.pop()) ;
        }
        Collections.reverse(ls) ;
        return ls ;
    }
    public void traverse(TreeNode root , int level){
        if(root == null) return ;
        if(st.size() == level){
            st.push(root.val) ;
        }
        traverse(root.right,level+1) ;
        traverse(root.left,level+1) ;
        return ;
    }
}
