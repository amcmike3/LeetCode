package com.mcmichael.leetcode.easy;

public class MiddleOfLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	/*
	 * Given the head of a singly linked list, return the middle node of the linked
	 * list.
	 * 
	 * If there are two middle nodes, return the second middle node.
	 * 
	 * 
	 */

	public ListNode middleNode(ListNode head) {

		//base case
		if (head == null || head.next == null)
			return head;

		ListNode fast = head.next.next;
		ListNode middle = head.next;

		/* for every one spot middle moves, move fast twice
		 * this ensures middle is always center compared to fast.
		 * if either fast is null or fast.next is null we have reached the end of this list.
		 */
		while (fast != null && fast.next != null) {
			middle = middle.next;

			fast = fast.next.next;

		}

		return middle;
	}
}
