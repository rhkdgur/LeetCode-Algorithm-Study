class Solution {
    public String reverseWords(String s) {
        
        char[] chs = s.toCharArray();
        StringBuffer str = new StringBuffer();

        int first = 0;
        int last = 0;
        int len = s.length();
        for(int i = 0; i<len; i++){ 
            if(chs[i] == ' '){
                first++;
            }else {
                break;
            }
        }
        for(int i = len-1; i>=0; i--) {
            if(chs[i] == ' '){
                last++;
            }else {
                break;
            }
        }

        String temp = s.substring(first,len - last);
        String[] values = temp.split(" ");
        len = values.length;

        Stack<String> stacks = new Stack();
        for(int i = 0; i<len; i++) {
            stacks.push(values[i]);
        }

        for(int i = 0; i<len; i++) {
            String pop = stacks.pop();
            if(!pop.isEmpty()){
                str.append(pop).append(" ");
            }
        }

        return str.toString().substring(0,str.length() - 1);
    }
}