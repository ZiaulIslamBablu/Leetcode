class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int criclesandwish =0;
            int squaresandwish = 0;
            
            for (int c : students){
                    if (c==0){
                          criclesandwish++;  
                    }
                    else{
                         squaresandwish ++;   
                    }
            }
            
            
            for (int sandwish1: sandwiches ){
                    if (sandwish1==0 && criclesandwish ==0){
                            return squaresandwish;
                    }
                     if (sandwish1==1 && squaresandwish ==0){
                            return  criclesandwish;
                    }
                    if (sandwish1==0){
                             criclesandwish--;
                            
                    }
                    else{
                            squaresandwish --;
                    }
            }
            return 0;
    }
}