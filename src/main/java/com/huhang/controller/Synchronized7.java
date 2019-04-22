package com.huhang.controller;

/**
 * @author YangXiang
 * @description
 * @Date Created in 14:49 2019/4/18
 */
public class Synchronized7 {

    public synchronized void doSomething(){
        System.out.println("我是父类方法");
    }

}

class TestClass extends Synchronized7{
    public synchronized void doSomething(){
        System.out.println("我是子类方法");
        super.doSomething();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.doSomething();
    }
}
