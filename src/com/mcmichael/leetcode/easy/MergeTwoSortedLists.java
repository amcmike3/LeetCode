package com.mcmichael.leetcode.easy;
/*
 * You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {
	
	
	 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode curr = new ListNode();
	        ListNode placeholder = new ListNode(0, curr);
			while(list1 != null && list2 != null){
	            
	            if (list1.val <= list2.val){
	                curr.next = list1;
	                curr = list1;
	                list1 = list1.next;
	            } else{
	                curr.next = list2;
	                curr = list2;
	                list2 = list2.next;
	            }
	        }
			   if (list1 != null){
		            curr.next = list1;
		        } 
			   if (list2 != null){
		            curr.next = list2;
		        }
	        curr = placeholder.next;
	        return curr.next;
	    }
	 	/*
	 	 * compare the values of each node whichever is less add it to the curr linked list.
	 	 * tricks to remember:
	 	 * 		placeholder on line 37 allows us to jump back to the beginning of the list since we can't traverse upwards
	 	 * 		line 50 - 55 will check if there is any value left in either list and add it to the curr linked list
	 	 * 		(Don't ask me why.. but I think the loop should catch that since list2 is still not null)
	 	 * 		(please someone explain it to me... )
	 	 */
	
	
	
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(99)));
		ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
		printLinkedList(mergeTwoLists(list1, list2));
	}
	
	//  Definition for singly-linked list.
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 


	 
	 public static void printLinkedList(ListNode start) {
		 while(start.next != null) {
			 System.out.print(start.val + ", ");
			 start = start.next;
		 }
		 System.out.println(start.val);
	 }
}
