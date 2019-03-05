package com.sean.study.singleton;

/**
 * 懒汉线程安全双重检查加锁单例创建
 *
 */
public class Singleton3 {

    /**
     * volatile保证，singleton1Instance，多个线程可以正确处理singleton1Instance变量
     */
    private volatile static Singleton3 singletonInstance;

    private Singleton3() {}

    /**
     * 线程安全获取单例
     * @return
     */
    private static Singleton3 getInstance() {
        // 检查实例， 如果不存在就进入同步代码块
        if (singletonInstance == null) {
            // 只有第一次才彻底执行这里的代码
            synchronized (Singleton3.class) {
                // 进入同步代码块后， 再检查一次， 如果任然为null， 才创建实例
                if (singletonInstance == null) {
                    singletonInstance = new Singleton3();
                }
            }
        }
        return singletonInstance;
    }
}
