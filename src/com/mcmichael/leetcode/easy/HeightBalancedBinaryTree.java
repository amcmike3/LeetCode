package com.mcmichael.leetcode.easy;

public class HeightBalancedBinaryTree {

	/*
	 * Given a binary tree, determine if it is height-balanced .
	 * 
	 * 
	 * 
	 * Example 1:
	 * Input: root = [3,9,20,null,null,15,7] Output: true
	 * 
	 *  
	 * Example 2:
	 * Input: root = [1,2,2,3,3,null,null,4,4] Output: false 
	 * 
	 * 
	 * Example 3:
	 * Input: root = [] Output: true
	 * 
	 * Constraints:
	 * The number of nodes in the tree is in the range [0, 5000]. -104 <= Node.val
	 * <= 104
	 */

	public boolean isBalanced(TreeNode root) {
		return helper(root, 0) >= 0;

	}

	private int helper(TreeNode node, int i) {

		if (node == null) {
			return i;
		}

		int leftI = helper(node.left, i + 1);
		int rightI = helper(node.right, i + 1);

		if (leftI < 0 || rightI < 0 || leftI - rightI < -1 || leftI - rightI > 1) {
			return -1;
		}
		if (leftI < rightI) {
			return rightI;
		}

		return leftI;
	}

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
