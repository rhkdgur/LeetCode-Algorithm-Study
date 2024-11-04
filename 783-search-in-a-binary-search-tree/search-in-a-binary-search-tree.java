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
        if(root == null)
            return null;
        else {
            if (root.val == val) {
                return root;
            }
        }
        return BFS(root,val);
    }

    public TreeNode BFS(TreeNode root, int val) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i<len; i++) {
                TreeNode r = queue.poll();
                if(r.left != null) {
                    if(val == r.left.val) {
                        return r.left;
                    }else {
                        queue.offer(r.left);
                    }
                }
                if(r.right != null) {
                    if(val == r.right.val) {
                        return r.right;
                    }else {
                        queue.offer(r.right);
                    }
                }
            }
        }
        return null;
    }
}