class Solution {



    public String gcdOfStrings(String str1, String str2) {
        
        StringBuffer s = new StringBuffer();

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }else {
            int i = str1.length();
            int j = str2.length();
            while(j != 0){
                int temp = j;
                j = i % j;
                i = temp;
            }
            return str1.substring(0,i);
        }
        
    }
}