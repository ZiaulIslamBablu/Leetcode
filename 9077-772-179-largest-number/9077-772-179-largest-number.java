import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] elements = new String[n];

        for (int i = 0; i < n; i++) {
            elements[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(elements, new Comparator<String>() {
            public int compare(String a, String b) {
                String first = a + b;
                String second = b + a;
                return second.compareTo(first); // Descending order
            }
        });

        if (elements[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String val : elements) {
            sb.append(val);
        }

        return sb.toString();
    }
}
