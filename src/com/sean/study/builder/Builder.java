package com.sean.study.builder;


/**
 *
 * @Description: 建造者抽象类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-20 10:36
 * @Version: 1.0
 */
public abstract class Builder {

    public Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResuit() {
        return product;
    }


}
