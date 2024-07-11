class Solution {
    public int maxOperations(int[] nums, int k) {
        
        // 오름차순 정렬을 한다.
        // k 에 대한 값을 구하기 위해서는 최소값을 기준으로 계산을 통해 제거를 해야 한다.
        // 
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1; 
        int cnt = 0;

        while(left < right) {
            int s = nums[left] + nums[right];
            if(k == s) {
                left++;
                right--;
                cnt++;
            }else {
                if(nums[left] + nums[right] < k) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        return cnt;
    }
}