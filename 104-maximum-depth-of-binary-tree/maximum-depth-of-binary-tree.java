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

    int dept = 0;
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
            
        if(root.left == null && root.right == null)
            return 1;
        
        checkDepth(root,1);
        return dept;
    }

    public void checkDepth(TreeNode root, int c) {
        if(root == null)
            return ;

        if(root.left == null && root.right == null) {
            dept = Math.max(dept, c);
        }

        checkDepth(root.left, c+1);
        checkDepth(root.right, c+1);
    }
}