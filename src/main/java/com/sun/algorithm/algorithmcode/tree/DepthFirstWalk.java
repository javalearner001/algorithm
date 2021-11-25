package com.sun.algorithm.algorithmcode.tree;

import com.sun.algorithm.factory.TreeNode;
import com.sun.algorithm.factory.TreeNodeFactory;

/**
 * @author sunkai
 * @since 2021/11/2 4:25 下午
 */
public class DepthFirstWalk {
    public static void main(String[] args) {
        TreeNode node = TreeNodeFactory.getTreeNode();

        System.out.println("最深：" + getMaxDepth(node));
        System.out.println("最浅：" + getMinDepth(node));
    }

    public static int getMaxDepth(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftDepth = getMaxDepth(node.left) + 1;
        int rightDepth = getMaxDepth(node.right) + 1;
        return Math.max(leftDepth,rightDepth);
    }

    public static int getMinDepth(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftDepth = getMinDepth(node.left) + 1;
        int rightDepth = getMinDepth(node.right) + 1;
        return Math.min(leftDepth,rightDepth);
    }
}
