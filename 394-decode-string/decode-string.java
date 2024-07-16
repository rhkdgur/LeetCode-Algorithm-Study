class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> stacks = new Stack<>();
        Stack<String> stacks2 = new Stack<>();
        String str = "";

        int n = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                n = (n * 10) + (ch - '0');
            }else if(ch == '['){
                stacks.push(n);
                n = 0;
                stacks2.push(str);
                str = "";
            }else if(ch == ']') {
                int num = stacks.pop();
                String temp = str;
                str = stacks2.pop();
                while(num-- > 0) {
                    str+=temp;
                }
            }else {
                str+=ch;
            }
        } 

        return str;
    }
}