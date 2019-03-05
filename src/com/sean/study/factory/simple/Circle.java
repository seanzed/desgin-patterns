package com.sean.study.factory.simple;

/**
 * 形状实现类， 圆形
 */
public class Circle implements Shape {

    public Circle() {
        System.out.println("init Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
