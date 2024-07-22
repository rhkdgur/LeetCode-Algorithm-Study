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
    public ListNode deleteMiddle(ListNode head) {

        if(head == null) return null;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp;
        ListNode second = head;

        while(second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        first.next = first.next.next;

        return temp.next;
    }
}