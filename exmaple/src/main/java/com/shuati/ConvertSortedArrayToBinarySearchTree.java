package com.shuati;

import common.TreeNode;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        // divide and conquer    
        TreeNode n = sortedArrayToBST(nums, 0, nums.length);
        return n;
    }

    public TreeNode sortedArrayToBST(int nums[], int low, int high) {
        if (low !=  0 && low == high) {
            return null;
        }
        
        int middle = low + (high - low) / 2;
        if (middle == low) {
            return new TreeNode(nums[low]);
        } 
        TreeNode n = new TreeNode(nums[middle]);
        n.left = sortedArrayToBST(nums, low, middle);
        n.right = sortedArrayToBST(nums, middle + 1, high);
        return n;
    }
}
