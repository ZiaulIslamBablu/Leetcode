class Solution {
    public int[][] generateMatrix(int n) {
    int matrix[][]= new int [n][n];
        int startrow = 0;
        int endrow = n-1;
        int startcol = 0;
        int endcol= n-1;
        int value =1;
        
    while(startrow<=endrow && startcol<=endcol){
        //fill first row
        
        for (int j = startcol; j<=endcol; j++){
            matrix[startrow][j] = value;
            value+=1;
        }
        
        startrow+=1;
        //fill end column
        
        for (int i = startrow; i<=endrow; i++){
            matrix [i][endcol] =value;
            value+=1;
        }
        endcol-=1;
        
        if(startrow<=endrow){
            
             //fill last row
        
        for (int j = endcol; j>=startcol; j--){
            matrix [endrow][j] =value;
            value+=1;
        }
            endrow-=1;  
        }
        
        if(startcol<=endcol){
            
             //fill first column
    
        for (int i = endrow; i>=startrow; i--){
            matrix [i][startcol] =value;
            value+=1;
        }
            startcol+=1;
            
        }
        
        
        
        
        
    }
     return matrix;   
        
    }
}