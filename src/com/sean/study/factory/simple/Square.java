package com.sean.study.factory.simple;

/**
 * 绘图接口实现类， 正方形
 */
public class Square implements Shape {

    public Square() {
        System.out.println("init Square");
    }
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
