package com.sean.study.templatemethod;

/**
 * @Description: 模板方法具体实现类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:26
 * @Version: 1.0
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void doPrimitiveOperation1() {
        System.out.println("具体操作1");
    }

    @Override
    public void doPrimitiveOperation2() {
        System.out.println("具体操作2");
    }
}
