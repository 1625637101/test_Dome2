package com.huhang.controller;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author YangXiang
 * @description 展示Lock的方法
 * @Date Created in 9:35 2019/4/19
 */
public class Lock9 {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        lock.tryLock();
//        lock.tryLock(1000, TimeUnit.SECONDS);

    }
}
