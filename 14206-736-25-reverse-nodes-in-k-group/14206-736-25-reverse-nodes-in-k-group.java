/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        // Count the total number of nodes
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        temp = dummy; // Reset temp to the dummy node
        while (temp.next != null) {
            if (count < k) break; // If fewer than k nodes left, break

            // Reverse k nodes
            int nodes = k - 1;
            ListNode tempNext = temp.next;
            ListNode first = temp.next;
            ListNode second = first.next;
            while (nodes-- > 0) {
                ListNode next1 = second.next;
                second.next = first;
                first = second;
                second = next1;
            }

            // Adjust pointers after reversing
            count -= k;
            temp.next = first;
            tempNext.next = second;
            temp = tempNext; // Move to the next group
        }

        return dummy.next;
    }
}
