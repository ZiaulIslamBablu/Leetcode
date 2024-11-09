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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0); // Dummy node
        ListNode temp = result;
        
        // Corrected: "while" should be lowercase
        while (list1 != null && list2 != null) {
            // Corrected: Compare the values inside the nodes
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        
        // Attach the remaining part of the list
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        
        return result.next; // Return the merged list starting from result.next
    }
}
