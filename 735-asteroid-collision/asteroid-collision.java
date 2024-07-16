class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stacks = new Stack<>();

        for(int asteroid : asteroids) {
            boolean flag = true;
            if(!stacks.isEmpty()) {
                while(!stacks.isEmpty() && asteroid < 0 && stacks.peek() > 0) {
                    if(stacks.peek() == Math.abs(asteroid)) {
                        stacks.pop();
                        flag = false;
                    }else if(stacks.peek() < Math.abs(asteroid)) {
                        stacks.pop();
                        continue;
                    }else {
                        flag = false;    
                    }
                    break;
                }
            }
            if(flag) {
                stacks.push(asteroid);
            }
        }

        int[] arr = new int[stacks.size()];
        for(int i = stacks.size()-1; i>=0; i--) {
            arr[i] = stacks.peek();
            stacks.pop();
        }

        return arr;
    }
}