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
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> nums = new ArrayList<>();
        queue.offer(root);
        nums.add(root.val);
        checkMaxLevel(queue, nums);

        int max = Collections.max(nums);
        
        int level = 0;
        for( int i = 0; i<nums.size(); i++) {
            if(max == nums.get(i)){
                level = i+1;
                break;
            }
        }

        return level;
    }

    public void checkMaxLevel(Queue<TreeNode> queue, List<Integer> nums) {

        while(!queue.isEmpty()) {
            int len = queue.size();
            int total = 0;
            boolean flag = false;
            for(int i = 0 ; i<len; i++) {
                TreeNode r = queue.poll();
                    if(r.left != null){
                        flag = true;
                        total += r.left.val;
                        queue.offer(r.left);
                    }
                    if(r.right != null){
                        flag = true;
                        total += r.right.val;
                        queue.offer(r.right);
                    }
            }
            if(flag){
                nums.add(total);
            }
        }
    }
}