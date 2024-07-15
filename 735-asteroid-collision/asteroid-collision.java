class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stacks = new Stack<>();

        boolean flag = true;
        for(int asteroid : asteroids) {
            flag = true;
            // 소행성이 서로 같은 뱡향이면 무시한다했기 때문에
            // 음수인 경우에만 비교를 하여 처리합니다. 음수를 기준으로 할지 양수를 기준으로 할지는 자유
            // stack에 값이 존재하면서 소행성이 음수이고 stack에 양수가 들어있을 경우 입니다.
            while(!stacks.isEmpty() && asteroid < 0 && stacks.peek() > 0) {
                // 절대값을 적용하여 크기를 비교
                // 만약 서로 같다면 같이 파괴가 됩니다.
                // 서로 파괴된 경우는 while문을 빠져나옵니다. asteroid도 부서졌기 때문
                if(stacks.peek() == Math.abs(asteroid)){
                    stacks.pop();
                // 만약 stack peek값이 작다면 peek값이 파괴됩니다.
                // asteroid가 이겼으니 다음을 넘어갑니다.
                // continue를 주는 이유는 stack에 값이 없을 경우 
                // 현재 asteroid값을 넣어주기 위해서 입니다.
                }else if(stacks.peek() < Math.abs(asteroid)){
                    stacks.pop();
                    continue;
                }
                flag = false;
                break;
            }

            if(flag){
                stacks.push(asteroid);
            }

        }

        int[] result = new int[stacks.size()];
        for(int i = stacks.size() - 1; i>=0; i-- ){
            result[i] = stacks.pop();
        }


        return result;

    }
}