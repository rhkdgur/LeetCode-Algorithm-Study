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

    int cnt = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        targetCnt(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return cnt;
    }

    public void targetCnt(TreeNode root, int targetSum, long sum) {
        
        if(root == null) return;

        long s = sum + root.val;
        if(s == targetSum) cnt++;
        
        targetCnt(root.left, targetSum, s);
        targetCnt(root.right, targetSum, s);

    }
}