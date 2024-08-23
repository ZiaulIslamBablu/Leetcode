class Solution {
    public int roman (char ch){
        switch (ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
        
        
    }
    public int romanToInt(String s) {
         int sum = 0;
        int n = s.length();
        for (int i =0; i<n; i++){
            char ch1 = s.charAt(i);
            if ((i+1)<n && roman(ch1)<roman(s.charAt(i+1))){
                sum = sum-roman(ch1);
            }
            else{
                sum = sum + roman(ch1);
            }
            
        }
        return sum;
    }
}