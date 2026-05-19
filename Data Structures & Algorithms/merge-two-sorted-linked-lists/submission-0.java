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
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp = new ListNode(-1);
        ListNode result = temp;
        while (temp1 != null && temp2 != null) {
            if (temp1.val > temp2.val) {
                result.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            } else {
                result.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            }
            result = result.next;
        }
        while (temp1 != null) {
            result.next = new ListNode(temp1.val);
            temp1 = temp1.next;
            result=result.next;
        }
        while (temp2 != null) {
            result.next = new ListNode(temp2.val);
            temp2 = temp2.next;
            result=result.next;
        }
        return temp.next;
    }
}