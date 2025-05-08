class Solution {
    public int maxArea(int[] height) {
        int left = 0;                          // Start pointer from the beginning
        int right = height.length - 1;         // Start pointer from the end
        int maxwater = 0;                      // Variable to store the maximum area

        while (left < right) {
            // Calculate the height as the minimum of the two lines
            // and width as the distance between them (right - left)
            int area = Math.min(height[left], height[right]) * (right - left);

            // Update the maxwater if the current area is larger
            maxwater = Math.max(area, maxwater);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxwater;  // Return the maximum water container area
    }
}
