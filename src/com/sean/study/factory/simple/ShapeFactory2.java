package com.sean.study.factory.simple;

/**
 * 利用反射解决简单工厂每次增加新了产品类都要修改产品工厂的弊端
 */
public class ShapeFactory2 {

    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;

        if (clazz == null) {
            return null;
        }

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
