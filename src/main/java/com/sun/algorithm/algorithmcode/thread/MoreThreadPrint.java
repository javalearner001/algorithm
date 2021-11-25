package com.sun.algorithm.algorithmcode.thread;

/**
 * @author sunkai
 * @since 2021/8/3 9:54 上午
 */
public class MoreThreadPrint extends Thread{

    int i = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                this.notify();
                /*if (1 <= 100 && i)*/
            }
        }
    }
}
