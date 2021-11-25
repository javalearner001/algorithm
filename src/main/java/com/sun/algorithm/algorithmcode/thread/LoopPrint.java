package com.sun.algorithm.algorithmcode.thread;

/**
 * @author sunkai
 * @since 2021/7/29 5:42 下午
 */
public class LoopPrint extends Thread {

    int i = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                this.notify();
                if (i <= 100){
                    System.out.println("当前线程为：" + Thread.currentThread().getName() + " i:" + i++);
                }else {
                    break;
                }

                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

