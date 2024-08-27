class Solution{
    public void rotate(int[][] matrix) {
    int n = matrix.length;

    for (int i = 0; i < (n + 1) / 2; i++) {
        for (int j = 0; j < n / 2; j++) {
            // Start 4-way swaps
            // temp = bottom left
            int temp = matrix[n - 1 - i][j];

            // bottom left = bottom right
            matrix[n - 1 - i][j] = matrix[n - 1 - j][n - 1 - i];

         
