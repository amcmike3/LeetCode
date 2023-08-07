package com.mcmichael.leetcode.easy;

public class ConvertSortedArrayToBinarySearchTree {
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
		  public TreeNode sortedArrayToBST(int[] nums) {
			  if (nums.length == 1) {
				  return new TreeNode(nums[0]);
			  } else if (nums.length < 1) {
				  return null;
			  }
		    	int mid = nums.length / 2;
		        TreeNode ans = arrToBSTHelper(new TreeNode(nums[mid]), nums, 0, nums.length - 1);
				
		    	return ans;
		    }
		    public TreeNode arrToBSTHelper(TreeNode root, int[] nums, int start, int end) {
		    	
		    	int mid = start + (end - start) / 2;
		    	
		    	root.right = arrToBSTHelper(new TreeNode(nums[mid / 2]), nums, mid, end);
		    	root.left = arrToBSTHelper(new TreeNode(nums[mid + (mid / 2)]), nums, start, mid);
		    	return null;
		    	
		    }
			    

}
