class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> stacks = new Stack<>();
        Stack<StringBuffer> stacks2 = new Stack<>();
        StringBuffer str = new StringBuffer();

        int n = 0;
        for(char ch : s.toCharArray()) {
            // 숫자가 나오는 경우
            if(Character.isDigit(ch)) {
                // 100이라는 숫자일 경우에 대한 대비
                n = n*10 + (ch - '0');
            }else if(ch == '[') {
                stacks.push(n);
                n = 0;
                stacks2.push(str);
                str = new StringBuffer();
            }else if(ch == ']') {
                int num = stacks.pop();
                StringBuffer temp = str;
                str = stacks2.pop();
                while(num-- > 0) {
                    str.append(temp);
                }
            }else {
                str.append(ch);
            }
        }

        return str.toString();

    }
}