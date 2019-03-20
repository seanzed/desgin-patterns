package com.sean.study.mediator;

/**
 * @Description: 中介者具体实现类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:57
 * @Version: 1.0
 */
public class ConcreteMediator implements Mediator {

    private ConcreteColleague1 colleague1;

    private ConcreteColleague2 colleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague1.notify(message);
        } else {
            colleague2.notify(message);
        }

    }

    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
}
