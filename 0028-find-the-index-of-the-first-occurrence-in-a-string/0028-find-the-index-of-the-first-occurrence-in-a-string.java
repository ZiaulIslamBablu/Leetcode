class Solution {
    public static boolean compare(String h, String n, int i) {
        int a = h.length();
        int b = n.length();
        for (int k = 0; k < b; k++) {
            if (i >= a) return false;
            if (h.charAt(i++) != n.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        // If the needle is empty, return 0
        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
