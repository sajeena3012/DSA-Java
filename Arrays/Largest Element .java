class Compute {
    public int largest(int arr[], int n) {
        int max = arr[0]; // Assume the first element is the largest initially
        for (int i = 1; i < n; i++) { // Start from the second element
            if (arr[i] > max) { // If current element is greater than max
                max = arr[i]; // Update max
            }
        }
        return max; // Return the largest element
    }
}