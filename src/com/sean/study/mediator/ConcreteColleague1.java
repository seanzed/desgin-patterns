package com.sean.study.mediator;

/**
 * @Description: 具体同事类1
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:51
 * @Version: 1.0
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事1发送消息： " + message);
    }
}
