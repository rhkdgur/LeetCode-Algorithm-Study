class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        // 알파벳을 이용하지 않는 방식... 너무 느림...
        // Map 과 Set을 이용한 처리 방법....
        // 확실히 Map 과 Set을 쓰면 느림...
        String[] w1 = word1.split("");
        String[] w2 = word2.split("");

        Map<String,Integer> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();

        int a = 1;
        for(int i = 0; i<w1.length; i++) {
            s1.add(w1[i]);
            m1.put(w1[i],m1.getOrDefault(w1[i],0)+1);
        }

        for(int i = 0; i<w2.length; i++) {
            s2.add(w2[i]);
            m2.put(w2[i],m2.getOrDefault(w2[i],0)+1);
        }

        if(s1.size() != s2.size()) {
           return false;
        }

        int[] l1 = new int[s1.size()];
        int[] l2 = new int[s2.size()];

        // 맵을 쓰면 빠르다고 하지만,... 역시 느리긴함..
        int i = 0;
        for(String s : s1) {
            if(m2.get(s) == null ) {
                return false;
            }
            l1[i] = (int)m1.get(s);
            l2[i] = (int)m2.get(s); 
            i++;
        }

        Arrays.sort(l1);
        Arrays.sort(l2);
        
        for(i = 0; i<l1.length; i++) {
        	if(l1[i] != l2[i]) {
        		return false;
        	}
        }

        return true;

        // 알파벳을 이용한 처리 방법....
        // 확실히 배열 만 사용해서 그런지 빠름
        // 반복문이 4번 사용됨

        // if(word1.length() != word2.length()) {
        //     return false;
        // }

        // char[] chs1 = new char[26];
        // char[] chs2 = new char[26];

        // for(char ch : word1.toCharArray()) {
        //     chs1[ch - 'a']++;
        // }
        // for(char ch : word2.toCharArray()) {
        //     chs2[ch - 'a']++;
        // }        

        // //동일한 알파벳을 가지고 있는가 체크
        // for(int i = 0; i<chs1.length; i++) {
        //     if((chs1[i] == 0 && chs2[i] != 0) || (chs1[i] != 0 && chs2[i] == 0)){
        //         return false;
        //     }
        // }

        // //알파벳 과 상관없이 문자 개수가 동일한지 체크
        // Arrays.sort(chs1);
        // Arrays.sort(chs2);

        // for(int i=0; i<chs1.length; i++) {
        //     if(chs1[i] != chs2[i]){
        //         return false;
        //     }
        // }


        // return true;
    }
}