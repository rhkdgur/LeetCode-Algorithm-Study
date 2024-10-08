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
        
        ListNode node = null;
        
        //node의 앞 요소와 뒷 요소의 위치를 바꿔주는 작업을 지속적으로 한다.
        while(head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = node;
            node = temp;
        }

        return node;
    }
}