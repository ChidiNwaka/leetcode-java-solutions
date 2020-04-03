class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] res = new int[A.length];
        int count = 0;
        
        for (int i = 0; i < B.length; i++) {
            hm.put(B[i], i);
        }
        
        for (int i = 0; i < A.length; i++) {
            res[count++] = hm.get(A[i]);
        }
        
        return res;
        
    }
}


// Time complexity: O(A)
// Space complexity: O(A)