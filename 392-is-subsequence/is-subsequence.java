class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int len = t.length();

        if(s.length() < 1) {
            return true;
        }

        int a = 0;
        for(int i = 0; i<len; i++) {
            if(s.charAt(a) == t.charAt(i)){
                a++;
            }
            if(a == s.length()) {
                return true;
            }
        }

        return false;
    }
}