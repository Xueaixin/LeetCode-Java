package com.objects.utils;

public class OperateList {
    public ListNode buildTree(int[] a) {
        ListNode res = new ListNode();
        ListNode node = res;
        for(int j : a) {
            node.next = new ListNode(j);
            node = node.next;
        }
        return res.next;
    }
}
