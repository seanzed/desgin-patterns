package com.sean.study.factory.abstractmethod;

/**
 * M416和M416子弹生产工厂
 */
public class M416_Factory implements Factory {

    @Override
    public Gun produceGun() {
        return new M416();
    }

    @Override
    public Bullet produceBullet() {
        return new M416_Bullet();
    }
}
