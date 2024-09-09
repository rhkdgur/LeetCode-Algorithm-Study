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

    int total = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        targetCnt(root, targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return  total;
    }

    public void targetCnt(TreeNode root, int targetSum, long count) {
        if(root == null) return;

        long cnt = count + root.val;

        if(targetSum == cnt)  total++;

        targetCnt(root.left,targetSum,cnt);
        targetCnt(root.right,targetSum,cnt);
    
    }
}