package com.sean.study.singleton;

/**
 * 饿汉式（枚举方式）
 *
 */
public enum Singleton5 {

    /**
     * 定义一个枚举的元素，它就是 Singleton 的一个实例
      */
    INSTANCE;

    public void doSomeThing() {
        System.out.println("枚举方法实现单例");
    }
}
