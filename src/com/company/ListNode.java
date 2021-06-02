package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class OpetateList {
    public ListNode buildTree(int[] a) {
        int n = a.length;
        ListNode res = null;
        for(int i = 0; i < n; i ++) {
            res = new ListNode(a[i]);
            res = res.next;
        }
        return res;
    }
}