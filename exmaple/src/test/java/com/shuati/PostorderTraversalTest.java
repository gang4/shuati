package com.shuati;
import org.junit.Test;

import common.TreeNode;

import java.util.List;

import org.junit.Before;    
    
public class PostorderTraversalTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        // [5,3,7,2,4,6,9,1,null,null,null,8,10] 
        // 1 2 4 3 6 8 10 9 7 5
        TreeNode n = new TreeNode(5); 
        n.left = new TreeNode(3);
        n.right = new TreeNode(7);
        n.left.left = new TreeNode(2);
        n.left.right = new TreeNode(4);
        n.right.left = new TreeNode(6);
        n.right.right = new TreeNode(9); 
        n.left.left.left = new TreeNode(1); 
        n.right.right.left = new TreeNode(8);
        n.right.right.right = new TreeNode(10);
        PostorderTraversal p = new PostorderTraversal();
        List<Integer> l = p.postorderTraversal(n);
        System.out.println(l);
    }
}
    