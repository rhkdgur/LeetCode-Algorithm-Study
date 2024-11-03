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
        checkRightSize(rootList, root, 0);
        return rootList;
    }

    public void checkRightSize(List<Integer> list, TreeNode root, int dept) {
        if(root == null)
            return ;

        if(dept == list.size()) {
            list.add(root.val);
        }

        checkRightSize(list, root.right, dept+1);
        checkRightSize(list, root.left, dept+1);
    }

}