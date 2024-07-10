class Solution {
    public boolean increasingTriplet(int[] nums) {

        int ma = Integer.MAX_VALUE;
        int mb = Integer.MAX_VALUE;
        int len = nums.length;

        // 이 문제는 삼중항을 구하는 문제입니다.
        // a < b < c 만을 만족하면 된다. 배열 요소 에 상관없이
        // int ma 와 int mb 로 둔 이유는 ma 와 mb 두가지 모두를 확인할 때 둘 보다 큰 값이라면 무조건 a < b < c를 만족하는 것이기에
        // true가 된다.
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