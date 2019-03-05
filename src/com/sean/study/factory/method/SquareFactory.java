package com.sean.study.factory.method;

import com.sean.study.factory.simple.Shape;
import com.sean.study.factory.simple.Square;

/**
 * 工厂实现类， 正方形工厂
 */
public class SquareFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Square();
    }
}
