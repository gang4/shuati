package com.shuati;

import common.ListNode;

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode rt = new ListNode();
        ListNode tmp = rt;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmp.val = list1.val;
                list1 = list1.next;
            }
            else {
                tmp.val = list2.val;
                list2 = list2.next;
            }
            tmp.next = new ListNode();
            tmp = tmp.next;            
        }
        ListNode rest = list1;
        if (rest == null) {
            rest = list2;
        } 
        if (rest != null) {
            tmp.val = rest.val;
            tmp.next = rest.next;
        }  
        return rt;   
    }
}
