class Solution {
    public int equalPairs(int[][] grid) {
        
        int answer = 0; 

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i<grid.length; i++) {
            StringBuilder arr = new StringBuilder();
            for(int j = 0; j<grid[i].length; j++){
                arr.append(grid[i][j]+",");
            }
            map.put(arr.toString(), map.getOrDefault(arr.toString(),0)+1);
        }

        for(int i = 0; i<grid.length; i++) {
            StringBuilder arr = new StringBuilder();
            for(int j = 0; j<grid[i].length; j++){
                arr.append(grid[j][i]+",");
            }
            answer += map.getOrDefault(arr.toString(),0);
        }

        return answer;
    }
}