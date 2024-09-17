class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Step 1: Trim leading and trailing spaces
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        // Step 2: Initialize sign and result variables
        int sign = 1;
        int ans = 0;
        int i = 0;
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

        // Step 3: Handle optional '+' or '-' sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Step 4: Convert string to integer, digit by digit
        while (i < s.length()) {
            char c = s.charAt(i);

            // If the current character is not a digit, stop processing
            if (!Character.isDigit(c)) {
                break;
            }

            // Convert the character to an integer (subtracting '0')
            int digit = c - '0';

            // Check for overflow before updating ans
           // if (ans > (MAX - digit) / 10) {
             //   return sign == 1 ? MAX : MIN;
           // }


if (ans > (MAX - digit) / 10) {
    if (sign == 1) {
        return MAX;
    } else {
        return MIN;
    }
}

            // Update ans
            ans = ans * 10 + digit;
            i++;
        }

        // Step 5: Return the final result with the correct sign
        return ans * sign;
    }
}
