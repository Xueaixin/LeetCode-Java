package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution96 {
    //构造1~n为节点的所有二叉搜索树
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) {
            return new ArrayList<TreeNode>();
        }
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int s, int n) {
        List<TreeNode> rootTrees = new ArrayList<TreeNode>();
        if(s > n) {
            rootTrees.add(null);
            return rootTrees;
        }
        for(int i = s; i <= n; i ++) {
            List<TreeNode> leftTrees = generateTrees(s, i - 1);
            List<TreeNode> rightTrees = generateTrees(i + 1, n);

            for(TreeNode left : leftTrees) {
                for(TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    rootTrees.add(root);
                }
            }
        }
        return rootTrees;
    }

    //1~n为节点的二叉搜索树的个数
    public int numTrees(int n) {
        if(n == 0) {
            return 1;
        }
        int[] g = new int[n + 1];
        g[0] = 1;
        g[1] = 1;
        for(int i = 2; i <= n; i ++) {
            for(int j = 1; j <= i; j ++) {
                g[i] += g[j - 1] * g[i - j];
            }
        }
        return g[n];
    }
}
