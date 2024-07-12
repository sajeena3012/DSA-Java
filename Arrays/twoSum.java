class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the complement and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is already in the hashmap
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // If not found, add the current number and its index to the hashmap
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
