class Solution {
    int print2largest(int arr[], int n) {
        // If there are less than 2 elements, return -1
        if (n < 2) {
            return -1;
        }

        // Initialize the first and second largest elements
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Traverse the array to find the first and second largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        // If second largest element doesn't exist, return -1
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}