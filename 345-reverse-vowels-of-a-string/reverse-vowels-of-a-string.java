class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int len = vowels.length();
        StringBuffer reserve = new StringBuffer();
        StringBuffer result = new StringBuffer();

        for(int i = 0; i<s.length(); i++) {
            for(int j=0; j<len; j++) {
                if(vowels.indexOf(s.charAt(i)) > -1) {
                    reserve.append(s.charAt(i));
                    break;
                }
            }
        }

        int j = reserve.length() - 1;
        for(int i = 0; i<s.length(); i++) {
            if(vowels.indexOf(s.charAt(i)) > -1){
                result.append(reserve.charAt(j));
                j--;
            }else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}