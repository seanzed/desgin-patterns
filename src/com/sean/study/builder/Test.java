package com.sean.study.builder;

/**
 * @Description: 建造者模式测试类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-20 10:50
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        Builder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        director.construct();
    }

}
