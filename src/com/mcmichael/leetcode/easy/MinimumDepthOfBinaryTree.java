package com.mcmichael.leetcode.easy;

import com.mcmichael.leetcode.easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

class MinimumDepthOfBinaryTree{
    public int minDepth(TreeNode root) {
    	
    	return minDepthHelper(root, 0);
    	
    }
    
    public int minDepthHelper(TreeNode root, int num) {
    	if (root == null) {
    		return num;
    	} else if( root.right == null && root.left == null) {
    		return num + 1;
    	} else if (root.right == null && root.left != null) {
    		return minDepthHelper(root.left, num+1);
    	} else if (root.left == null && root.right != null) {
    		return minDepthHelper(root.right, num+1);
    	}
    	
    	return Integer.min(minDepthHelper(root.right, num + 1), minDepthHelper(root.left, num + 1));
    }
}