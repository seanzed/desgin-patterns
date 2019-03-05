package com.sean.study.singleton;

/**
 * 懒汉线程安全单例创建
 *
 * 弊端： 因为synchronized关键字偏重量级锁， 虽然在JavaSE1.6之后synchronized关键字进行了主要包括：
 * 为了减少获得锁和释放锁带来的性能消耗而引入的偏向锁和轻量级锁以及其它各种优化之后执行效率有了显著提升。
 * 但是在程序中每次使用getInstance() 都要经过synchronized加锁这一层，这难免会增加getInstance()的方法的时间消费，而且还可能会发生阻塞。
 */
public class Singleton2 {

    private static Singleton2 singletonInstance;

    private Singleton2() {}

    /**
     * 线程安全获取单例
     *
     * @return
     */
    private synchronized Singleton2 getInstance() {
        // 判断当前单例是否被初始化， 如果是就返回， 如果否就建立单例
        if (singletonInstance == null) {
            singletonInstance = new Singleton2();
        }
        return singletonInstance;
    }
}
