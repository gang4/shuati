package com.shuati;
import org.junit.Test;

import common.TreeNode;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class BalancedBinaryTreeTest {

    @Before
    public void setup(){

    }
        
    // @Test
    // public void test() {
    //     // [3,9,20,null,null,15,7]
    //     TreeNode n = new TreeNode(3);
    //     n.left = new TreeNode(9);
    //     n.right = new TreeNode(20);
    //     n.right.left = new TreeNode(15);
    //     n.right.right = new TreeNode(7);
    //     BalancedBinaryTree b = new BalancedBinaryTree();
    //     boolean rt = b.isBalanced1(n);
    //     System.out.println(rt);
    // }

    @Test
    public void test1() {
        // [1,2,2,3,3,null,null,4,4,5,5]
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(5);
        n.left.left.left = new TreeNode(6);
        n.left.left.right = new TreeNode(7); 
        n.left.right.left = new TreeNode(8);
        n.left.right.right = new TreeNode(9);
        BalancedBinaryTree b = new BalancedBinaryTree();
        boolean rt = b.isBalanced(n);
        System.out.println(rt);   
    }

    // @Test
    // public void test3() {
    //     // [1,2,3,4,5,6,null,8]
    //     TreeNode n = new TreeNode(1);
    //     n.left = new TreeNode(2);
    //     n.right = new TreeNode(3);
    //     n.left.left = new TreeNode(4);
    //     n.left.right = new TreeNode(5);
    //     n.right.left = new TreeNode(6);
    //     n.left.left.left = new TreeNode(8);
    //     BalancedBinaryTree b = new BalancedBinaryTree();
    //     boolean rt = b.isBalanced(n);
    //     System.out.println(rt);
    // }
}
    