public void rotate(int[] nums, int k) {
    k %= nums.length; // Ensure k is within the bounds of the array length.
    reverse(nums, 0, nums.length - 1); // Reverse the entire array.
    reverse(nums, 0, k - 1); // Reverse the first k elements.
    reverse(nums, k, nums.length - 1); // Reverse the remaining elements.
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
