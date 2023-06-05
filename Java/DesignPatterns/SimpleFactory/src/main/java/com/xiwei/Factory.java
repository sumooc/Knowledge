package com.xiwei;

/**
 * 工厂类
 * 在没有工厂类之前，客户端一般会使用new关键字来直接创建产品对象，而在引入工厂类之后，客户端可以通过工厂类来创建产品。
 */
public class Factory {
    // 静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            product.methodSame();
            product.methodDiff();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            product.methodSame();
            product.methodDiff();
        }
        return product;
    }
}
