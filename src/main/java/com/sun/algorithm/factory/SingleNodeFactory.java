package com.sun.algorithm.factory;

import com.sun.algorithm.entity.SingleNode;

/**
 * @author sunkai
 * @since 2021/7/7 3:59 下午
 */
public class SingleNodeFactory {

    public static SingleNode getSingleNode5(){
        SingleNode node5 = new SingleNode(5,null);
        SingleNode node4 = new SingleNode(4,node5);
        SingleNode node3 = new SingleNode(3,node4);
        SingleNode node2 = new SingleNode(2,node3);
        SingleNode node1 = new SingleNode(1,node2);
        return node1;
    }
}
