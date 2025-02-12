class Solution {
    public int[] applyOperations(int[] nums) {
        // Step 1: Apply the operation
        for (int i = 0; i < nums.length - 1; i++) { // Fix: i < nums.length - 1 to prevent out-of-bounds
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Shift non-zero elements to the left
        int m = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[m] = nums[j];
                m++;
            }
        }

        // Step 3: Fill remaining elements with 0
        while (m < nums.length) {
            nums[m++] = 0;
        }

        return nums;
    }
}
