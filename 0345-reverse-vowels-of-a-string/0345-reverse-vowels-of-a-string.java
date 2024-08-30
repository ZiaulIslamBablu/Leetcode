class Solution {
    public Boolean isvowel(char ch){
       if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ) {
           return true;
       }
        return false;
        
    }
    public String reverseVowels(String s) {
    char[] ch1 = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (!isvowel(ch1[i])){
                i++;
            }
            else if (!isvowel(ch1[j])){
                j--;
            }
            else{
                char temp  = ch1[i];
                ch1[i] = ch1[j];
                ch1[j] = temp;
                i++;
                j--;
                
                
            }
        }
        return new String (ch1);
    }
}