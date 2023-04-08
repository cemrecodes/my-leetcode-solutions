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
    public ListNode middleNode(ListNode head) {
        ListNode node = new ListNode();
        int i = 0;
        int j,div;
        node = head; 

        while(node != null){
            i++;
            node = node.next;
        }

        j = 0;
        div = i/2;
        node = head;

        while(j != div){
            j++;
            node = node.next;
        }
       
        return node;
    }
}