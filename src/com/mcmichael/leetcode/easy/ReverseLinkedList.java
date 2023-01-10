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
		//check base cases
		if (head == null || head.next == null) return head;
		
		//initialize a separate Linked List to store and return  
		ListNode temp = new ListNode(head.val);
		while (head.next != null) {
			// store the current value and point at previous node 
			temp = new ListNode(head.next.val, temp);
			//traverse the LinkedList
			head = head.next;
		}
		return temp;
	}
}
