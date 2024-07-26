class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Result list to store Pascal's Triangle
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Base case
        if (numRows == 0) {
            return triangle;
        }
        
        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        // Generate the remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            // First element of the row is always 1
            currentRow.add(1);
            
            // Fill in the middle elements
            for (int j = 1; j < i; j++) {
                int num = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(num);
            }
            
            // Last element of the row is always 1
            currentRow.add(1);
            
            // Add the row to the triangle
            triangle.add(currentRow);
        }
        
        return triangle;
    }
}
