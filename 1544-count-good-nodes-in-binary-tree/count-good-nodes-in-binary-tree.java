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

    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;

        checkGoodNodes(root, root.val);
        return count;
    }
    
    public void checkGoodNodes(TreeNode root, int max) {
        if(root == null)
            return ;

        max = Math.max(max,root.val);

        if(max <= root.val)
            count++;
        
        checkGoodNodes(root.left,max);
        checkGoodNodes(root.right,max);
    }
    
}