package com.sean.study.builder;

/**
 * @Description: 具体建造者
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-20 10:45
 * @Version: 1.0
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("组件A装配完成");
        System.out.println("组件A装配完成");
    }

    @Override
    public void buildPartB() {
        product.setPartB("组件B装配完成");
        System.out.println("组件B装配完成");
    }

    @Override
    public void buildPartC() {
        product.setPartC("组件C装配完成");
        System.out.println("组件C装配完成");
    }
}
