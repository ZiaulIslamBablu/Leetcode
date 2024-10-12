class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; // Get the length of the matrix (number of rows)

        // Perform the rotation
        for (int i = 0; i < (n + 1) / 2; i++) { // Loop over the layers
            for (int j = 0; j < n / 2; j++) { // Loop through the elements in the layer
                // Save the top element
                int temp = matrix[i][j];
                
                // Move the left element to the top
                matrix[i][j] = matrix[n - 1 - j][i];
                
                // Move the bottom element to the left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                
                // Move the right element to the bottom
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                
                // Move the saved top element to the right
                matrix[j][n - 1 - i] = temp;
            }
        }
    }
}
