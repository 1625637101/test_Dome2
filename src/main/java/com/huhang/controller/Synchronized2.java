package com.huhang.controller;

/**
 * @author YangXiang
 * @description 对象锁示例 代码块形式
 * @Date Created in 11:49 2019/4/17
 */
public class Synchronized2 implements Runnable {

    static  Synchronized2 Synchronized2 = new Synchronized2();

    Object lock1 = new Object();
    Object lock2 = new Object();

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("我是lock1，我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "lock1运行结束");
        }
        synchronized (lock2) {
            System.out.println("我是lock2，我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "lock2运行结束");
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(Synchronized2);
        Thread thread2 = new Thread(Synchronized2);
        thread1.start();
        thread2.start();
        //只要两个线程存在
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finished");
    }
}
