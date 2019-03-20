package com.sean.study.templatemethod;

/**
 * @Description: 模板方法抽象类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:25
 * @Version: 1.0
 */
public abstract class AbstractClass {

    /**
     * 原语操作1，所谓原语操作就是抽象的操作，必须要由子类提供实现
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 原语操作2
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod(){
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
