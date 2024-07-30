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
          List<Integer> list1 = new ArrayList<>();
          List<Integer> list2 = new ArrayList<>();
          list1 = collectlist(root1,list1);
          list2 = collectlist(root2,list2);
          return list1.equals(list2);
    }

    public List<Integer> collectlist(TreeNode root , List<Integer> leaf) { 
         if(root == null) return leaf;

         if(root.left == null && root.right == null)
                leaf.add(root.val);

         leaf = collectlist(root.left,leaf);
         leaf = collectlist(root.right,leaf);

         return leaf;
    }
}