import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Step 1: Create a Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 2: Add first k elements to the heap
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }

        // Step 3: Traverse the rest of the array
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }

        // Step 4: Top of the heap is the kth largest
        return minHeap.peek();
    }
}
