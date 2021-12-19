package com.shuati;
import org.junit.Test;

import common.ListNode;

import org.junit.Before;    
    
public class IntersectioListsTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        // listA = [4,1,8,4,5], listB = [5,6,1,8,4,5] 
        ListNode a = ListNode.createList(new int[]{4,1,8,4,5}); 
        ListNode b = ListNode.createList(new int[]{5,6,1,8,4,5}); 
        IntersectioLists i = new IntersectioLists();
        i.getIntersectionNode(a, b);
    }
}
    