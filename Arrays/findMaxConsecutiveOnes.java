class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // To store the maximum number of consecutive 1s
        int currentCount = 0;  // To store the current number of consecutive 1s
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;  // Increment current count of consecutive 1s
                maxCount = Math.max(maxCount, currentCount);  // Update max count if current count is greater
            } else {
                currentCount = 0;  // Reset current count when encountering 0
            }
        }
        
        return maxCount;
    }
}
