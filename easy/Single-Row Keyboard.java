class Solution {
    public int calculateTime(String keyboard, String word) {
        
       HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for (int i = 0; i < keyboard.length(); i++) {
            hm.put(keyboard.charAt(i), i);
        }
        
        int total = 0;
        int charPosition = 0; 
        
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            total += Math.abs(hm.get(ch) - charPosition);
            charPosition = hm.get(ch);
        }
        
        return total;
        
    }
}