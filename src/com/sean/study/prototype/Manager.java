package com.sean.study.prototype;

import java.util.HashMap;

/**
 * @Description: Manager类使用Product接口来复制实例
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-17 17:37
 * @Version: 1.0
 */
public class Manager {

    /**
     * 保存实例的“名字”和“实例”之间的对应关系
     */
    private HashMap<String, Product> showcase=new HashMap<>();
    /**
     * @Description register方法将接收到的一组“名字”和“Product接口”注册到showcase中。
     * @Author seanchen
     * @Date 2019/1/17 17:39
     * @param name
     * @param product
     * @return void
     **/
    public void register(String name ,Product product){
        showcase.put(name, product);
    }
    
    /**
     * @Description “Product”产生类 
     * @Author seanchen
     * @Date 2019/1/17 17:40
     * @param productname
     * @return com.sean.study.prototype.Product
     **/
    public Product create(String productname){
        Product p=showcase.get(productname);
        return p.creatClone();
    }

}
