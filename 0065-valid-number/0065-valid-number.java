class Solution {
    public boolean isNumber(String s) {
        boolean decimal_used = false, number_seen = false, e_used = false;

        int i = 0;

        // Check for optional leading sign (+ or -)
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }

        // Iterate through the string
        while (i < s.length()) {
            char ch = s.charAt(i);

            // If there's another sign (+ or -) after the first character, it's invalid
            if (ch == '+' || ch == '-') {
                return false;
            }
            // Handle alphabetic characters (checking for 'e' or 'E')
            else if (Character.isAlphabetic(ch)) {
                if (ch == 'e' || ch == 'E') {
                    // 'e' or 'E' must come after a number and can't be repeated
                    if (!number_seen || e_used) {
                        return false;
                    }
                    e_used = true;
                    number_seen = false; // Reset number_seen to check the exponent part
                    i++;
                    
                    // After 'e' or 'E', there can be an optional sign (+ or -)
                    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                        i++;
                    }
                    
                    // After 'e' or 'E', there must be at least one digit
                    if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
                        return false;
                    }
                    continue; // Continue checking after 'e' or 'E'
                } else {
                    return false; // Any other alphabetic character is invalid
                }
            }
            // Handle decimal point ('.')
            else if (ch == '.') {
                // Decimal point can only appear once and not after 'e' or 'E'
                if (decimal_used || e_used) {
                    return false;
                }
                decimal_used = true;
            }
            // Handle digits
            else if (Character.isDigit(ch)) {
                number_seen = true;
            }
            // Invalid characters
            else {
                return false;
            }

            i++;
        }

        // The string must contain at least one valid number
        return number_seen;
    }

    // Helper method to check if the part after 'e' or 'E' is a valid number
    public static boolean isValidnum(String s, int index) {
        boolean isno = false;

        // Handle optional sign after 'e' or 'E'
        if (index < s.length()) {
            char ch = s.charAt(index);
            if (ch == '+' || ch == '-') {
                index++;
            }
        }

        // Check if the remaining characters are digits
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (!Character.isDigit(ch)) {
                return false; // Non-digit character after 'e' or 'E'
            } else {
                isno = true;
            }
            index++;
        }

        return isno; // Return true if there was at least one digit
    }
}
