class Solution {

    // Function to rotate a given n x n matrix 90 degrees clockwise
    static void rotate(int[][] matrix) {
        int n = matrix.length; // Get the size of the matrix (n x n)
        
        // Step 1: Transpose the matrix. Swap elements symmetrically along the diagonal.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row to get the 90-degree rotation effect.
        int start = 0; // Starting index for the columns
        int end = n - 1; // Ending index for the columns
        while (start <= end) {
            // Iterate over each row and swap the elements at the start and end indices
            for (int row = 0; row < matrix.length; row++) {
                // Swap elements at the 'start' and 'end' indices in the row
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
            }
            // Move the pointers closer to the center after each pass
            start++;
            end--;
        }
    }

    // Function to check if two matrices are identical
    static boolean check(int[][] matrix, int[][] target) {
        // Iterate through each element of the matrices
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // If any element doesn't match, return false
                if (matrix[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        // If all elements match, the matrices are identical
        return true;
    }

    // Main function to determine if one matrix can be rotated to match another
    public boolean findRotation(int[][] mat, int[][] target) {
        // Attempt up to 4 rotations (0, 90, 180, and 270 degrees)
        for (int i = 0; i < 4; i++) {
            // Check if the current matrix matches the target
            if (check(mat, target)) {
                return true; // Return true if they are identical
            }
            // Rotate the matrix by 90 degrees clockwise
            rotate(mat);
        }
        // If none of the rotations match the target, return false
        return false;
    }
}
