package com.sean.study.factory.simple;

/**
 * 简单工厂测试类
 * 测试利用反射创建类
 */
public class Test2 {

    public static void main(String[] args) {
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = (Shape) ShapeFactory2.getClass(Circle.class);
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = (Shape) ShapeFactory2.getClass(Rectangle.class);
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = (Shape) ShapeFactory2.getClass(Square.class);
        square.draw();
    }
}
