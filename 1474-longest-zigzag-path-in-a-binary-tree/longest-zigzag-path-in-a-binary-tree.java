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

        maxZigzag(root.left, true , 1);
        maxZigzag(root.right, false , 1);

        return max;
    }

    public void maxZigzag(TreeNode root , boolean flag , int dept) {
        if(root == null)
            return ;

        max = Math.max(max, dept);

        //flag : true -> left, flag : false -> right
        if(flag) {
            maxZigzag(root.left, true, 1);
            maxZigzag(root.right, false, dept + 1);
        }else {
            maxZigzag(root.left, true, dept + 1);
            maxZigzag(root.right, false, 1);
        }

    }
}