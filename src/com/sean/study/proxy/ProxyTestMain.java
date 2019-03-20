package com.sean.study.proxy;

/**
 * @Description: 动态代理测试类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:03
 * @Version: 1.0
 */
public class ProxyTestMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        testStaticProxy();
		testJDKProxy();
    }

    private static void testStaticProxy() {
        Request req = new HttpRequest();
        RequestStaticProxy proxy = new RequestStaticProxy(req);
        proxy.request();
    }

    private static void testJDKProxy() {
        Request req = new HttpRequest();
        JDKProxy proxy = new JDKProxy();
        Request reqProxy = (Request) proxy.createProxy(req);
        reqProxy.request();
    }

}
