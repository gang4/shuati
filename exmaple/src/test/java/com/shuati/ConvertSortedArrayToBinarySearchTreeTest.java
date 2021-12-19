package com.shuati;
import org.junit.Test;

import common.TreeNode;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class ConvertSortedArrayToBinarySearchTreeTest {

    @Before
    public void setup(){

    }
        
    //@Test
    public void test() {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        int [] nums = {1};
        TreeNode n = c.sortedArrayToBST(nums);
        assertTrue(n != null);
    }

    //@Test
    public void test1() {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        int [] nums = {1, 2};
        TreeNode n = c.sortedArrayToBST(nums);
        assertTrue(n != null);
    }

    //@Test
    public void test2() {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        int [] nums = {1, 2, 3, 4, 5};
        TreeNode n = c.sortedArrayToBST(nums);
        assertTrue(n != null);
    }

    @Test
    public void test3() {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        int [] nums = {1, 2, 3, 4, 5, 6};
        TreeNode n = c.sortedArrayToBST(nums);
        assertTrue(n != null);
    }
}
    