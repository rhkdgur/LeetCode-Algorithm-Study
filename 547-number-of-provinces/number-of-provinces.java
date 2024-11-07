class Solution {

    
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];

        for(int i = 0; i<isConnected.length; i++) {
            if(!visited[i]) {
                count++;
                checkLink(isConnected, visited, i);
            }
        }

        return count;
    }

    public void checkLink(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;

        for(int j = 0; j<isConnected[i].length; j++) {
            if(isConnected[i][j] == 1 && !visited[j]) {
                checkLink(isConnected, visited, j);
            }
        }
    }
}