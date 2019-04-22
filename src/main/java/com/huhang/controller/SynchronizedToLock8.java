package com.huhang.controller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author YangXiang
 * @description
 * @Date Created in 15:23 2019/4/18
 */
public class SynchronizedToLock8 {

    Lock lock = new ReentrantLock();

    public void method1(){
        System.out.println("我是Synchronized形式的锁");
    }

    public void method2(){
        //加锁
        lock.lock();
        try {
            System.out.println("我是lock形式的锁");
        }finally {
            //释放锁
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SynchronizedToLock8 s = new SynchronizedToLock8();
        s.method1();
        s.method2();
    }

}
