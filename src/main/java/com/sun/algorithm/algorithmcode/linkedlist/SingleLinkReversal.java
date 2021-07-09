package com.sun.algorithm.algorithmcode.linkedlist;

import com.sun.algorithm.entity.SingleNode;
import com.sun.algorithm.factory.SingleNodeFactory;

/**
 * 单链表反转,主要注意不能产生循环依赖问题
 * @author sunkai
 * @since 2021/7/9 10:33 上午
 */
public class SingleLinkReversal {

    public static void main(String[] args) {
        SingleNode singleNode5 = SingleNodeFactory.getSingleNode5();
        SingleNode node = reversalBest(singleNode5);
        while (node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    /**
     * 网上最优解
     * @param singleNode
     * @return
     */
    public static SingleNode reversalBest(SingleNode singleNode){
        if (singleNode == null || singleNode.getNext() == null){
            return singleNode;
        }
        SingleNode preNode = null;
        SingleNode nextNode = null;

        while (singleNode != null){
            nextNode = singleNode.getNext();

            singleNode.setNext(preNode);
            preNode = singleNode;

            singleNode = nextNode;
        }
        return preNode;
    }

    /**
     * 自己写的
     * @param singleNode
     * @return
     */
    public static SingleNode reversal(SingleNode singleNode){
        if (singleNode == null || singleNode.getNext() == null){
            return singleNode;
        }

        SingleNode preNode = singleNode;
        SingleNode currNode = singleNode.getNext();
        SingleNode nextNode = null;

        int i = 0;
        while (currNode != null){
            nextNode = currNode.getNext();
            if (i == 0){
                preNode.setNext(null);
            }
            currNode.setNext(preNode);
            preNode = currNode;
            currNode = nextNode;
            i++;
        }
        return preNode;
    }
}
