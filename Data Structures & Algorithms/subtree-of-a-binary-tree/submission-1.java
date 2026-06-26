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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traverse(root,subRoot) ;
    }
    public boolean traverse(TreeNode root , TreeNode subRoot){
        if(root == null){
            return false ;
        }
        if(root.val == subRoot.val){
            TreeNode c = subRoot ;
            if(isSame(root,c)){
                return true ;
            }
        }
        return traverse(root.left,subRoot) || traverse(root.right,subRoot);
    }
    public boolean isSame(TreeNode a , TreeNode b){
        if(a == null && b == null) return true ;
        if(a == null || b== null) return false ;
        if(a.val != b.val) return false ;
        return isSame(a.right,b.right) && isSame(a.left,b.left) ;
    }
}
