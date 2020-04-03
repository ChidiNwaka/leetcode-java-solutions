class Solution {
    public void sortColors(int[] nums) {
        
        if (nums == null || nums.length == 0) return;
        
        int low = 0; 
        int mid = 0; 
        int high = nums.length - 1;
        
        while (mid <= high) {
            
            if (nums[mid] == 0) {
                nums = swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) mid++;
            else if (nums[mid] == 2) {
                nums = swap(nums, mid, high);
                high--;
            }
        }
    }
    
    public int[] swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        
        return nums;
    }
}
