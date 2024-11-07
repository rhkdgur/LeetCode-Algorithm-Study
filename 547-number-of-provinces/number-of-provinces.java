class Solution {

    int count = 0;
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        for(int i = 0; i<isConnected.length; i++) {
            if(!visited[i]){
                count++;
                DFS(isConnected, visited, i);
            }
        }
        return count;
    }

    public void DFS(int [][] isConnected, boolean[] visited, int i) {
        visited[i] = true;

        for(int j = 0; j<isConnected[i].length; j++) {
            if(isConnected[i][j] == 1 && !visited[j]){
                DFS(isConnected, visited, j);
            }
        }
    }
}