package com.shuati;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

// https://leetcode.com/problems/binary-tree-postorder-traversal/
public class PostorderTraversal {
    private List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val); 
            return list;
        } 

        if (root.left != null) {
            postorderTraversal(root.left);
        }

        if (root.right != null) {
            postorderTraversal(root.right);
            list.add(root.val); 
        }
        else {
            list.add(root.val); 
        }
        return list;
    }
}
