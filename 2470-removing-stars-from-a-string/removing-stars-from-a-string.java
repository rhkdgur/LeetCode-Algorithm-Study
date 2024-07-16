class Solution {
    public String removeStars(String s) {
        
        Stack<String> stacks = new Stack<>();
        StringBuffer result = new StringBuffer();

        int cnt = 0;
        for(char ch : s.toCharArray()) {
            if(!stacks.isEmpty()) {
                if(ch != '*'){ 
                    stacks.push(ch+"");
                }else {
                    stacks.pop();
                }
            }else {
                stacks.push(ch+"");
            }
        }

        String[] arr = new String[stacks.size()];
        arr = stacks.toArray(arr);

        for(int i = 0; i<arr.length; i++){
            result.append(arr[i]);
        }

        return result.toString();
    }
}