class Solution {
    public String reverseOnlyLetters(String S) {
        
        if (S == null || S.length() == 0) return S;
        
        char[] charArray = S.toCharArray();
        
        int low = 0; 
        int high = charArray.length - 1; 
        
        while (low < high) {
            
            while (low < high && !Character.isLetter(charArray[low])) low++;
            while (low < high && !Character.isLetter(charArray[high])) high--;
            
            char tmp = charArray[low];
            charArray[low] = charArray[high];
            charArray[high] = tmp;
            
            low++;
            high--;
        }
        
        return String.valueOf(charArray);
    }
}

// Time complexity | Space complexity
// O(n)            | O(n)