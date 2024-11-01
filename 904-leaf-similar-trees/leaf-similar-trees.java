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
        checkLeaf(root1List, root1);
        checkLeaf(root2List, root2);
        return root1List.equals(root2List);
    }

    public void checkLeaf(List<Integer> list, TreeNode root1) {
        if(root1 == null)
            return;

        if(root1.left == null && root1.right == null){
            list.add(root1.val);
        }

        checkLeaf(list, root1.left);
        checkLeaf(list, root1.right);
    } 
}