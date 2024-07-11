class Solution {
    public void moveZeroes(int[] nums) {
        
        // two point를 이용하는 말 처럼
        // 두 인덱스를 비교하여 찾아갑니다.
        // 궁극적으로 0 이 아닌 값들은 그대로 앞으로 이전하는 것이 목표이기에
        // 앞으로 옮겨주는 작업을 해줍니다.
        int a = 0;
        for(int i = 0; i<nums.length; i++) {
            //만약 nums[i] 값이 0이 아닐 경우 a 인덱스 값 기준으로 맨 앞부터 채워줍니다.
            //앞으로 옮기고 나면 인덱스 a의 값은 증감을 이용해서 다음 칸에 일치하는 값을 넣어줍니다.
            if(nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }

        // 최종적으로 0이아닌 값들을 앞으로 다 옮기고 나면 뒤에는 남은 칸 만큼 0을 채워주면 됩니다.
        for(int i = a; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}