class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // int len = flowerbed.length;
        // int[] temp = flowerbed;
        // int cnt = 0;
        // int cnt2 = 0;
        // for(int i = 0; i<len; i++) {
        //     if(temp[i] == 1){
        //         cnt2++;
        //     }
        //     if(i == 0) {
        //         if(flowerbed[i] != 1){
        //             flowerbed[i] = 1;
        //         }
        //         cnt++;
        //     }else {
        //         if(flowerbed[i-1] != 1){
        //             flowerbed[i] = 1;
        //             cnt++;
        //         }
        //     }
        // }

        // if((cnt - cnt2) >= n) {
        //     return true;
        // }else {
        //     return false;
        // }

        int len = flowerbed.length;
        for(int i = 0; i<len; i=i+2){
            if(flowerbed[i] == 0) {
                // 논리 연산자 OR 특성상
                // 첫번쨰 조건을 먼저 확인 후 두번쨰 조건을 확인합니다.
                // 첫번째 조건을 만족하는 경우 두번째 조건을 확인 하지 않고 바로 넘어갑니다.
                // 그래서 원래라면 flowerbed[i+1]에서 마지막 i값이 발생하였을 경우 ArrayIndexOutOfBounds가 발생해야하지만
                // OR 연산자 체크 순서에 의해 그냥 넘어가게 됩니다.
                // 만약  if( flowerbed[i] == flowerbed[i+1] || i == len - 1) 이와 같이
                // 순서를 변경한다면 ArrayIndexOutOfBounds 에러가 발생합니다.
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