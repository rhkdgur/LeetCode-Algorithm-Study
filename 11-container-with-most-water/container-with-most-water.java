class Solution {
    public int maxArea(int[] height) {
        
        int len = height.length;
		int left = 0;
		int right = len - 1;
		int max = 0;
        while(left < right) {
        	
            // x 좌표 양 측 point 길이
        	int w = right - left;
            // y 높이를 의미  , 두 point 중 작은 값을 선택 ( 물 통이 기울어지면 안된닥고 되어 있음)
        	int h = height[left] > height[right] ? height[right] : height[left];
        	
            // 직사가형 넓이 구하는식 적용
        	int b = w * h;
            // 직사각형 들의 최대값이 뭔지 체크
        	max = max < b ? b : max;
        	
            //왼 Point가 오  보다 작으면 증감
        	if(height[left] < height[right]) {
        		left++;
            //오 Point가 왼 보다 작으면 감소
        	}else if(height[left] > height[right]) {
        		right--;
            //아니면 둘다 변화를 줌
        	}else {
        		left++;
        		right--;
        	}
        }
        
        return max;
    }
}