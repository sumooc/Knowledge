package com.xiwei;

/**
 * 抽象产品类
 * 将所有产品类公共的代码移至抽象产品类，并在抽象产品类中声明一些抽象方法，以供不同的具体产品类来实现。
 */
public abstract class Product {
    // 所有产品类的公共业务方法
    public void methodSame() {
        // 业务方法的具体实现
        System.out.println("所有产品类的公共业务方法.");
    }

    // 抽象业务方法
    public abstract void methodDiff();
}
