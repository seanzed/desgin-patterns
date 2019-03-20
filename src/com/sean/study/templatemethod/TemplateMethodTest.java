package com.sean.study.templatemethod;

/**
 * 1、模板方法模式的本质
 *
 *       1.1 模板方法模式的本质：固定算法骨架。
 *
 *       1.2 模板方法模式主要是通过制定模板，把算法步骤固定下来，至于谁来实现，模板可以自己实现，也可以由子类去实现，
 *       还可以通过回调机制让其它类来实现。
 *
 *       1.3 通过固定算法骨架来约束子类的行为，并在特定的扩展点来让子类进行功能扩展，从而让程序既有很好的复用性，
 *       又有较好的扩展性。
 *
 * 2、对设计原则的体现
 *
 *       2.1 模板方法很好的体现了开闭原则和里氏替换原则。
 *
 *       2.2 首先从设计上分离变与不变，然后把不变的部分抽取出来，定义到父类中，比如算法骨架，一些公共的、固定的实现等。
 *       这些不变的部分被封闭起来，尽量不去修改它们，要想扩展新的功能，那就使用子类来扩展，通过子类来实现可变化的步
 *       骤，对于这种新增功能的做法是开放。
 * @Description: 模板方法测试类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:28
 * @Version: 1.0
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
