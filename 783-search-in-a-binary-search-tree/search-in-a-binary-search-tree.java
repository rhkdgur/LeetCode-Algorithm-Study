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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int len = queue.size();
            for( int i = 0; i<len; i++) {
                TreeNode n = queue.poll();
                if(n.left != null) {
                    if(n.left.val == val) {
                        return n.left;
                    }else {
                        queue.offer(n.left);
                    }
                }
                if(n.right != null) {
                    if(n.right.val == val) {
                        return n.right;
                    }else {
                        queue.offer(n.right);
                    }
                }
            }
        }

        return null;
    }
}