package com.sun.algorithm.algorithmcode.linkedlist;

import com.sun.algorithm.entity.SingleNode;
import com.sun.algorithm.factory.SingleNodeFactory;

/**
 * @author sunkai
 * @since 2021/7/9 4:55 下午
 */
public class SortLinkMergeDemo {
    public static void main(String[] args) {
        SingleNode singleNodeOdd = SingleNodeFactory.getSingleNodeOdd();
        SingleNode singleNodeEven = SingleNodeFactory.getSingleNodeEven();
    }

    public SingleNode sortMerge(SingleNode firstNode,SingleNode secondNode){

        SingleNode firstHead = firstNode;
        SingleNode secondHead = secondNode;
        SingleNode resultNode = new SingleNode(-1,null);

        while (firstHead != null || secondHead != null){
            if (firstHead.getValue() >= secondHead.getValue()){
                resultNode.setNext(secondHead);
                secondHead = secondHead.getNext();
            }else {
                resultNode.setNext(firstHead);
                firstHead = firstHead.getNext();
            }
        }
        return resultNode;
    }
}
