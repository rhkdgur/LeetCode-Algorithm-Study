class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int len = candies.length;
        boolean flag = true;
        for(int i = 0; i<len; i++) {
            flag = true;
            int max = candies[i]+extraCandies;
            for(int j = 0; j<len; j++) {
                if(max < candies[j]) {
                    flag = false;
                    break;
                }
            }
            result.add(flag);
        }

        return result;
    }
}