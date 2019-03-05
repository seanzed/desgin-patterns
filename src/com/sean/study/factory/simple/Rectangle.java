package com.sean.study.factory.simple;

/**
 * 绘图接口实现类， 长方形
 */
public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("init Ractangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Ractangle");
    }
}
