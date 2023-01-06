package com.objects.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class OperateTree {

    /**
     * 根据二叉树宽度优先遍历的数组还原二叉树
     */
    public TreeNode restoreTree(Integer[] a) {
        int len = a.length;
        if (len == 0 || a[0] == (Integer) null) {
            return null;
        }
        TreeNode root = new TreeNode(a[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        for (int i = 1; i < len; i++) {
            while (q.peek() == null) {
                q.poll();
            }
            TreeNode currNode = q.poll();
            if (a[i] != null) {
                currNode.left = new TreeNode(a[i]);
            }
            q.add(currNode.left);
            if (i + 1 < len) {
                i++;
                if (a[i] != null) {
                    currNode.right = new TreeNode(a[i]);
                }
                q.add(currNode.right);
            }
        }
        return root;
    }

    /**
     * 中序遍历二叉树
     */
    public void inorderTraversal(ArrayList<Integer> res, TreeNode root) {
        if (root != null) {
            inorderTraversal(res, root.left);
            res.add(root.val);
            System.out.print(root.val + "->");
            inorderTraversal(res, root.right);
        }
    }

}
