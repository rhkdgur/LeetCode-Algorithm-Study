class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        int len = 0;
        for(Integer key : map.keySet()) {
            s.add(map.get(key));
            len++;
        }

        return s.size() == len ? true : false;
    }
}