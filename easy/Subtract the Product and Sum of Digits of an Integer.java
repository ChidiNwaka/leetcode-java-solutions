class Solution {
    public int subtractProductAndSum(int n) {
        
        if (n < 10) return 0;
        
        int multiple = 1;
        int sum = 0; 
        int reminder = 0;
        
        while (n > 0 ){
            
            reminder = n % 10;
            
            multiple *= reminder;
            sum += reminder;

            n /= 10;
            
            
        }
        
        return multiple - sum;
    }
}