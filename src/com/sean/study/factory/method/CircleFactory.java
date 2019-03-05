package com.sean.study.factory.method;

import com.sean.study.factory.simple.Circle;
import com.sean.study.factory.simple.Shape;

/**
 * 工厂接口实现类，圆形工厂
 */
public class CircleFactory implements Factory {


    @Override
    public Shape getShape() {
        return new Circle();
    }
}
