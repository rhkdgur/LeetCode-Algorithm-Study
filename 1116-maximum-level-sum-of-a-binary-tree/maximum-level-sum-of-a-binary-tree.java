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
    public int maxLevelSum(TreeNode root) {

        List<Integer> nums = new ArrayList<>();
        nums.add(root.val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        checkMaxLevel(queue, nums);
        System.out.println(nums);
        int max = root.val;
        int level = 1;
        for(int i = 0; i<nums.size(); i++) {
            if(max < nums.get(i)){
                max = nums.get(i);
                level = i+1;
            }
        }
        return level;
    }

    public void checkMaxLevel(Queue<TreeNode> queue , List<Integer> nums) {
        
        while(!queue.isEmpty()) {
            int len = queue.size();
            int total = 0;
            for(int i = 0; i<len; i++) {
                TreeNode r = queue.poll();
                if(r.left != null){
                    total += r.left.val;
                    queue.offer(r.left);
                }
                if(r.right != null){
                    total += r.right.val;
                    queue.offer(r.right);
                }
            }
            nums.add(total);
        }
        nums.remove(nums.size() - 1);
    }
}