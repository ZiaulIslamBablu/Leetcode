class Solution {
    public int longestPalindrome(String s) {
        int set [] = new int [128];

        int res =0;
         int oddcount =0;
         for (char ch : s.toCharArray()){
            if (set[ch]!=0){
                res+=2;
                set[ch] =0;
                oddcount--;
            }
            else{
                set[ch] =1;
                oddcount++;
            }
          
            }
              if (oddcount>0){
            res+=1;
         }
         return res;
    }
}