package com.sean.study.factory.method;

import com.sean.study.factory.simple.Shape;

/**
 * 1. 介绍：在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，而是针对不同的对象提供不同的工厂。
 * 也就是说 每个对象都有一个与之对应的工厂 。
 *
 * 2. 适用场景
 *      2.1 一个类不知道它所需要的对象类： 在工厂方法模式中， 客户端不需要知道具体产品类的类名， 只需要知道所对应的工厂即可， 具体
 *      的产品对象由具体工厂类创建； 客户端需要知道创建具体产品的类
 *      2.2 一个类通过其子类来指定创建哪个对象： 在工厂方法中， 对于抽象工厂类只需要提供一个创建产品的接口， 而由其子类来确定具体
 *      要创建的对象， 利用面向对象的多态性和里氏替换原则
 *      2.3 将创建对象的任务委派给多个工厂子类中的某一个， 客户端在使用时可以无需关心是那一个工厂子类创建产品子类， 需要时再动态
 *      指定， 可将具体工厂类的类名存储在配置文件中或数据库中。
 * 3. 工厂方法模式角色分配：
 *      3.1 抽象工厂(Abstract Factory)角色：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
 *      3.2 具体工厂(Concrete Factory)角色 ：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用
 *      以创建某一种产品对象。
 *      3.3 抽象产品(Abstract Product)角色： 工厂方法模式所创建的对象超类， 也就是产品对象的共同父类或者共同拥有的接口
 *      3.4 具体产品(Concrete Product)角色： 这个角色实现了抽象产品角色所定义的接口。 某具体产品有专门的具体工厂创建， 他们往往一
 *      一对应
 */
public interface Factory {
    Shape getShape();
}
