package com.sean.study.proxy;

/**
 * @Description: Request 静态搭理类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 17:48
 * @Version: 1.0
 */
public class RequestStaticProxy {

    private Request request;

    public RequestStaticProxy(Request request) {
        this.request = request;
    }

    public void request() {
        doBefore();
        request.request();
        doAfter();
    }

    public void doAfter() {
        System.out.println("static after method invoke");
    }

    public void doBefore() {
        System.out.println("static before method invoke");
    }

}
