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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rootList = new ArrayList<>();
        if(root == null)
            return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i<len; i++) {
                TreeNode n = queue.poll();
                if(i == (len - 1)) {
                    rootList.add(n.val);
                }

                if(n.left != null)
                    queue.offer(n.left);
                if(n.right != null)
                    queue.offer(n.right);
            }
        }

        return rootList;
    }

}