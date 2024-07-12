class Solution {
    public boolean closeStrings(String word1, String word2) {

        // String[] w1 = word1.split("");
        // String[] w2 = word2.split("");

        // Arrays.sort(w1);
        // Arrays.sort(w2);

        // Map<String,Integer> m1 = new HashMap<>();
        // Map<String,Integer> m2 = new HashMap<>();
        // Set<String> s1 = new HashSet<>();
        // Set<String> s2 = new HashSet<>();

        // List<Integer> l1 = new ArrayList<>();
        // List<Integer> l2 = new ArrayList<>();

        // int a = 1;
        // for(int i = 0; i<w1.length; i++) {
        //     s1.add(w1[i]);
        //     m1.put(w1[i],m1.getOrDefault(w1[i],0)+1);
        // }

        // for(int i = 0; i<w2.length; i++) {
        //     s2.add(w2[i]);
        //     m2.put(w2[i],m2.getOrDefault(w2[i],0)+1);
        // }

        // if(s1.size() != s2.size()) {
        //    return false;
        // }

        // for(String s : s1) {
        //     l1.add(m1.get(s));
        //     if(m2.get(s) == null ) {
        //         return false;
        //     }
        // }

        // for(String s : s2) {
        //     l2.add(m2.get(s));
        // }

        // Collections.sort(l1);
        // Collections.sort(l2);
        
        // for(int i = 0; i<l1.size(); i++) {
        // 	if(!l1.get(i).equals(l2.get(i))) {
        // 		return false;
        // 	}
        // }

        // return true;

        if(word1.length() != word2.length()) {
            return false;
        }

        char[] chs1 = new char[26];
        char[] chs2 = new char[26];

        for(char ch : word1.toCharArray()) {
            chs1[ch - 'a']++;
        }
        for(char ch : word2.toCharArray()) {
            chs2[ch - 'a']++;
        }        

        //동일한 알파벳을 가지고 있는가 체크
        for(int i = 0; i<chs1.length; i++) {
            if((chs1[i] == 0 && chs2[i] != 0) || (chs1[i] != 0 && chs2[i] == 0)){
                return false;
            }
        }

        //알파벳 과 상관없이 문자 개수가 동일한지 체크
        Arrays.sort(chs1);
        Arrays.sort(chs2);

        for(int i=0; i<chs1.length; i++) {
            if(chs1[i] != chs2[i]){
                return false;
            }
        }


        return true;
    }
}