public class SwapNodesInPair
{
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null && current.next.next != null)
        {
            ListNode first = current.next;
            ListNode second = first.next;
            current.next = second;
            first.next = second.next;
            second.next = first;
            current = first;
            first = first.next;

        }

        return dummy.next;
    }
}