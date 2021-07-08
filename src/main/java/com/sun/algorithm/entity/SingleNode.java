package com.sun.algorithm.entity;

import lombok.Data;

/**
 * @author sunkai
 * @since 2021/7/7 3:58 下午
 */
@Data
public class SingleNode{

    private int value;

    private SingleNode next;

    public SingleNode(int value, SingleNode next) {
        this.value = value;
        this.next = next;
    }
}
