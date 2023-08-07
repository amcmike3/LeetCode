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
		    	
		    	if (start >= end) {
		    		return null;
		    	}
		    	int leftMid = (start + end) / 2;
		    	int rightMid = start + (end - start) / 2;
		    	
		    	if (leftMid >= 0) {
		    		root.left = arrToBSTHelper(new TreeNode(nums[leftMid]), nums, leftMid - 1, end);
		    	}
		    	if (rightMid < nums.length) {
			    	root.right = arrToBSTHelper(new TreeNode(nums[rightMid]), nums, start, rightMid + 1);	
		    	}
		    	
		    	return root;
		    }
		    
			    

}
