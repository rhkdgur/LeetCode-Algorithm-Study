class Solution {
    public String removeStars(String s) {
        
        char[] chs = s.toCharArray();
        int len = chs.length;
        Stack<String> stacks = new Stack<>();
        StringBuffer result = new StringBuffer();

        for(int i=0; i<len; i++) {
            stacks.push(chs[i]+"");
        }
        
        int cnt = 0;
        for(int i = 0; i<len; i++){
            String data = stacks.pop();
            if(data.equals("*")) {
                cnt++;
            }else {
                if(cnt > 0) {
                    cnt--;
                }else {
                    result.insert(0,data);
                }
            }
        }

        return result.toString();
        
    }
}