class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns
        int startrow = 0;
        int endrow = n - 1;
        int startcol = 0;
        int endcol = m - 1;
        
        while (startrow <= endrow && startcol <= endcol) {
            // Traverse the first row from left to right
            for (int j = startcol; j <= endcol; j++) {
                result.add(matrix[startrow][j]);
            }
            startrow++; // Move the top boundary down
            
            // Traverse the rightmost column from top to bottom
            for (int i = startrow; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }
            endcol--; // Move the right boundary left
            
            // Traverse the bottom row from right to left, if we haven't crossed the row boundary
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    result.add(matrix[endrow][j]);
                }
                endrow--; // Move the bottom boundary up
            }
            
            // Traverse the leftmost column from bottom to top, if we haven't crossed the column boundary
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    result.add(matrix[i][startcol]);
                }
                startcol++; // Move the left boundary right
            }
        }
        
        return result;
    }}