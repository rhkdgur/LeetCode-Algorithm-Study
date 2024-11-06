class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(rooms, 0 , visited);
        return visited.size() == rooms.size();
    }

    public void dfs(List<List<Integer>> rooms, int key, Set<Integer> visited) {
        if(visited.contains(key)) {
            return ;
        }

        visited.add(key);

        for(int temp : rooms.get(key)){
            dfs(rooms,temp,visited);
        }
    }
}