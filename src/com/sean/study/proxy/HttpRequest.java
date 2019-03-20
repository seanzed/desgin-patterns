package com.sean.study.proxy;

/**
 * @Description: Request接口实现类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 17:46
 * @Version: 1.0
 */
public class HttpRequest implements Request {

    @Override
    public void request() {
        System.out.println("http request ......");
    }
}
