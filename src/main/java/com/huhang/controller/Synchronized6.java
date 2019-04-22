package com.huhang.controller;

/**
 * @author YangXiang
 * @description 可重入粒度测试：递归调用本方法
 * @Date Created in 10:19 2019/4/18
 */
public class Synchronized6 {

    public static void main(String[] args) {
        Synchronized6 synchronized6 = new Synchronized6();
        synchronized6.method1();
    }

    int a = 0;

    private synchronized void method1() {
        System.out.println("这是method1,a=" + a);
        method2();
    }
    private synchronized void method2() {
        System.out.println("这是method2,a=" + a);

    }


}
