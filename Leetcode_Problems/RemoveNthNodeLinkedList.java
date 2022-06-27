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

//this two pass solution is inefficient and very basic
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curr = head, temp = head;
		ListNode test = new ListNode(0, head);
		int length = 1;

		while(curr.next != null) {
			length++;
			curr = curr.next;
		}

		curr = head;

		if(length == 1)
			head = null;

		for(int i = 1; i < length; i++) {
			if(i == length-n && length > 1) {
				curr.next = curr.next.next;
				break;
			}

			if(length == n && i == length-n+1) {
				head = curr.next;
				break;
			}

			curr = curr.next;
		}

		return head;
	}
}