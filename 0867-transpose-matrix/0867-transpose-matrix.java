class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int arr[][]=new int[column][row];
        
        for(int i=0;i<column;i++){
         for(int j=0;j<row;j++){
             
            arr[i][j]=matrix[j][i];
            }}
        
        
        return arr;
    }
}