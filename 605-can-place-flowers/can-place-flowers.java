class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;
        int[] temp = flowerbed;
        int cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i<len; i++) {
            if(temp[i] == 1){
                cnt2++;
            }
            if(i == 0) {
                if(flowerbed[i] != 1){
                    flowerbed[i] = 1;
                }
                cnt++;
            }else {
                if(flowerbed[i-1] != 1){
                    flowerbed[i] = 1;
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
        System.out.println(cnt2);
        System.out.println(Arrays.toString(flowerbed));

        if((cnt - cnt2) >= n) {
            return true;
        }else {
            return false;
        }
        
    }
}