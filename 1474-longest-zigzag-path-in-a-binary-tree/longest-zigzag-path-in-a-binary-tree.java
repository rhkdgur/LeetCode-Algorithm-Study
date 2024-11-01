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

    int max = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null)
            return 0;
        
        checkZigZag(root.left, true, 1);
        checkZigZag(root.right, false, 1);
        return max;
    }

    public void checkZigZag(TreeNode root, boolean flag, int dept) {

        if(root == null)
            return ;

        max = Math.max(dept, max);

        if(flag) {
            checkZigZag(root.left,true, 1);
            checkZigZag(root.right,false, dept + 1);
        }else {
            checkZigZag(root.left,true, dept+1);
            checkZigZag(root.right, false, 1);
        }

    }


}