class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        Map<Integer,Integer> map2 = new LinkedHashMap<>();

        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i = 0; i<nums1.length; i++) {
            s1.add(nums1[i]);
        }

        for(int i = 0; i<nums2.length; i++) {
            s2.add(nums2[i]);
        }



        List<Integer> l1 = new ArrayList<>(s1);
        List<Integer> l2 = new ArrayList<>(s2);

        for(int i = 0; i<l1.size(); i++) {
            map.put(l1.get(i),l1.get(i));
        }

        for(int i = 0; i<l2.size(); i++) {
            if(map.get(l2.get(i)) != null){
                s1.remove(l2.get(i));
                s2.remove(l2.get(i));
            }
        }

        l1 = new ArrayList<>(s1);
        l2 = new ArrayList<>(s2);

        result.add(l1);
        result.add(l2);

        return result;
        
    }
}