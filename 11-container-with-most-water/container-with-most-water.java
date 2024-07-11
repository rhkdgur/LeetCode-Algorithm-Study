class Solution {
    public int maxArea(int[] height) {
        
        int len = height.length;
		int left = 0;
		int right = len - 1;
		int max = 0;
        while(left < right) {
        	
        	int w = right - left;
        	int h = height[left] > height[right] ? height[right] : height[left];
        	
        	int b = w * h;
        	max = max < b ? b : max;
        	
        	if(height[left] < height[right]) {
        		left++;
        	}else if(height[left] > height[right]) {
        		right--;
        	}else {
        		left++;
        		right--;
        	}
        }
        
        return max;
    }
}