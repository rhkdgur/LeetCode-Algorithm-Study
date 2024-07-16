class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        String[] sen = senate.split("");
        for(int i=0; i<senate.length(); i++) {
            if(sen[i].equals("R")){
                que.add(i);
            }else {
                que2.add(i);
            }
        }

        int n = senate.length();
        while(!que.isEmpty() && !que2.isEmpty()) {
            if(que.peek() < que2.peek()) {
                que.add(n++);
            }else {
                que2.add(n++);
            }
            que.poll(); 
            que2.poll();
        }

        return !que.isEmpty() ? "Radiant" : "Dire";
    }
}