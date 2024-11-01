/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        return checkCommonAncestor(root, p, q);
    }

    public TreeNode checkCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null || root == p || root == q ){
            return root;
        }
        
        TreeNode left = checkCommonAncestor(root.left, p, q);
        TreeNode right = checkCommonAncestor(root.right, p , q);

        if(left != null && right != null) {
            return root;
        }

        if(left != null){
            return left;
        }else {
            return right;
        }

    }
}