package com.sun.algorithm.factory;

/**
 * @author sunkai
 * @since 2021/11/2 4:27 下午
 */
public class TreeNodeFactory {

    /**
     *
     * @return
     */
    public static TreeNode getTreeNode(){
        TreeNode treeNode9 = new TreeNode(9,null,null);
        TreeNode treeNode15 = new TreeNode(15,null,null);
        TreeNode treeNode7 = new TreeNode(7,null,null);
        TreeNode treeNode20 = new TreeNode(20,treeNode15,treeNode7);
        TreeNode treeNode3 = new TreeNode(3,treeNode9,treeNode20);
        return treeNode3;
    }
}
