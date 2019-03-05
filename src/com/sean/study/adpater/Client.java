package com.sean.study.adpater;

/**
 * @Description: 测试类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-02-13 15:19
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //请求处理
        target.request();
    }
}
