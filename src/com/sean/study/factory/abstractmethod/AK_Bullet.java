package com.sean.study.factory.abstractmethod;

/**
 * AK子弹类
 */
public class AK_Bullet implements Bullet {

    @Override
    public void load() {
        System.out.println("load bullet with AK");
    }
}
