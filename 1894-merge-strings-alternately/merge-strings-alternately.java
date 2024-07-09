class Solution {
    public String mergeAlternately(String word1, String word2) {
        String[] w1 = word1.split("");
        String[] w2 = word2.split("");
        StringBuffer str = new StringBuffer();

        for(int i = 0; i<w1.length; i++){
            str.append(w1[i]);
            if(i < w2.length){
                str.append(w2[i]);
            }
        } 

        if(w2.length > w1.length) {
            for(int i = w1.length; i<w2.length; i++){
                 str.append(w2[i]);
            }
        }

        return str.toString();
    }
}