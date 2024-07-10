class Solution {
    public String gcdOfStrings(String str1, String str2) {

        StringBuilder str = new StringBuilder();
        //최대 공약수를 구하는 문제
        // str 과 str2 를 앞으로 뒤로해서 더해도 동일하다면, 반복되는 값이라는 것
        // 그렇다면 str과 str2간의 최대 공약수를 구할 수가 있다.
        // 그러기 위해서 어차피 둘다 앞 해서 더하거나 뒤에서 더하거나 동일하기에 길이로 해서 구할 수가 있다.
        // while문을 통해 str2 길이와 str1의 길이의 최대 공약수를 구한다면, 
        // 문자의 공통으로 제일 작은 값을 구할 수 있음
        if((str1+str2).equals(str2+str1)) {
            int len1 = str1.length();
            int len2 = str2.length();

            while(len2 != 0) {
                int temp = len2;
                len2 = len1 % len2;
                len1 = temp;
            }
            str.append(str1.substring(0,len1));
        }

        return str.toString();
    }
}