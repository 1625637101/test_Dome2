package com.huhang.controller;

/**
 * @author YangXiang
 * @description 类锁的第一种形式，static形式
 * @Date Created in 10:19 2019/4/18
 */
public class Synchronized4 implements Runnable{

    static Synchronized4 instance1 = new Synchronized4();
    static Synchronized4 instance2 = new Synchronized4();

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

    public static synchronized void method() {
        System.out.println("类锁的第一种形式，static形式，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    @Override
    public void run() {
        method();
    }


}
