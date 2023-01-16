package com.mcmichael.leetcode.easy;

public class DiameterOfBinaryTree {

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

	/*
	 * Given the root of a binary tree, return the length of the diameter of the
	 * tree.
	 * 
	 * The diameter of a binary tree is the length of the longest path between any
	 * two nodes in a tree. This path may or may not pass through the root.
	 * 
	 * The length of a path between two nodes is represented by the number of edges
	 * between them.
	 * 
	 * 
	 */

	int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		deepest(root);
		return max;

	}

	public int deepest(TreeNode root) {

		if (root == null)
			return 0;
		int leftDepth = deepest(root.left);
		int rightDepth = deepest(root.right);
		max = Math.max(max, rightDepth + leftDepth);

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
