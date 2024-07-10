class Solution {
    public String gcdOfStrings(String str1, String str2) {

        StringBuilder str = new StringBuilder();
        
        if((str1+str2).equals(str2+str1)) {
            int len1 = str1.length();
            int len2 = str2.length();

            //최대 공약수를 구하라
            //str1
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