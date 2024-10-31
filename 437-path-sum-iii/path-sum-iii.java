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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        
        return checkNode(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int checkNode(TreeNode root, long targetSum) {
        if(root == null) 
            return 0;

        targetSum -= root.val;
        int count = targetSum == 0 ? 1 : 0;

        count += checkNode(root.left, targetSum);
        count += checkNode(root.right, targetSum);

        return count;
    }
}