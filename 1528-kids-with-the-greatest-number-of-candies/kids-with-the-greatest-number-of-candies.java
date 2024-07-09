class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> results = new ArrayList<>();

        for(int i = 0; i<candies.length; i++){
            int a = candies[i] + extraCandies;
            int max = candies[i] + extraCandies;
            for(int j = 0; j<candies.length; j++) {
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