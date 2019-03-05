package com.sean.study.factory.abstractmethod;

/**
 * M416枪械
 */
public class M416 implements Gun {

    @Override
    public void shooting() {
        System.out.println("shooting with M416");
    }
}
