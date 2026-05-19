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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ||head.next==null) return null;
        ListNode temp = head;
        int i = 0;
        while (temp != null && i < n) {
            temp = temp.next;
            i++;
        }
        // System.out.println(temp.val);
        ListNode temp2 = head;
        ListNode prev = null;
        while (temp != null) {
            prev = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        System.out.println(temp2.val);
        if(prev==null) return head.next;
        prev.next = temp2.next;
        System.out.println(prev.val);
        return head;
    }
}
