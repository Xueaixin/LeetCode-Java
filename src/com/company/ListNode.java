package com.company;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class OpetateList {
    public ListNode buildTree(int[] a) {
        int n = a.length;
        ListNode res = null;
        for(int j : a) {
            res = new ListNode(j);
            res = res.next;
        }
        return res;
    }
}