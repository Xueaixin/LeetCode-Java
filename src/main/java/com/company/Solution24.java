package com.company;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode h = head;
        head = head.next;
        h.next = head.next;
        head.next = h;
        while(h.next != null && h.next.next != null) {
            ListNode tem = h.next.next;
            ListNode tail = tem.next;
            tem.next = h.next;
            h.next = tem;
            h = tem.next;
            h.next = tail;
        }
        return head;
    }
}
