package com.sean.study.factory.simple;

/**
 * 简单工厂创建类
 * 简单工厂模式角色分配：
 *      工厂(Factory)角色 :简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
 *      抽象产品(Product)角色 :简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
 *      具体产品(Concrete Product)角色:简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。
 */
public class ShapeFactory {


    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if ("CIRCLE".equals(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equals(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equals(shapeType)) {
            return new Square();
        }

        return null;
    }
}
