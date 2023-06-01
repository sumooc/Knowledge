package com.xiwei;

/**
 * ConcreteProduct产品的实现类
 * ICat接口的实现类
 */
public class BlackCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
