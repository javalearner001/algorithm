package com.sun.algorithm.algorithmcode.linkedlist;

import com.sun.algorithm.entity.SingleNode;
import com.sun.algorithm.factory.SingleNodeFactory;

/**
 * @author sunkai
 * @since 2021/7/7 5:02 下午
 */
public class NodeOperation {
    public static void main(String[] args) {
        SingleNode singleNode5 = SingleNodeFactory.getSingleNode5();

        //SingleNode node = deleteNode(singleNode5,5);
        //SingleNode node = addNode(singleNode5, 5,new SingleNode(8,null));
        SingleNode node = deleteAndAdd(singleNode5,3);
        while (node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    /**
     * preNode从singleNode中遍历获取要删除的前一个节点，这个节点和singleNode的节点是同一个节点，原因是hashcode相同，证明内存地址相同
     * 所以直接设置这个节点的next就是对singleNode的这个节点设置next，所以达到了删除的效果
     * @param singleNode
     * @param value
     * @return
     */
    public static SingleNode deleteNode(SingleNode singleNode , int value){
        //考虑删除临界点，删除第一个
        if (singleNode.getValue() == value){
            return singleNode.getNext();
        }

        SingleNode preNode = singleNode;
        SingleNode currNode = singleNode.getNext();

        while (currNode != null){
            if (currNode.getValue() == value){
                System.out.println(preNode.hashCode());
                System.out.println(singleNode.getNext().hashCode());
                preNode.setNext(currNode.getNext());
                break;
            }
            currNode = currNode.getNext();
            preNode = preNode.getNext();
        }
        return singleNode;
    }

    /**
     * 在singleNode中value值的后面插入
     * @param singleNode
     * @param value
     * @param addNode
     * @return
     */
    public static SingleNode addNode(SingleNode singleNode , int value ,SingleNode addNode){

        SingleNode preNode = singleNode;
        SingleNode currNode = singleNode.getNext();

//增加考虑添加临界点，在尾部添加不考虑，考虑的是在头部添加
        if (preNode.getValue() == value){
            addNode.setNext(currNode);
            preNode.setNext(addNode);
            return singleNode;
        }

        while (currNode != null){
            if (currNode.getValue() == value){
                addNode.setNext(currNode.getNext());
                currNode.setNext(addNode);
                break;
            }
            preNode = preNode.getNext();
            currNode = currNode.getNext();
        }

        return singleNode;
    }

    private static SingleNode deleteAndAdd(SingleNode singleNode , int value){

        SingleNode preNode = singleNode;
        SingleNode currNode = singleNode.getNext();

        while (currNode != null){
            if (currNode.getValue() == value){
                preNode.setNext(currNode.getNext());
                currNode.setNext(singleNode);
                break;
            }
            preNode = preNode.getNext();
            currNode = currNode.getNext();
        }
        return currNode;
    }
}
