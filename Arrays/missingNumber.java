class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Expected sum of numbers from 0 to n
        int actualSum = 0;
        
        // Calculate the sum of elements in the array
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected sum and the actual sum
        return totalSum - actualSum;
    }
}
