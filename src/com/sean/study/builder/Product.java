package com.sean.study.builder;

/**
 * @Description: 产品类
 * @Author：sean.chen.dev@gmail.com
 * @Date： 2019-01-20 10:39
 * @Version: 1.0
 */
public class Product {

    /**
     * 步骤A属性
     */
    private String partA;

    /**
     * 步骤B属性
     */
    private String partB;

    /**
     * 步骤C属性
     */
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
