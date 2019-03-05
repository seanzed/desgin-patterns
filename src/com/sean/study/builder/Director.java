package com.sean.study.builder;

/**
 * @Description: 指挥类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-20 10:48
 * @Version: 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResuit();
    }
}
