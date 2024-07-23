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
    public int pairSum(ListNode head) {
        
        List<Integer> values = new ArrayList<>();

        ListNode node = head;

        while(node != null) {
            values.add(node.val);
            node = node.next;
        }

        int start = 0;
        int end = values.size() - 1;

        int max = 0;
        while(start <= end) {
            int value = values.get(start++) + values.get(end--);
            if(max <= value) {
                max = value;
            }
        }

        return max;
    }
}