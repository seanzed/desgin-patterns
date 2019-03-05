package com.sean.study.prototype;

/**
 * @Description: 原型模式测试类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-17 18:58
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("Strong message", underlinePen);
        manager.register("Waring Box", mbox);
        manager.register("Slash Box", sbox);
        Product p1=manager.create("Strong message");
        p1.use("hello world");
        Product p2=manager.create("Waring Box");
        p2.use("hello world");
        Product p3=manager.create("Slash Box");
        p3.use("hello world");
    }
}
