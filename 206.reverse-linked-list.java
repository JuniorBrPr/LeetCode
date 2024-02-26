import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev;
        ListNode current = head;
        while (head.next != null) {
            prev = head.next;
            head.next = prev.next;
            prev.next = current;
            current = prev;
        }
        return current;
    }
}