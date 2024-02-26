import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode current = head;
        while (head.next != null) {
            ListNode prev = head.next;
            head.next = prev.next;
            prev.next = current;
            current = prev;
        }
        return current;
    }
}