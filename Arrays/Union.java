class Solution {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        
        // Merge two arrays while removing duplicates
        while(i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                addIfNotDuplicate(union, arr1[i]);
                i++;
            } else if(arr1[i] > arr2[j]) {
                addIfNotDuplicate(union, arr2[j]);
                j++;
            } else {
                addIfNotDuplicate(union, arr1[i]);
                i++;
                j++;
            }
        }
        
        // Add remaining elements of arr1
        while(i < n) {
            addIfNotDuplicate(union, arr1[i]);
            i++;
        }
        
        // Add remaining elements of arr2
        while(j < m) {
            addIfNotDuplicate(union, arr2[j]);
            j++;
        }
        
        return union;
    }
    
    // Helper method to add elements to the union list if not already the last element
    private static void addIfNotDuplicate(ArrayList<Integer> union, int value) {
        if(union.isEmpty() || union.get(union.size() - 1) != value) {
            union.add(value);
        }
    }
}
