package com.xiwei;

/**
 * 在具体产品类中实现了抽象产品类中声明的抽象业务方法，不同的具体产品类可以提供不同的实现。
 */
public class ConcreteProductA extends Product{
    @Override
    public void methodDiff() {
        // 业务方法的具体实现
        System.out.println("Product抽象业务方法的具体实现，ConcreteProductA。");
    }
}
