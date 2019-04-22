package com.huhang.controller;


public class DisappearRequest1 implements Runnable {

    static DisappearRequest1 DisappearRequest1 = new DisappearRequest1();

    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(DisappearRequest1);
        Thread t2 = new Thread(DisappearRequest1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int j = 0; j < 100000; j++) {
                i++;
            }
        }
    }

}
