class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int len = 0;
        for(Integer key : map.keySet()) {
            s.add(map.get(key));
            len++;
        }

        return s.size() == len ? true : false;
    }
}