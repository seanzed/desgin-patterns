package com.sean.study.factory.method;

import com.sean.study.factory.simple.Rectangle;
import com.sean.study.factory.simple.Shape;

/**
 * 工厂接口实现类， 长方形工厂
 */
public class RectangleFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
