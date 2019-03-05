package com.sean.study.singleton;

/**
 * 懒汉非线程安全单例创建
 */
public class Singleton1 {

    private static Singleton1 singleton1Instance;

    private Singleton1() {}

    /**
     * 获取当前类的实例
     * 没有加synchronized 关键字的是线程不安全的
     * @return
     */
    private Singleton1 getInstance() {
        // 判断当前单例是否被初始化， 如果是就返回， 如果否就建立单例
        if (singleton1Instance == null) {
            singleton1Instance = new Singleton1();
        }
        return singleton1Instance;
    }
}
