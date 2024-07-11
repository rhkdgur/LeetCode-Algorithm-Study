class Solution {
    public int maxArea(int[] height) {
        
       int len = height.length;
		int left = 0;
		int right = len - 1;
		int max = 0;
		int hmin = 0;
        while(left < right) {
        	// 높이 최소값
        	hmin = height[left] < height[right] ? height[left] : height[right];
        	// 넓이 최대값
        	max = max < (right - left) * hmin ? (right - left) * hmin : max;  
        	
        	if(height[left] <= hmin) {
        		left++;
        	}
        	if(height[right] <= hmin) {
        		right--;
        	}
        }
        
        return max;
    }
}