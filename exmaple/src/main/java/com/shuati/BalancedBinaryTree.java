package com.shuati;

import java.nio.file.NotLinkException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import common.TreeNode;

// https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    boolean no = false;
    public boolean isBalanced(TreeNode root) {
        isBalanced1(root);
        return !no;
    }

    public int isBalanced1(TreeNode root) {
        // Deep first search.
        // If we know lweft subtree and right subtree is not balanced,
        // then tree is not balanced 
        if (no || root == null) {
            return 0;
        }
        
        int lh = isBalanced1(root.left);
        int rh = isBalanced1(root.right);
        if (!no) {
            if (lh - rh > 1 || rh - lh > 1) {
                no = true;
            }
        }
        if (lh > rh) {
            return lh + 1;
        }
        else {
            return rh + 1;
        }
    }

    public int getTreeHeight(TreeNode root) {
        // Deep first search.
        // If we know subtree high, then 
        // treeHeight[n+1] = max(treeLeftHeight[], treeRightHeight[n])
        if (root == null) {
            return 0;
        }
        System.out.println(root.val);
        int lh = getTreeHeight(root.left);
        int rh = getTreeHeight(root.right);
        if (lh > rh) {
            return lh + 1;
        }
        else {
            return rh + 1;
        }
    }
}
