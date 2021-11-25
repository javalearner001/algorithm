package com.sun.algorithm.algorithmcode.thread;

/**
 * @author sunkai
 * @since 2021/8/3 9:35 上午
 */
public class TestPrint {
    public static void main(String[] args) {
        LoopPrint loopPrint = new LoopPrint();

        Thread t1 = new Thread(loopPrint,"A");
        Thread t2 = new Thread(loopPrint,"B");

        t1.start();
        t2.start();
    }
}
