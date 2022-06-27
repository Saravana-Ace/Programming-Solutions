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

/*  uses the two pointer method, with a singular loop
	if LinkedList contains only one element head = null and return head
	this is much better than checking after the loop, more efficient
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curr = head, beforeN = head;
		int i = 0;

		if (curr.next == null) {
			head = null;
			return head;
		}

		while(curr.next != null) {
			if(i >= n)
				beforeN = beforeN.next;
			curr = curr.next;
			i++;
		}

		if(i < n)
			head = head.next;
		else
			beforeN.next = beforeN.next.next;

		return head;
	}
}