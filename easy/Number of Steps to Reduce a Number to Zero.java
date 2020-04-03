
class Solution {
    public int numberOfSteps (int num) {
        
        int steps = 0;
        
        if (num == 0) return 0;
        if (num < 2) return 1;
        
        while (num > 0){
            
            if (num % 2 != 0 ){
                steps++;
                num -= 1;
            }
            
            if (num > 0){
                steps++;
                num /=2;
            }
        }
        
        return steps;
        
    }
}

