package com.sun.algorithm.factory;

/**
 * @author sunkai
 * @since 2021/11/2 4:27 下午
 */
public class TreeNode {
    /**
     * 节点值
     */
    public int value;
    /**
     * 左节点
     */
    public TreeNode left;
    /**
     * 右节点
     */
    public TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
