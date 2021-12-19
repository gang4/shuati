package com.shuati;

import java.util.Stack;

import common.TreeNode;

// https://leetcode.com/problems/same-tree/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // breath first search
        // If all subtrees are equal, then full trees are equal. 
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean rt0 = isSameTree(p.left, q.left);
        boolean rt3 = isSameTree(p.right, q.right);

        return (rt0 && rt3);
    }
}
