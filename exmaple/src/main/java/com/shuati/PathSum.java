package com.shuati;

import common.TreeNode;

// https://leetcode.com/problems/path-sum/
public class PathSum {
    boolean path = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (this.path) {
            return true;
        }
        // Deep first search.
        // for each level, subtract val. If >= 0, go either level of right
        if (root == null) {
            return false;
        }
        System.out.println(root.val);
        targetSum -= root.val;
        if (targetSum == 0 && root.left == null && root.right == null) {
            this.path = true;
            return true;
        }

        boolean rt = hasPathSum(root.left, targetSum);
        if (!rt) {
            rt = hasPathSum(root.right, targetSum);    
        }
        return rt;
    }
}
