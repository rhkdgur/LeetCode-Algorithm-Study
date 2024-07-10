class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        int len = nums.length;

        answer[0] = 1;
        for(int i = 1; i<len; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }

        int p = 1;
        for(int i = len-1; i>=0; i--) {
            answer[i] *= p;
            p *= nums[i];
        }

        return answer;

    }
}