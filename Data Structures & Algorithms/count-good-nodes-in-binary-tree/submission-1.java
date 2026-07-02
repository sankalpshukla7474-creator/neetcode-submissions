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
    int count = 0 ;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0 ;
        pass(root,Integer.MIN_VALUE) ;
        return count ;
    }
    public void pass(TreeNode root , int max){
        if(root == null) return ;
        int p = 0 , q = 0 ;
        if(root.val >= max){
            count++ ;
        }
        pass(root.left,Math.max(max,root.val)) ;
        pass(root.right,Math.max(max,root.val)) ;
    }
}
