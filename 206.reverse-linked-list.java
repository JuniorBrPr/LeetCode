import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null && head.next != null) {
            ListNode next = head.next;
            if (next.val != -1) {
                stack.push(next);
                head = next;
            } else {
                break;
            }
        }
        ListNode result = head;

        while (!stack.empty()) {
            head.next = stack.pop();
            head = head.next;
        }
        head.next = null;

        return result;
    }
}
