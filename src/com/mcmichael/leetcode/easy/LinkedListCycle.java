package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {

	/*
	 * Given head, the head of a linked list, determine if the linked list has a
	 * cycle in it.
	 * 
	 * There is a cycle in a linked list if there is some node in the list that can
	 * be reached again by continuously following the next pointer. Internally, pos
	 * is used to denote the index of the node that tail's next pointer is connected
	 * to. Note that pos is not passed as a parameter.
	 * 
	 * Return true if there is a cycle in the linked list. Otherwise, return false.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [3,2,0,-4], pos = 1 Output: true Explanation: There is a cycle
	 * in the linked list, where the tail connects to the 1st node (0-indexed).
	 * Example 2:
	 * 
	 * 
	 * Input: head = [1,2], pos = 0 Output: true Explanation: There is a cycle in
	 * the linked list, where the tail connects to the 0th node. Example 3:
	 * 
	 * 
	 * Input: head = [1], pos = -1 Output: false Explanation: There is no cycle in
	 * the linked list.
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of the nodes in the list is in the range [0, 104]. -105 <=
	 * Node.val <= 105 pos is -1 or a valid index in the linked-list.
	 * 
	 * 
	 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
	 */

	public boolean hasCycle(ListNode head) {
		// our pointer
		ListNode pointer = new ListNode(0);
		// iterate until we reach the end of list
		while (head != null) {
			// if we are at a node that points to our node,
			// we know there is a loop so return true.
			if (head.next == pointer) {
				return true;
			}
			// store next node in list
			ListNode next = head.next;
			// change current node to point at our node
			head.next = pointer;
			// set head equal to next node in list
			head = next;

		}
		// if we reach the end of the list
		// without traversing to our node, there is no loop
		return false;
	}
	// make all nodes point to our node if at any point while traversing we end up
	// at our node there is a loop.
	/*
	 * # Intuition first thoughts on solving this problem was to store every node in
	 * a list and check if the list already contains that node this solution works
	 * but has massive memory implications. To improve upon this instead we can flag
	 * each node by changing the pointer to point at a node we made so that we
	 * eliminate the need for storing every node.
	 * 
	 * # Approach if at any point the next value of a node is a pointer node we
	 * created we know that there is a loop.
	 * 
	 * # Complexity - Time complexity: O(N)
	 * 
	 * - Space complexity: O(1)
	 * 
	 * # Code ```
	 */

	public boolean hasCycle1(ListNode head) {

		List<ListNode> list = new ArrayList<>();
		while (head != null) {
			if (list.contains(head)) {
				return true;
			}

			list.add(head);

			head = head.next;
		}

		return false;
	}
	// visit every node and store it, and check if we have already stored that node.

	// Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
