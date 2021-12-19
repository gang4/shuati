package com.shuati;

import java.util.Stack;

import common.ListNode;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectioLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        } 
        Stack<ListNode> a = new Stack<ListNode>();
        while (headA != null) {
            a.push(headA);
            headA = headA.next;
        }
        Stack<ListNode> b = new Stack<ListNode>();
        while (headB != null) {
            b.push(headB);
            headB = headB.next;
        }

        ListNode c = null;
        while (!a.isEmpty() && !b.isEmpty()) {
            ListNode a1 = a.pop();
            ListNode b1 = b.pop();
            if (a1.val == b1.val) {
                c = a1;
                continue;
            }
            break;
        } 
         
        return c;
    }

    // ListNode reverseListNode(ListNode n) {
    //     Stack<ListNode> s = new Stack<ListNode>();
    //     while (n != null) {
    //         s.push(n);
    //         n = n.next;
    //     }
    //     ListNode head = s.pop();
    //     ListNode current = head;
    //     while (!s.isEmpty()) {
    //         current.next = s.pop();
    //         current = current.next;
    //     }
    //     return head;
    // }
}
