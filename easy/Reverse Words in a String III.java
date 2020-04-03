class Solution {
    
    public String reverseWords(String s) {
        
        if (s == null || s.length() <= 1) return s;
        
        int n = s.length();
        int idx = 0; 
        int start = 0;
        int curr = 0;
        StringBuilder sb = new StringBuilder();
        
        while (idx <= n) {
            while(idx < n && s.charAt(idx) != ' '){
                idx++;
            }
            
            curr = idx - 1;
            while (curr >= start){
                sb.append(s.charAt(curr--));
            }
            
            if (idx != n) sb.append(" ");
            
            idx++;
            start = idx;
        }
        
        return sb.toString();
    }
}

// Run Time: O(n)
// Space Complexity: O(n)