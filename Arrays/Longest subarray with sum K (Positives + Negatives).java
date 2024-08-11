class Solution {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // HashMap to store (prefixSum, index)
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < N; i++) {
            prefixSum += A[i];

            // Check if the prefix sum equals K
            if (prefixSum == K) {
                maxLength = i + 1; // Update max length if a sub-array starts from index 0
            }

            // If (prefixSum - K) exists in the map, calculate the length of the sub-array
            if (map.containsKey(prefixSum - K)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum - K));
            }

            // Add the prefix sum to the map if it doesn't exist
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
