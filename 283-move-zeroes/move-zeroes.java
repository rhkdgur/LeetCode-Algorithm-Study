class Solution {
    public void moveZeroes(int[] nums) {
        
        int zero = 0;
        int min = Integer.MAX_VALUE;

        int len = nums.length;
        int a = 0;
        for(int i = 0; i<len; i++) {
            if(nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }

        for(int i = a; i<nums.length; i++) {
            nums[i] = 0;
        }

        // System.out.println(Arrays.toString(nums));
    }
}