/*
M = 1000
CM = 900 // 1000(M) - 100(C)  
D = 500
CD = 400
C = 100
XC = 90
L = 50
XL = 40
X = 10
IX = 9
V = 5
IV = 4 
I = 1  
*/
class Solution {
    public String intToRoman(int num) {
        String [] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int [] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder ss = new StringBuilder();
        for (int i=0; i<code.length; i++){
            while(num >= value[i]){
                ss.append(code[i]);
                num-=value[i];
            }
        }
        return ss.toString();
    } 
}