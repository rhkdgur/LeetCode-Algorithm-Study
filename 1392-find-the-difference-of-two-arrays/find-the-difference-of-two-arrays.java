class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i = 0; i<nums1.length; i++) {
            s1.add(nums1[i]);
        }

        for(int i = 0; i<nums2.length; i++) {
            s2.add(nums2[i]);
        }

        HashSet<Integer> temp = new HashSet<>(s1);

        s1.removeAll(s2);
        s2.removeAll(temp);

        List<Integer> l1 = new ArrayList<>(s1);
        List<Integer> l2 = new ArrayList<>(s2);

        result.add(l1);
        result.add(l2);

        return result;
        
    }
}