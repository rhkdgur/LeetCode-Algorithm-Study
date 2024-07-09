class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> results = new ArrayList<>();

        int len = candies.length;
        for(int i = 0; i<len; i++){
            int a = candies[i] + extraCandies;
            int max = candies[i] + extraCandies;
            for(int j = 0; j<len; j++) {
                if(max < candies[j]){
                    max = candies[j];
                }
            }
            if(max > a){
                results.add(false);
            }else {
                results.add(true);
            }
        }

        return results;
    }
}