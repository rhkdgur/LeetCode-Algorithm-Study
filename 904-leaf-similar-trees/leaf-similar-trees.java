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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1List = new ArrayList<>();
        List<Integer> root2List = new ArrayList<>();
        similar(root1List,root1);
        similar(root2List,root2);
        return root1List.equals(root2List);
    }

    public void similar(List<Integer> list , TreeNode root) {
        if(root == null)
            return ;

        if(root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        similar(list,root.left);
        similar(list,root.right);

        
    }
}