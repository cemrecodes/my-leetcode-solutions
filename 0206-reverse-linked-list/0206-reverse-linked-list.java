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
    ListNode prev = null;
    ListNode node;
    ListNode next;
    ListNode temp = null;

    temp = head;

    while(temp != null){
       next = temp.next;
       node = temp;
       temp.next = prev;
       prev = node;
       temp = next;
    }

    return prev;

    }
}