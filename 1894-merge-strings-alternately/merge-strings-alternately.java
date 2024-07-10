class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuffer str = new StringBuffer();
        int len1 = word1.length();
        int len2 = word2.length();
        
        // Runtime 2ms Beats 33.12% 
        // Memory 42.11 MB Beats 31.06%

        // for(int i = 0; i<len1; i++) {
        //     str.append(word1.charAt(i)+"");
        //     if(i < len2) {
        //         str.append(word2.charAt(i)+"");
        //     }
        // }

        // if(len1 < len2) {
        //     for(int i = len1; i<len2; i++) {
        //         str.append(word2.charAt(i)+"");
        //     }
        // }

        int index = 0;
        while(index < len1 || index < len2) {

            if(index < len1) {
                str.append(word1.charAt(index));
            } 
            if(index < len2) {
                str.append(word2.charAt(index));
            }
            index++;
        }

        return str.toString();
    }
}