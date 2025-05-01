class Solution {
    
    // Main method to sort the colors in-place using Dutch National Flag algorithm
    public void sortColors(int[] nums) {
        // Pointer for the next position of 0
        int start = 0;
        
        // Pointer for the current element being examined
        int mid = 0;
        
        // Pointer for the next position of 2 (from the end)
        int end = nums.length - 1;

        // Process the array until mid crosses end
        while (mid <= end) {
            // Check the value at nums[mid]
            switch (nums[mid]) {
                
                // Case when current element is 0
                case 0:
                    // Swap current element with element at 'start' index
                    swap(nums, start, mid);
                    
                    // Move both pointers forward
                    start++;
                    mid++;
                    break;

                // Case when current element is 1
                case 1:
                    // 1 is already in the correct middle zone, just move forward
                    mid++;
                    break;

                // Case when current element is 2
                case 2:
                    // Swap current element with element at 'end' index
                    swap(nums, mid, end);
                    
                    // Move only 'end' backward
                    // Do NOT move 'mid' because the swapped value needs to be checked
                    end--;
                    break;
            }
        }
    }

    // Helper method to swap two elements in the array
    public void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
