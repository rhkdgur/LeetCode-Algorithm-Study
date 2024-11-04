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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;

        if(root.val < key)
            root.right = deleteNode(root.right, key);
        else if(root.val > key) {
            root.left = deleteNode(root.left, key);
        }else {
            if(root.left == null && root.right == null)
                return null;

            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            
            TreeNode rn = find(root.right);
            root.val = rn.val;
            root.right = deleteNode(root.right,rn.val);
        }

        return root;
    }

    //최소값으로 연결하는 작업
    //이진트리탐색의 특성은 노드 왼쪽에 작은 값을 배치한다.
    public TreeNode find(TreeNode node) {
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}