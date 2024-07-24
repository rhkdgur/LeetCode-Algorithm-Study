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
    public int goodNodes(TreeNode root) {
        return collectLinked(root,root.val);
    }

    
    public int collectLinked(TreeNode root , int max) {
        
        if(root == null) return 0;
        
        if(max <= root.val) {
            return 1 + collectLinked(root.left,root.val) + collectLinked(root.right,root.val);
        }else {
            return collectLinked(root.left,max) + collectLinked(root.right,max);
        }

    } 


}