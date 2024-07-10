class Solution {
    public boolean increasingTriplet(int[] nums) {

        int ma = Integer.MAX_VALUE;
        int mb = Integer.MAX_VALUE;
        int len = nums.length;

        for(int i = 0; i<len; i++) {
            if(nums[i] <= ma) {
                ma = nums[i];
            }else if(nums[i] <= mb) {
                mb = nums[i];
            }else {
                return true;
            }
        }

        return false;
        
    }
}