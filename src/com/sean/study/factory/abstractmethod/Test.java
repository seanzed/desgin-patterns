package com.sean.study.factory.abstractmethod;

/**
 * 抽象工厂方法测试类
 */
public class Test {

    public static void main(String[] args) {
        Factory factory;
        Gun gun;
        Bullet bullet;

        factory =new AK_Factory();
        bullet=factory.produceBullet();
        bullet.load();
        gun=factory.produceGun();
        gun.shooting();
    }
}
