class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int len = t.length();
        int len2 = s.length();

        //s가 공백이면 무조건 true
        if(s.length() < 1){
            return true;
        }

        int a = 0;
        for(int i = 0; i<len; i++ ){
            // two point를 이용한 방식으로
            // s 의 단어가 t의 단어와 일치한다면 a++ 증감을 통해 s의 다음 단어를 비교합니다.
            // 이중 for문이 아니기 때문에 한번씩 증감이 발생하게 됩니다.
            // s의 단어별로 어느 위치에 상관없이 순서대로만 존재하면 되는 상황
            if(s.charAt(a) == t.charAt(i)){
                a++;
            }

            //a값이 len2와 같다는 것은 s 문자열 모양대로 들어가 있다는 것이므로, true
            if(a == len2) {
                return true;
            }
        }

        return false;
    }
}