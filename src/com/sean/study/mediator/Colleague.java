package com.sean.study.mediator;

/**
 * @Description: 同事抽象类类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:48
 * @Version: 1.0
 */
public abstract class Colleague {

    public Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void notify(String message);
}
