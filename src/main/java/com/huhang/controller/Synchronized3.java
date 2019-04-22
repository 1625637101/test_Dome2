package com.huhang.controller;

/**
 * @author YangXiang
 * @description 对象锁示例2，方法锁形式
 * @Date Created in 15:07 2019/4/17
 */
public class Synchronized3 implements Runnable{

    static Synchronized3 synchronized3 = new Synchronized3();

    public static void main(String[] args) {
        Thread thread1 = new Thread(synchronized3);
        Thread thread2 = new Thread(synchronized3);
        thread1.start();
        thread2.start();
        //只要两个线程存在
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finished");
    }

    public synchronized void method() {
        System.out.println("我是对象锁的方法修饰符形式，我叫" + Thread.currentThread().getName());
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
