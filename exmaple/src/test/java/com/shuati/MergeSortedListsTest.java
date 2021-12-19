package com.shuati;
import org.junit.Test;

import common.ListNode;

import org.junit.Before;    
    
public class MergeSortedListsTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        ListNode l1 = new  ListNode();
        l1.val = 1;
        l1.next = new ListNode();
        l1.next.val = 4;
        ListNode l2 = new  ListNode();
        l2.val = 2;
        l2.next = new ListNode();
        l2.next.val = 3;
        MergeSortedLists m = new MergeSortedLists();
        m.mergeTwoLists(l1, l2);
    }
}
    