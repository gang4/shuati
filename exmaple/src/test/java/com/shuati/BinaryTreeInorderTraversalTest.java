package com.shuati;
import org.junit.Test;

import common.TreeNode;

import org.junit.Before;    
    
public class BinaryTreeInorderTraversalTest {

    @Before
    public void setup(){

    }
        
    //@Test
    public void test() {
        TreeNode n = new TreeNode(0);
        n.left = new TreeNode(1); 
        n.left.left = new TreeNode(2);
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
        b.inorderTraversal(n);   
    }

    //@Test
    public void test1() {
        TreeNode n = new TreeNode(0);
        n.right = new TreeNode(1); 
        n.right.right = new TreeNode(2);
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
        b.inorderTraversal(n);   
    }

    @Test
    public void test2() {
        TreeNode n = new TreeNode(0);
        n.right = new TreeNode(1); 
        n.right.left = new TreeNode(2);
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
        b.inorderTraversal(n);   
    }
}
    