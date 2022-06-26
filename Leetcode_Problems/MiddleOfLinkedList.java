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
	public ListNode middleNode(ListNode head) {
		ListNode curr = head;
		int length = 1, checkVal = 0, middle, i = 0;

		while(curr.next != null) {
			length++;
			curr = curr.next;
		}

		middle = (length+1)/2;

		if(length % 2 == 0)
			middle++;

		curr = head;
		while(curr.next != null) {
			if(i == middle-1) {
				break;
			}
			curr = curr.next;
			i++;
		}

		head = curr;
		return head;
	}
}