class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuffer str = new StringBuffer();
        int len1 = word1.length();
        int len2 = word2.length();

        for(int i = 0; i<len1; i++) {
            str.append(word1.charAt(i)+"");
            if(i < len2) {
                str.append(word2.charAt(i)+"");
            }
        }

        if(len1 < len2) {
            for(int i = len1; i<len2; i++) {
                str.append(word2.charAt(i)+"");
            }
        }

        return str.toString();
    }
}