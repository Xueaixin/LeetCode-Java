package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class OperateTree {
    //构造二叉树
    public TreeNode buildTree(Integer[] a) {
        int len = a.length;
        if(len == 0 || a[0] == (Integer) null) {
            return null;
        }
        TreeNode root = new TreeNode(a[0]);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        for(int i = 1; i < len; i ++) {
            while(q.peek() == null) {
                q.poll();
            }
            TreeNode currNode = q.poll();
            if(a[i] != null) {
                currNode.left = new TreeNode(a[i]);
            }
            q.add(currNode.left);
            if(i + 1 < len) {
                i ++;
                if(a[i] != null) {
                    currNode.right = new TreeNode(a[i]);
                }
                q.add(currNode.right);
            }
        }
        return root;
    }

    //中序遍历
    public void printTree(TreeNode root) {
        if(root != null) {
            printTree(root.left);
            System.out.print(root.val + "->");
            printTree(root.right);
        }
    }
}
