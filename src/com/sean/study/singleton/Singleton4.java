package com.sean.study.singleton;

/**
 * 懒汉式（登记式/静态内部类方式）
 * 静态内部实现的单例是懒加载的且线程安全。
 *
 */
public class Singleton4 {

    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {}

    /**
     * 线程安全获取单例
     * @return
     */
    private static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
