class RecentCounter {

    Queue<Integer> que;

    public RecentCounter() {
        que = new LinkedList<>();
    }
    
    public int ping(int t) {
        que.add(t);
        //제일 마지막 시간 기준으로 3000ms 범위 내에 존재해야함
        //그래서 제일 처음에 들어온 값부터 시작하여 범위가 잘리게됨
        while(que.peek() < t-3000) {
            que.poll();
        }
        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */