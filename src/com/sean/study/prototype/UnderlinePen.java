package com.sean.study.prototype;

/**
 * @Description: 下划线样式的具体原型
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-17 18:54
 * @Version: 1.0
 */
public class UnderlinePen implements Product {

    /**
     * 保存的是装饰方框使用的字符样式
     */
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulchar);

        }
        System.out.println("");
    }

    @Override
    public Product creatClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
