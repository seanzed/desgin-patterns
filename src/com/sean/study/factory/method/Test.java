package com.sean.study.factory.method;

import com.sean.study.factory.simple.Shape;

/**
 * 工厂方法测试类
 */
public class Test {

    public static void main(String[] args) {
        // 测试圆形绘图
        Factory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();

        // 测试正方形绘图
        Factory squareFactory = new SquareFactory();
        Shape square = squareFactory.getShape();
        square.draw();
    }
}
