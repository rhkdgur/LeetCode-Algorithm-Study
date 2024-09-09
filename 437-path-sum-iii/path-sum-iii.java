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

     int paths = 0;

        public int pathSum(TreeNode root, int targetSum) {

            if (root == null)
                return 0;
            //dfs including current root.
            dfsCurrent(root, targetSum, 0);

            //dfs excluding current root on the left side
            pathSum(root.left, targetSum);

            //dfs excluding current root on the right side
            pathSum(root.right, targetSum);
            return paths;
        }

        private void dfsCurrent(TreeNode root, int targetSum, long sum) {
            if (root == null)
                return;
            //include current root and check for the sum
            if (sum + root.val == targetSum)
                paths++;

            //include current root and go left and right
            dfsCurrent(root.left, targetSum, sum + root.val);
            dfsCurrent(root.right, targetSum, sum + root.val);
        }
}