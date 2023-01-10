package com.mcmichael.leetcode.easy;

import java.util.Collections;

public class ReverseLinkedList {

	class ListNode {
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

	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode temp = new ListNode(head.val);
		while (head.next != null) {
			temp = new ListNode(head.next.val, temp);
			head = head.next;
		}
		return temp;
	}
}
