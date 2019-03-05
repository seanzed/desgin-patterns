package com.sean.study.factory.abstractmethod;

/**
 * M416子弹类
 */
public class M416_Bullet implements Bullet {

    @Override
    public void load() {
        System.out.println("load bullet with M416");
    }
}
