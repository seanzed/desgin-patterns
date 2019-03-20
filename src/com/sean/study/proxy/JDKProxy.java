package com.sean.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 接口代理
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-03-20 17:53
 * @Version: 1.0
 */
public class JDKProxy implements InvocationHandler {

    private Object target;

    public Object createProxy(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
            target.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param proxy     需要代理的类
     * @param method    调用的方法
     * @param args      方法调用时所需要的参数可以将InvocationHandler接口的子类想象成一个代理的最终操作类，替换掉ProxySubject
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        if (args != null) {
            // 打印参数列表
            System.out.println("方法有  " + args.length + "    个参数");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
        // 利用反射机制动态调用原对象方法
        Object result = method.invoke(target, args);
        doAfter();
        return result;
    }

    public void doAfter() {
        System.out.println("jdk after method invoke");
    }

    public void doBefore() {
        System.out.println("jdk before method invoke");
    }
}
