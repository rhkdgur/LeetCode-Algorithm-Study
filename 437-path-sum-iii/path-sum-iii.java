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
        if(root == null) return 0;
        return targetCnt(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }

    public int targetCnt(TreeNode root, long targetSum) {
        
        if(root == null) return 0;

        targetSum -= root.val;
        int cnt = targetSum == 0 ? 1 : 0;

        cnt += targetCnt(root.left, targetSum);
        cnt += targetCnt(root.right, targetSum);

        return cnt;


    }
}