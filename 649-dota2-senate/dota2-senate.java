class Solution {
    public String predictPartyVictory(String senate) {

        //Radiant를 담는 큐
        Queue<Integer> rad = new LinkedList<>();
        //Dire를 담는 큐
        Queue<Integer> dir = new LinkedList<>();

        //큐에 담을떄는 각각의 라운드를 담습니다.
        //라운드 기준으로 앞에 존재하는 경우 우선건을 가지기 때문에
        //라운드가 낮을수록 유리합니다.
        //ex) RDD -> R [0], DD[1,2] index 값을 가지게 됩니다.
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

        //각각 큐에 값이 안남을 때까지 돌립니다.
        while(!rad.isEmpty() && !dir.isEmpty()) {
            //rad.push 하는 이유 각각의 큐값이 index 이슈가 발생하지 않게 하기 위함
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