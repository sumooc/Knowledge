package com.xiwei;

/**
 * ConcreteProduct产品的实现类
 * IDog接口的实现类
 */
public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The black dog is eating!");
    }
}
