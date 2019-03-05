package com.sean.study.factory.abstractmethod;

/**
 * AK枪械
 */
public class AK implements Gun {

    @Override
    public void shooting() {
        System.out.println("shooting with AK");
    }
}
