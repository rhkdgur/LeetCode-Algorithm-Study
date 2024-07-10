class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        int len = nums.length;

        // 우선 앞쪽 배열 부터 곱하기를 합니다.
        // ex) [1,2,3,4]
        // 최초 answer의 [0] 은 1로 둡니다.
        // 초기 값을 1로 두는건 자기 자신만을 의미하기 때문 즉 1을 곱하는 것은 자기 자신을 그대로 유지한다는 의미
        // answer은 온전히 담아내기 위한 초석일 뿐
        // 1 = 1 , 2 = 1 * 1, 3 = 1 * 2 , 4 = 1*2*3
        answer[0] = 1;
        for(int i = 1; i<len; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }

        //뒤쪽 배열 계산
        //ex) [1,2,3,4]
        //시작은 무조건 자신은 배제해야하기에 1과 곱하도록 진행
        // 4 = 6 , 3 = 2*4, 2 = 1*4*3 , 1=1*12*2
        int p = 1;
        for(int i = len-1; i>=0; i--) {
            answer[i] *= p;
            p *= nums[i];
        }

        return answer;

    }
}