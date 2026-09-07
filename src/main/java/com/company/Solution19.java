package com.company;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        if(n == 0) {
            return head;
        }
        int i = 0;
        while(fast != null) {
            fast = fast.next;
            i ++;
            if(i > n){
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return head;
    }
}
