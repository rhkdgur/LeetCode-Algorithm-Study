class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();

        String[] sen = senate.split("");
        for(int i=0; i<senate.length(); i++) {
            if(sen[i].equals("R")){
                rad.add(i);
            }else {
                dir.add(i);
            }
        }

        int n = senate.length();
        String win = "";
        while(!rad.isEmpty() && !dir.isEmpty()) {
            if(rad.peek() < dir.peek()) {
                rad.add(n++);
            }else {
                dir.add(n++);
            }
            rad.poll(); 
            dir.poll();
        }

        return !rad.isEmpty() ? "Radiant" : "Dire";
    }
}