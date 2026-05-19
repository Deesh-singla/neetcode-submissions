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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode node = null;
        ListNode prev = null;
        while (temp!= null) {
            node = temp;
            temp = temp.next;
            node.next = prev;
            prev = node;
        }
        return prev;
    }
}
