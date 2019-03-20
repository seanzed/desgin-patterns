package com.sean.study.mediator;

/**
 * @Description: 中介者模式测试类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 19:01
 * @Version: 1.0
 */
public class MediatorTest {

    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(concreteColleague1);
        mediator.setColleague2(concreteColleague2);

        concreteColleague1.send("吃饭了没");
        concreteColleague2.send("没有呢， 你打算请客？");
    }
}
