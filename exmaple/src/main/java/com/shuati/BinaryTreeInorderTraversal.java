package com.shuati;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import common.TreeNode;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null) {
            if (root.left == null) {
                list.add(root.val);
                if (root.right != null) {
                    root = root.right;                    
                } 
                else {
                    if (stack.isEmpty()) {
                        break;
                    }
                    root = stack.pop();
                    root.left = null; 
                }
            }
            else {
                stack.push(root);
                root = root.left; 
            }
        }
        return list;
    }
}
