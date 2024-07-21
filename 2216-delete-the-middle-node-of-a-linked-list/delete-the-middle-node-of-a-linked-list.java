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
        
        if(head == null || head.next == null) return null;

        //n/2의 값을 찾기 위해서는 
        //finished 하나씩 넘어가느 것과 search의 두단계식 넘어가는 노드사이의 차이를 구하면 됨
        ListNode finished = head;
        ListNode search = head;

        //node의 중간 지점 찾기 finished가 그 위치를 알려
        while(search != null && search.next != null) {
            finished = finished.next;
            search = search.next.next;
        }

        search = head;

        while(true) {
            if(search.next == finished) {
                search.next = search.next.next;
                break;
            }
            search = search.next;
        }

        return head;

    }
}