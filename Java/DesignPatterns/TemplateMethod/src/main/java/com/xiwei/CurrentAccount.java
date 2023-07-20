package com.xiwei;

/**
 * 活期账户类：具体子类
 */
public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        // 覆盖父类的抽象基本方法
        System.out.println("按活期利率计算利息！");
    }
}
