package com.sean.study.factory.abstractmethod;

/**
 * 生产AK和AK子弹生产工厂
 */
public class AK_Factory implements Factory {

    @Override
    public Gun produceGun() {
        return new AK();
    }

    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }
}
