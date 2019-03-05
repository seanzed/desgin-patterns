package com.sean.study.adpater;

/**
 * 1. 定义：将一个类的接口转换成客户希望的另外一个接口。 Adapter使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * 2. 适用场景
 *      2.1 适用于系统的数据和行为都正确， 但接口不符合时， 我们应考虑使用适配器， 目的是使控制范围之外的一个原有对象与某
 *      个接口匹配。 适配器模式主要应用于希望复用一些现存的类， 但是接口又与复用环境要求不一致的情况。
 * @Description: 适配器类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-02-13 15:18
 * @Version: 1.0
 */
public class Adapter implements Target {
    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
