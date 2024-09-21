class Solution {
    public boolean isNumber(String s) {
        boolean decimal_used = false, number_seen = false, e_used = false;
        int i = 0;
        
        // Trim any leading or trailing spaces
        s = s.trim();
        
        // Check for optional leading sign (+ or -)
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }
        
        while (i < s.length()) {
            char ch = s.charAt(i);
            
            if (ch == '+' || ch == '-') {
                // Sign not allowed after the first character unless after 'e' or 'E'
                return false;
            } else if (Character.isAlphabetic(ch)) {
                if (ch == 'e' || ch == 'E') {
                    // 'e' or 'E' can only appear once, and only if a number was seen before
                    if (e_used || !number_seen) {
                        return false;
                    }
                    e_used = true;
                    number_seen = false; // Reset number_seen for checking exponent part
                    i++;
                    
                    // Handle sign after 'e' or 'E'
                    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                        i++;
                    }
                    
                    // There must be at least one digit after 'e' or 'E'
                    if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
                        return false;
                    }
                    continue;
                } else {
                    return false; // Any other alphabetic character is invalid
                }
            } else if (ch == '.') {
                // A decimal point is only allowed once and cannot appear after 'e' or 'E'
                if (decimal_used || e_used) {
                    return false;
                }
                decimal_used = true;
            } else if (Character.isDigit(ch)) {
                number_seen = true; // We have seen a valid number
            } else {
                return false; // Any other character is invalid
            }
            
            i++;
        }
        
        // A valid number must have at least one digit
        return number_seen;
    }
}
