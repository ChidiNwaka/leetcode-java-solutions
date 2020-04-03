class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i])){
                if (Math.abs(i - hm.get(nums[i])) <= k) return true;
                else hm.put(nums[i], i);
            } else {
                hm.put(nums[i], i);
            }
        }
        
        return false;
        
    }
}


// Time complexity: O(n)
// Space complexity: O(n)