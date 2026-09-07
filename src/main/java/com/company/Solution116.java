package com.company;

public class Solution116 {
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        con(root);
        return root;
    }
    public void con(Node root) {
        if(root == null) {
            return;
        }
        Node currNode, head, tem;
        currNode = root;
        head = new Node(0);
        tem = head;
        while(currNode != null) {
            if(currNode.left != null) {
                tem.next = currNode.left;
                tem = tem.next;
            }
            if(currNode.right != null) {
                tem.next = currNode.right;
                tem = tem.next;
            }
            currNode = currNode.next;
        }
        con(head.next);
    }
}
