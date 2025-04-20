class Solution {

    // check if a character is alphanumeric
    public boolean isAlphanumeric(char ch) {
        return (ch >= '0' && ch <= '9') || 
               (ch >= 'a' && ch <= 'z') || 
               (ch >= 'A' && ch <= 'Z');
    }

    public boolean isPalindrome(String s) {
   
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
       
            if (!isAlphanumeric(s.charAt(start))) {
                start++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(end))) {
                end--;
                continue;
            }

      
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
