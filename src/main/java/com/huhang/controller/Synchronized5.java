package com.huhang.controller;

/**
 * @author YangXiang
 * @description 类锁的第一种形式，static形式
 * @Date Created in 10:19 2019/4/18
 */
public class Synchronized5 implements Runnable {

    static Synchronized5 instance1 = new Synchronized5();
    static Synchronized5 instance2 = new Synchronized5();

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);
        thread1.start();
        thread2.start();
        //只要两个线程存在
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finished");
    }

    private synchronized void method() throws InterruptedException {
        synchronized (Synchronized5.class) {
            System.out.println("类锁的第二种形式，*.class形式，我叫" + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
    }

    @Override
    public void run() {
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
