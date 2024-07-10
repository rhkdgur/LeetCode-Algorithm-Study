class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;

        for(int i = 0; i<len; i=i+2) {
            if(flowerbed[i] == 0) {
                if(i == len - 1 || flowerbed[i] == flowerbed[i+1]) {
                    n--;
                }else {
                    i++;
                }
            }
        }

        return n <= 0;
    }
}