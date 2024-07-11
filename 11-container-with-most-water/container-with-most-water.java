class Solution {
    public int maxArea(int[] height) {
        
        int len = height.length;
		int left = 0;
		int right = len - 1;
		int max = 0;

        // 양쪽 point로부터 서로 가까워 지는 것이기에 교차되는 순간 while 문 탈출
        while(left < right) {
        	
            // x 좌표 양 측 point 길이
        	int w = right - left;
            // y 높이를 의미  , 두 point 중 작은 값을 선택 ( 물 통이 기울어지면 안된닥고 되어 있음)
        	int h = height[left] > height[right] ? height[right] : height[left];
        	
            // 직사가형 넓이 구하는식 적용
        	int b = w * h;
            // 직사각형 들의 최대값이 뭔지 체크
        	max = max < b ? b : max;
        	
            //높이 최소값이 left 쪽이 낮거나 같으면 left ++;
            while(left < right && height[left] <= h) {
                left++;
            }
            //높이 최소값이 right 쪽이 낮거나 같으면 right --;
            while(left < right && height[right] <= h){
                right--;
            }

            // if(height[left] <= hmin) {
        	// 	left++;
        	// }
        	// if(height[right] <= hmin) {
        	// 	right--;
        	// }
        }
        
        return max;
    }
}