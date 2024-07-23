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

        //n 값이 짝수라는 가정에 있으며 짝수 리스트를 가진다고 가정합니다.
        //리스트의 양 끝이 서로 쌍둥이 값으로 지정한다고 합니다.
        //예를 들어, [1,2,3,4] 라고 주어진다면, 배열 기준) 0번째와 3번째는 쌍둥이 입니다. 그리고 1번째와 2번째가 쌍둥이입니다.
        //즉, 문제에서 얘기하는 것은 서로 양 끝에서 바라보는 값이 쌍둥이를 의미한다는 것입니다.
        //그래서 현재 제공되는 연결 리스트의 값들을 리스트에 담은 다음, 양 끝을 기준으로 합을 더하여 최대 값을 구합니다.
        List<Integer> values = new ArrayList<>();

        ListNode node = head;

        while(node != null) {
            values.add(node.val);
            node = node.next;
        }

        //시작 배열 번호
        int start = 0;
        //끝 배열 번호
        int end = values.size() - 1;

        int max = 0;
        // 양 끝에서 출발하여 서로 더하면서 더한 값의 max 값을 찾는다.
        while(start <= end) {
            int value = values.get(start++) + values.get(end--);
            if(max <= value) {
                max = value;
            }
        }

        return max;
    }
}