package com.sean.study.prototype;

/**
 * 1. 定义： 用原型实例指定创建对象的种类， 并且通过拷贝这些原型创建新的对象。
 *
 * 2. 适用场景：
 *      2.1 对象种类繁多，无法将他们整合到一个类的时候;
 *      2.2 难以根据类生成实例;
 *      2.3 想解耦框架与生成的实例时;
 *
 *
 * @Description: 原型模式父类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-17 17:25
 * @Version: 1.0
 */
public interface Product extends Cloneable {

    /**
     * @Description use方法是用于“使用”的方法，具体怎么“使用”，则被交给子类去实现。
     * @Author seanchen
     * @Date 2019/1/17 17:27
     * @param s
     * @return void
     **/
    void use(String s);

    /**
     * @Description creatClone方法是用于复制实例的方法
     * @Author seanchen
     * @Date 2019/1/17 17:27
     * @param
     * @return com.sean.study.prototype.Product
     **/
    Product creatClone();
}
