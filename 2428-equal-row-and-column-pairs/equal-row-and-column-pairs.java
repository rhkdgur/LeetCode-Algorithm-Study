class Solution {
    public int equalPairs(int[][] grid) {
        
        int answer = 0; 

        Map<String,Integer> map = new HashMap<>();

        // stringBuilder 를 이용하여 가로 값과 세로값을 비교하여 Map에 들어있는 값과 같을 경우
        // cnt를 더하여 처리하는 방법
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