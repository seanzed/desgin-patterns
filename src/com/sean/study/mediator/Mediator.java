package com.sean.study.mediator;

/**
 * @Description: 中介接口类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 18:46
 * @Version: 1.0
 */
public interface Mediator {

    void send(String message, Colleague colleague);
}
