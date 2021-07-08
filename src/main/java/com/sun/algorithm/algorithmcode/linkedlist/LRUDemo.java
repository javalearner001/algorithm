package com.sun.algorithm.algorithmcode.linkedlist;

import com.sun.algorithm.entity.SingleNode;
import com.sun.algorithm.factory.SingleNodeFactory;
import sun.jvm.hotspot.opto.Node;

/**
 * @author sunkai
 * @since 2021/7/6 6:02 下午
 *
 * LRU使用单链表实现
 * 1.当value存在于链表中时，遍历获取位置，然后将他放在头结点
 * 2.当value不存在链表中时，如果长度不超过，直接插入在头部，如果长度超出，先将尾结点删除，然后插入在头结点
 */
public class LRUDemo {
    public static void main(String[] args) {
        SingleNode singleNode5 = SingleNodeFactory.getSingleNode5();
        int value = 3;

        SingleNode node = singleNodeLRU(singleNode5, 6, 5);
        while (node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public static SingleNode singleNodeLRU(SingleNode singleNode,int value, int limitSize){
        //判断临界
        if (singleNode.getValue() == value){
            return singleNode;
        }

        int size = 1;
        SingleNode preNode = singleNode;
        SingleNode currNode = singleNode.getNext();
        //先删除，再增加
        while (currNode != null){
            if (currNode.getValue() == value){
                preNode.setNext(currNode.getNext());
                currNode.setNext(singleNode);
                return currNode;
            }

            size++;
            if (size >= limitSize){
                //长度大于限定值，删除当前节点
                preNode.setNext(null);
                break;
            }
            preNode = preNode.getNext();
            currNode = currNode.getNext();
        }

        //走到这里代表链表中不存在
        SingleNode node = new SingleNode(value,singleNode);
        return node;
    }
}
