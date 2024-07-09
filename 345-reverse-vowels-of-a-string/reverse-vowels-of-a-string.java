class Solution {
    public String reverseVowels(String s) {
        String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};
        String[] values = s.split("");
        StringBuffer str = new StringBuffer();

        int len = values.length;
        int len2 = vowels.length;

        Stack<String> stacks = new Stack();

        for(int i = 0; i<len; i++) {
            for(int j = 0; j<len2; j++){
                if(values[i].equals(vowels[j])){
                    stacks.push(values[i]);
                    values[i] = "";
                    break;
                }
            }
        }

        int index = 0;
        for(int i = 0; i<len; i++){
            if("".equals(values[i])){
                str.append(stacks.pop());
                index++;
            }else {
                str.append(values[i]);
            }
        }

        return str.toString();
    }
}