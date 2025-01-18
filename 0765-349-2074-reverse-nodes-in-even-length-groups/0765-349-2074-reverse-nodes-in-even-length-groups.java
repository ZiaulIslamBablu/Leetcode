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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int gn = 0,elementinpregroup =0;
        ListNode curr = head;
        ListNode lastofevengroup = null;
        ListNode lastofpreviousgroup = null;
        while (curr!=null){
                gn++;
                if (gn %2==0){
                  elementinpregroup =  rev(lastofpreviousgroup, curr, gn);
                  lastofevengroup= curr;
                    curr = curr.next;

                }
                else{
                    int k = gn;
                    elementinpregroup =0;
                        while(curr!=null && k>0){
                            lastofpreviousgroup = curr;
                            curr = curr.next;
                            k--;elementinpregroup ++;
                        }
                }
        }
        if (gn % 2 == 1 && elementinpregroup %2==0 ){
            rev(lastofevengroup, lastofevengroup.next, elementinpregroup);
        }
        else if(gn % 2 == 0 && elementinpregroup %2==1){
rev(lastofpreviousgroup, lastofpreviousgroup.next,elementinpregroup );
        }
        return head;
    }
    private int rev (ListNode last, ListNode headofgroup, int n){
        ListNode pre = null;
        ListNode curr = headofgroup;
        ListNode next = curr.next;
        int count =0;

        while (curr!=null && n>0){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr= next;
            n--;
            count++;
        }
        headofgroup.next= next;
        last.next=pre;
        return count;
    }
}